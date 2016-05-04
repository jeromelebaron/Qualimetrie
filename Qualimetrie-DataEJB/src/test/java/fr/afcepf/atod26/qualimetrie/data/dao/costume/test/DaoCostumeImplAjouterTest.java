/**
 * Créé le 4 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.dao.costume.test;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import fr.afcepf.atod26.qualimetrie.data.IDaoCostume;
import fr.afcepf.atod26.qualimetrie.data.impl.DaoCostumeImpl;
import fr.afcepf.atod26.qualimetrie.entity.Costume;
import fr.afcepf.atod26.qualimetrie.entity.Pouvoir;
import fr.afcepf.atod26.qualimetrie.entity.SuperHero;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException;

/**
 * Pour tester les méthodes d'ajout d'un {@link Costume}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@RunWith(Arquillian.class)
public class DaoCostumeImplAjouterTest {

    /**
     * Pour déployer les éléments nécessaires aux tests.
     * @return une archive jar.
     */
    @Deployment
    public static JavaArchive createDeployement() {
        JavaArchive javaArchive = ShrinkWrap.create(JavaArchive.class, "archive.jar");
        javaArchive.addClass(IDaoCostume.class);
        javaArchive.addClass(DaoCostumeImpl.class);
        javaArchive.addClass(Costume.class);
        javaArchive.addClass(SuperHero.class);
        javaArchive.addClass(Pouvoir.class);
        javaArchive.addClass(SuperHeroException.class);
        javaArchive.addAsManifestResource("persistence-test.xml",
                ArchivePaths.create("persistence.xml"));
        javaArchive.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        javaArchive.addAsResource("import.sql");
        return javaArchive;
    }

    /**
     * L'instance pour faire le test.
     */
    @EJB
    private IDaoCostume daoCostume;
    /**
     * L'id d'un {@link SuperHero} existant.
     */
    private final int idHerosExiste = 3;
    /**
     * Un {@link SuperHero} qui existe dans la bdd.
     */
    private SuperHero superHeroExiste = new SuperHero(idHerosExiste, null, null, null);
    /**
     * L'id d'un {@link SuperHero} n'existant pas.
     */
    private final int idHerosExistePas = 150000;
    /**
     * Un {@link SuperHero} qui n'existe pas dans la bdd.
     */
    private SuperHero superHeroExistePas = new SuperHero(idHerosExistePas, null, null, null);
    /**
     * Le {@link Costume} à ajouter pour le test.
     */
    private Costume capeDeThor = new Costume("blanc", false, "Cape de Thor", superHeroExiste);
    /**
     * Le {@link Costume} qui lèvera une erreur.
     */
    private Costume costumeErreur = new Costume("blanc", false, "Cape de Thor", superHeroExistePas);
    /**
     * L'id retournée après ajout du {@link Costume}.
     */
    private final Integer idCapeThor = 4;

    /**
     * Test du cas nominal.
     * @throws SuperHeroException levée en cas d'erreur.
     */
    @Test
    public void testAjouterCostumeNominal() throws SuperHeroException {
        final Costume costumeRetour = daoCostume.ajouterCostume(capeDeThor);
        Assert.assertNotNull(costumeRetour);
        Assert.assertEquals(idCapeThor, costumeRetour.getIdCostume());
    }

    /**
     * Test de la levée d'exception.
     */
    @Test
    public void testAjouterCostumeException() {
        try {
            daoCostume.ajouterCostume(costumeErreur);
            Assert.fail("Exception non levée");
        } catch (SuperHeroException e) {
            Assert.assertTrue("Exception levée, tout est ok", true);
            e.printStackTrace();
        }
    }
}
