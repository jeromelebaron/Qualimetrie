/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.dao.test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
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
     * L'id généré après insertion du {@link SuperHero} dans la bdd.
     */
    private final int dernierId = 14;
    /**
     * L'instance pour les tests.
     */
    private IDaoSuperHero daoSuperHero = null;
    /**
     * Le {@link SuperHero} pour le cas nominal.
     */
    private SuperHero superHeroNominal = new SuperHero("Kent", "Clark", "SuperMan");
    /**
     * Le {@link SuperHero} retour du cas nominal.
     */
    private SuperHero superHeroNominalRetour = new SuperHero(dernierId, "Kent", "Clark", "SuperMan");
    /**
     * Le {@link SuperHero} pour le cas nom null.
     */
    private SuperHero superHeroNomNull = new SuperHero(null, "Clark", "SuperMan");
    /**
     * Le {@link SuperHero} pour le cas nom trop long.
     */
    private SuperHero superHeroNomTropLong = new SuperHero(
            "Kentkjbqrgbkyubqregklubkyuvqezflbkuyvqregkyubdsthrtsfhstrhrtshsrthsrthsrthstr",
            "Clark", "SuperMan");
    /**
     * Pour faire du log.
     */
    private final Logger logger = Logger.getLogger(getClass());

    /**
     * Pour charger l'instance du dao.
     */
    @Before
    public void init() {
        daoSuperHero = new DaoSuperHeroImpl();
    }

    /**
     * {@inheritDoc}
     */
    @Test
    public void testAjouterSuperHeroNominal() {
        try {
            SuperHero superHeroRetour = daoSuperHero.ajouterSuperHero(superHeroNominal);
            Assert.assertNotNull(superHeroRetour);
            Assert.assertNotNull(superHeroRetour.getNom());
            Assert.assertNotNull(superHeroRetour.getPrenom());
            Assert.assertNotNull(superHeroRetour.getSuperNom());
            Assert.assertNotNull(superHeroRetour.getIdSuperHero());
            Assert.assertNull(superHeroRetour.getLesCostumes());
            Assert.assertNull(superHeroRetour.getLesPouvoirs());
            Assert.assertEquals("Vérification de l'insertion d'un super héros",
                    superHeroRetour.getIdSuperHero(), superHeroNominalRetour.getIdSuperHero());
            Assert.assertEquals("Vérification de la non altération du nom",
                    superHeroNominalRetour.getNom(), superHeroRetour.getNom());
            Assert.assertEquals("Vérification de la non altération du prénom",
                    superHeroNominalRetour.getPrenom(), superHeroRetour.getPrenom());
            Assert.assertEquals("Vérification de la non altération du super nom",
                    superHeroNominalRetour.getSuperNom(), superHeroRetour.getSuperNom());
        } catch (SuperHeroException e) {
            logger.error(e);
        }
    }

    /**
     * Pour vérifier qu'une exception est lévée lors d'un nom null.
     */
    @Test
    public void testErreurNomNull() {
        try {
            daoSuperHero.ajouterSuperHero(superHeroNomNull);
            Assert.fail("Test echoué");
        } catch (SuperHeroException e) {
            Assert.assertTrue("Exception levée donc tout va bien", true);
            logger.error(e);
        }
    }

    /**
     * Pour vérifier qu'une exception est levée lors d'un nom trop long.
     * @throws SuperHeroException exception levée lors du nom trop long.
     */
    @Test(expected = SuperHeroException.class)
    public void testNomTropLong() throws SuperHeroException {
        daoSuperHero.ajouterSuperHero(superHeroNomTropLong);
    }

}
