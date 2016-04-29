/*
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.utils.test;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.afcepf.atod26.qualimetrie.data.utils.DataSourceSuperHero;

/**
 * Pour test la connexion à la bdd.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class DataSourceSuperHeroTest {

    /**
     * Pour faire du log.
     */
    private Logger logger = Logger.getLogger(DataSourceSuperHeroTest.class);

    /**
     * La classe à tester.
     */
    private DataSourceSuperHero dataSourceSuperHero;

    /**
     * Pour initialiser les éléments avant les tests.
     */
    @Before
    public void init() {
        dataSourceSuperHero = new DataSourceSuperHero();
    }

    /**
     * Pour vérifier que l'on a bien une instance.
     */
    @Test
    public void notNull() {
        Assert.assertNotNull(dataSourceSuperHero);
    }

    /**
     * Pour tester la connexion.
     */
    @Test
    public void testGetConnection() {
        Connection connection = null;
        try {
            connection = dataSourceSuperHero.getConnection();
        } catch (SQLException e) {
            logger.error(e);
            fail("Erreur dans la récupération de la connection");
        }
        Assert.assertNotNull(connection);
    }

}
