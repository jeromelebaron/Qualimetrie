/*
 * Créé le 2 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.dao.test;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.afcepf.atod26.qualimetrie.data.IDaoSuperHero;
import fr.afcepf.atod26.qualimetrie.data.impl.DaoSuperHeroImpl;
import fr.afcepf.atod26.qualimetrie.entity.SuperHero;

/**
 * Pour tester les fonctionnalités liées à la recherche.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class DaoSuperHeroImplRechercherTest {

    /**
     * L'instance nécessaure pour le test.
     */
    private IDaoSuperHero daoSuperHero = new DaoSuperHeroImpl();
    /**
     * Le supernom qui existe.
     */
    private String superNomExiste = "Batman";
    /**
     * Le {@link SuperHero} qui existe.
     */
    private SuperHero superHeroRetourAttendu = new SuperHero(2, "Wayne", "Bruce", "Batman");
    /**
     * Le supernom qui n'existe pas.
     */
    private String superNomExistePas = "Luffy";
    /**
     * Taille de la liste attendue.
     */
    private final int tailleListeAttendue = 1;
    /**
     * Taille de la liste vide.
     */
    private final int tailleListeVide = 0;

    /**
     * Pour remettre à zéro la bdd.
     */
    @Before
    public void setUp() {
        try {
            String path = Thread.currentThread().getContextClassLoader()
                    .getResource("creabase.bat").getPath();
            Process process = Runtime.getRuntime().exec(path);
            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Pour vérifier la recherche par le super nom du {@link SuperHero} qui existe.
     */
    @Test
    public void testRechercherSuperHeroParSuperNomExiste() {
        List<SuperHero> lesSuperHero = daoSuperHero.rechercherSuperHeroParSuperNom(superNomExiste);
        Assert.assertNotNull(lesSuperHero);
        Assert.assertEquals(tailleListeAttendue, lesSuperHero.size());
        final SuperHero superHeroTrouve = lesSuperHero.get(0);
        Assert.assertNotNull(superHeroTrouve);
        Assert.assertEquals(superHeroRetourAttendu.getIdSuperHero(),
                superHeroTrouve.getIdSuperHero());
        Assert.assertEquals(superHeroRetourAttendu.getNom(), superHeroTrouve.getNom());
        Assert.assertEquals(superHeroRetourAttendu.getPrenom(), superHeroTrouve.getPrenom());
        Assert.assertEquals(superHeroRetourAttendu.getSuperNom(), superHeroTrouve.getSuperNom());
        Assert.assertNull(superHeroTrouve.getLesCostumes());
        Assert.assertNull(superHeroTrouve.getLesPouvoirs());
    }

    /**
     * Pour vérifier la recherche par le super nom du {@link SuperHero} qui n'existe pas.
     */
    @Test
    public void testRechercherSuperHeroParSuperNomExistePas() {
        List<SuperHero> lesSuperHero = daoSuperHero
                .rechercherSuperHeroParSuperNom(superNomExistePas);
        Assert.assertNotNull(lesSuperHero);
        Assert.assertEquals(tailleListeVide, lesSuperHero.size());
    }

}
