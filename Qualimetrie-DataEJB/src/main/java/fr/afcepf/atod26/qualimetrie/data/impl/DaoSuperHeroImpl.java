/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.qualimetrie.commun.ParametreRequete;
import fr.afcepf.atod26.qualimetrie.data.IDaoSuperHero;
import fr.afcepf.atod26.qualimetrie.data.utils.DataSourceSuperHero;
import fr.afcepf.atod26.qualimetrie.entity.SuperHero;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException.SuperErrorCode;

/**
 * L'implémentation du dao du {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IDaoSuperHero.class)
@Stateless
public class DaoSuperHeroImpl implements IDaoSuperHero {

    /**
     * Pour insérer un {@link SuperHero} dans la bdd.
     */
    private static final String REQUETE_INSERT_SUPER_HERO = "INSERT INTO super_hero.super_hero "
            + "(nom, prenom, super_nom) VALUES (?, ?, ?)";
    /**
     * Pour récupérer tous les {@link SuperHero}.
     */
    private static final String REQUETE_GET_ALL_SUPER_HERO = "SELECT * "
            + "FROM super_hero.super_hero s WHERE s.super_nom LIKE ?";
    /**
     * La colonne portant l'id.
     */
    private static final String COLONE_ID_SUPER_HERO = "id_super_hero";
    /**
     * La colonne portant le nom.
     */
    private static final String COLONE_NOM_SUPER_HERO = "nom";
    /**
     * La colonne portant le prénom.
     */
    private static final String COLONE_PRENOM_SUPER_HERO = "prenom";
    /**
     * La colonne portant le super nom.
     */
    private static final String COLONE_SUPER_NOM_SUPER_HERO = "super_nom";
    /**
     * Pour récupérer les éléments nécessaires aux requetes.
     */
    private final DataSourceSuperHero dataSourceSuperHero = new DataSourceSuperHero();
    /**
     * La connexion à la bdd.
     */
    private Connection connection;
    /**
     * Pour faire du log.
     */
    private Logger logger = Logger.getLogger(getClass());

    /**
     * {@inheritDoc}
     */
    @Override
    public SuperHero ajouterSuperHero(final SuperHero paramSuperHero) throws SuperHeroException {
        logger.info("Méthode ajouterSuperHero");
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSourceSuperHero.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(REQUETE_INSERT_SUPER_HERO,
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(
                    ParametreRequete.PREMIER_PARAMETRE_REQUETE.getNumeroParametre(),
                    paramSuperHero.getNom());
            preparedStatement.setString(
                    ParametreRequete.SECOND_PARAMETRE_REQUETE.getNumeroParametre(),
                    paramSuperHero.getPrenom());
            preparedStatement.setString(
                    ParametreRequete.TROISIEME_PARAMETRE_REQUETE.getNumeroParametre(),
                    paramSuperHero.getSuperNom());
            final int nbLignesModifiees = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (nbLignesModifiees == 1 && resultSet.next()) {
                paramSuperHero.setIdSuperHero(resultSet.getInt(ParametreRequete.INDEX_ID_GENERE
                        .getNumeroParametre()));
            }
            connection.commit();
        } catch (SQLException e) {
            logger.error("Erreur avec la base de données");
            logger.error(e);
            throw new SuperHeroException(e.getMessage(), SuperErrorCode.ERREUR_AJOUT_SUPER_HEROS);
        } finally {
            fermerElements(preparedStatement);
        }
        return paramSuperHero;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<SuperHero> rechercherSuperHeroParSuperNom(final String paramSuperNom) {
        logger.info("Méthode rechercherSuperHeroParNom");
        List<SuperHero> lesSuperHeroTrouves = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSourceSuperHero.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(REQUETE_GET_ALL_SUPER_HERO);
            preparedStatement.setString(
                    ParametreRequete.PREMIER_PARAMETRE_REQUETE.getNumeroParametre(), "%"
                            + paramSuperNom + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                final SuperHero superHero = hydrateSuperHero(resultSet);
                lesSuperHeroTrouves.add(superHero);
            }
        } catch (SQLException e) {
            logger.error("Erreur avec la base de données");
            logger.error(e);
        } finally {
            fermerElements(preparedStatement);
        }
        return lesSuperHeroTrouves;
    }

    /**
     * Pour fermer la requete et la connexion à la bdd.
     * @param preparedStatement la requete à fermer.
     */
    private void fermerElements(final PreparedStatement preparedStatement) {
        try {
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            logger.error("Erreur dans les fermetures de connexions");
            logger.error(e);
        }
    }

    /**
     * Pour hydrater un {@link SuperHero} à partir d'une ligne de la bdd.
     * @param paramResultSet la ligne de la bdd.
     * @return un {@link SuperHero}.
     * @throws SQLException l'exception SQL.
     */
    private SuperHero hydrateSuperHero(final ResultSet paramResultSet) throws SQLException {
        final SuperHero superHero = new SuperHero();
        superHero.setIdSuperHero(paramResultSet.getInt(COLONE_ID_SUPER_HERO));
        superHero.setNom(paramResultSet.getString(COLONE_NOM_SUPER_HERO));
        superHero.setPrenom(paramResultSet.getString(COLONE_PRENOM_SUPER_HERO));
        superHero.setSuperNom(paramResultSet.getString(COLONE_SUPER_NOM_SUPER_HERO));
        return superHero;
    }

}
