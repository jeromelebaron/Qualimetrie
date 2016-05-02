/**
 * Créé le 2 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.business.impl.test;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.afcepf.atod26.qualimetrie.business.IBusinessSuperHero;
import fr.afcepf.atod26.qualimetrie.entity.SuperHero;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException.SuperErrorCode;

/**
 * Pour les tests d'ajout du business.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class BusinessSuperHeroImplAjouterTest {

    /**
     * L'instance à tester.
     */
    private static IBusinessSuperHero businessSuperHero;
    /**
     * L'id généré après insertion.
     */
    private static final int ID_SUIVANT_SUPER_HERO = 5;
    /**
     * Le super héros à ajouter.
     */
    private static SuperHero superHeroNominal = new SuperHero("Existe", "Pas", "Anonymous");
    /**
     * Le super héros ajouté qui doit etre retourné après ajout.
     */
    private static SuperHero superHeroNominalRetour = new SuperHero(ID_SUIVANT_SUPER_HERO,
            "Existe", "Pas", "Anonymous");
    /**
     * Le {@link SuperHero} qui existe.
     */
    private static SuperHero superHeroExiste = new SuperHero(2, "Wayne", "Bruce", "Batman");
    /**
     * Un super héros avec un paramètre null.
     */
    private static SuperHero superHeroParamNull = new SuperHero(null, "Null", "SuperNull");

    /**
     * Avant tous les tests.
     */
    @BeforeClass
    public static void initAllTests() {
        businessSuperHero = new IBusinessSuperHero() {

            @Override
            public List<SuperHero> recupererTousLesSuperHero() {
                return null;
            }

            @Override
            public List<SuperHero> rechercherSuperHeroParNom(String paramNom) {
                return null;
            }

            @Override
            public SuperHero ajouterSuperHero(SuperHero paramSuperHero) throws SuperHeroException {
                if (paramSuperHero.getNom() == null) {
                    throw new SuperHeroException("", SuperErrorCode.ERREUR_AJOUT_SUPER_HEROS);
                }
                if ("Batman".equals(paramSuperHero.getSuperNom())) {
                    throw new SuperHeroException("", SuperErrorCode.NOM_EXISTE_DEJA);
                }
                return superHeroNominalRetour;
            }
        };
    }

    /**
     * Pour l'ajout du cas nominal.
     * @throws SuperHeroException exception levée.
     */
    @Test
    public void testAjouterSuperHeroNominal() throws SuperHeroException {
        final SuperHero superHeroRetour = businessSuperHero.ajouterSuperHero(superHeroNominal);
        Assert.assertNotNull(superHeroRetour);
        Assert.assertNotNull(superHeroRetour.getIdSuperHero());
        Assert.assertNotNull(superHeroRetour.getNom());
        Assert.assertNotNull(superHeroRetour.getPrenom());
        Assert.assertNotNull(superHeroRetour.getSuperNom());
        Assert.assertNull(superHeroRetour.getLesCostumes());
        Assert.assertNull(superHeroRetour.getLesPouvoirs());
        Assert.assertEquals(superHeroNominalRetour.getIdSuperHero(),
                superHeroRetour.getIdSuperHero());
        Assert.assertEquals(superHeroNominalRetour.getNom(), superHeroRetour.getNom());
        Assert.assertEquals(superHeroNominalRetour.getPrenom(), superHeroRetour.getPrenom());
        Assert.assertEquals(superHeroNominalRetour.getSuperNom(), superHeroRetour.getSuperNom());
    }

    /**
     * Pour un ajout si le nom existe déjà.
     */
    @Test
    public void testAjouterSuperHeroNomExiste() {
        try {
            businessSuperHero.ajouterSuperHero(superHeroExiste);
            Assert.fail("Test echoué");
        } catch (SuperHeroException e) {
            Assert.assertEquals(SuperErrorCode.NOM_EXISTE_DEJA, e.getSuperErrorCode());
        }
    }

    /**
     * Pour l'ajout avec un paramètre null.
     */
    @Test
    public void testAjouterSuperHeroParamNull() {
        try {
            businessSuperHero.ajouterSuperHero(superHeroParamNull);
            Assert.fail("Test échoué");
        } catch (SuperHeroException e) {
            Assert.assertEquals(SuperErrorCode.ERREUR_AJOUT_SUPER_HEROS, e.getSuperErrorCode());
        }
    }

}
