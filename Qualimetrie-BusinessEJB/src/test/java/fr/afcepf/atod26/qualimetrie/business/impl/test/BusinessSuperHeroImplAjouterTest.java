/**
 * Créé le 2 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.business.impl.test;

import org.junit.Assert;
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
    private IBusinessSuperHero businessSuperHero;
    /**
     * L'id généré après insertion.
     */
    private final int idSuivantSuperHero = 5;
    /**
     * Le super héros à ajouter.
     */
    private SuperHero superHeroNominal = new SuperHero("Existe", "Pas", "Anonymous");
    /**
     * Le super héros ajouté qui doit etre retourné après ajout.
     */
    private SuperHero superHeroNominalRetour = new SuperHero(idSuivantSuperHero, "Existe", "Pas",
            "Anonymous");
    /**
     * Le {@link SuperHero} qui existe.
     */
    private SuperHero superHeroExiste = new SuperHero(2, "Wayne", "Bruce", "Batman");
    /**
     * Un super héros avec un paramètre null.
     */
    private SuperHero superHeroParamNull = new SuperHero(null, "Null", "SuperNull");

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
            Assert.fail("Test echousé");
        } catch (SuperHeroException e) {
            Assert.assertEquals(SuperErrorCode.NOM_EXISTE_DEJA, e.getSuperErrorCode());
        }
    }

    /**
     * Pour l'ajout avec un paramètre null.
     * @throws SuperHeroException levée si un paramètre est null.
     */
    @Test(expected = SuperHeroException.class)
    public void testAjouterSuperHeroParamNull() {
        try {
            businessSuperHero.ajouterSuperHero(superHeroParamNull);
            Assert.fail("Test échoué");
        } catch (SuperHeroException e) {
            Assert.assertEquals(SuperErrorCode.ERREUR_AJOUT_SUPER_HEROS, e.getSuperErrorCode());
        }
    }

}
