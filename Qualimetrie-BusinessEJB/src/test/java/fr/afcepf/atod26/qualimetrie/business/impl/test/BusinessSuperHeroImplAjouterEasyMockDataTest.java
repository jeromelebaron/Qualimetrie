/**
 * Créé le 2 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.business.impl.test;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.afcepf.atod26.qualimetrie.business.IBusinessSuperHero;
import fr.afcepf.atod26.qualimetrie.business.impl.BusinessSuperHeroImpl;
import fr.afcepf.atod26.qualimetrie.data.IDaoSuperHero;
import fr.afcepf.atod26.qualimetrie.entity.SuperHero;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException.SuperErrorCode;

/**
 * Pour les tests d'ajout du business avec un framework de mock.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class BusinessSuperHeroImplAjouterEasyMockDataTest {

    /**
     * L'instance à tester.
     */
    private static IBusinessSuperHero businessSuperHero;
    /**
     * L'instance à mocker.
     */
    private static IDaoSuperHero daoSuperHeroMock;
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
     * @throws SuperHeroException levée en cas d'erreur.
     */
    @BeforeClass
    public static void initAllTests() throws SuperHeroException {
        businessSuperHero = new BusinessSuperHeroImpl();
        daoSuperHeroMock = EasyMock.createMock(IDaoSuperHero.class);
        EasyMock.expect(daoSuperHeroMock.ajouterSuperHero(superHeroNominal)).andReturn(
                superHeroNominalRetour);
        final SuperHeroException superHeroExceptionNomNull = new SuperHeroException("",
                SuperErrorCode.ERREUR_AJOUT_SUPER_HEROS);
        EasyMock.expect(
                daoSuperHeroMock.rechercherSuperHeroParSuperNom(superHeroNominal.getSuperNom()))
                .andReturn(new ArrayList<SuperHero>());
        EasyMock.expect(daoSuperHeroMock.ajouterSuperHero(superHeroParamNull)).andThrow(
                superHeroExceptionNomNull);
        EasyMock.expect(
                daoSuperHeroMock.rechercherSuperHeroParSuperNom(superHeroParamNull.getSuperNom()))
                .andReturn(new ArrayList<SuperHero>());
        final List<SuperHero> listeRemplie = new ArrayList<SuperHero>();
        listeRemplie.add(superHeroExiste);
        EasyMock.expect(
                daoSuperHeroMock.rechercherSuperHeroParSuperNom(superHeroExiste.getSuperNom()))
                .andReturn(listeRemplie);
        ((BusinessSuperHeroImpl) businessSuperHero).setDaoSuperHero(daoSuperHeroMock);
        EasyMock.replay(daoSuperHeroMock);
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

    /**
     * Pour vérifier que nous sommes bien passés dans toutes les méthodes attendues du mock.
     */
    @AfterClass
    public static void closeTests() {
        EasyMock.verify(daoSuperHeroMock);
    }

}
