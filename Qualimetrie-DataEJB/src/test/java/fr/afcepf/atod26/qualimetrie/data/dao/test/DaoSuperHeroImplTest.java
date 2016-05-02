/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.dao.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import fr.afcepf.atod26.qualimetrie.data.IDaoSuperHero;
import fr.afcepf.atod26.qualimetrie.data.impl.DaoSuperHeroImpl;
import fr.afcepf.atod26.qualimetrie.entity.SuperHero;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException;

/**
 * Les tests de la classe.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class DaoSuperHeroImplTest {

    /**
     * L'instance pour les tests.
     */
    private IDaoSuperHero daoSuperHero;

    /**
     * Pour charger l'instance du dao.
     */
    @Before
    public void init() {
        daoSuperHero = new DaoSuperHeroImpl();
    }

    /**
     * Pour vérifier que l'instance n'est pas null.
     */
    @Test
    public void notNull() {
        Assert.assertNotNull(daoSuperHero);
    }

    /**
     * {@inheritDoc}
     */
    @Ignore
    @Test
    public void testAjouterSuperHero() {
        SuperHero superHero = new SuperHero("Kent", "Clark", "SuperMan");

        int idGenere;
        try {
            idGenere = daoSuperHero.ajouterSuperHero(superHero).getIdSuperHero();
            int idAttendu = 1;
            Assert.assertEquals("Vérification de l'insertion d'un super héros", idAttendu, idGenere);
        } catch (SuperHeroException e) {
            e.printStackTrace();
        }

    }

    /**
     * {@inheritDoc}
     */
    @Test
    public void testRechercherSuperHeroParNom() {
        List<SuperHero> lesSuperHero = daoSuperHero.rechercherSuperHeroParNom("SuperMan");

        int tailleListeGeneree = lesSuperHero.size();
        int tailleAttendue = 1;
        Assert.assertEquals("Vérification de la récupération de tous les super héros",
                tailleAttendue, tailleListeGeneree);
    }

}
