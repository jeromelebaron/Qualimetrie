/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.utils;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import javax.sql.DataSource;

/**
 * Pour la connexion à la bdd des super héros.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class DataSourceSuperHero implements DataSource {

    /**
     * Pour faire du log.
     */
    private static final Logger LOGGER = Logger
            .getLogger(DataSourceSuperHero.class);
    /**
     * URL de la bdd.
     */
    private static final String URL;
    /**
     * Login de connexion à la bdd.
     */
    private static final String LOGIN;
    /**
     * Mot de passe de connexion.
     */
    private static final String MOT_DE_PASSE;
    /**
     * Pour avoir la classe du driver.
     */
    private static final String DRIVER;

    static {
        LOGGER.info("Initilisation des éléments de la data source");
        final ResourceBundle resource = ResourceBundle.getBundle("dataSource");
        URL = resource.getString("db.url");
        LOGIN = resource.getString("db.login");
        MOT_DE_PASSE = resource.getString("db.mdp");
        DRIVER = resource.getString("db.driver");
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("Erreur avec le chargement du driver");
            LOGGER.error(e);
        }
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public java.util.logging.Logger getParentLogger()
            throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter paramArg0) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setLoginTimeout(int paramArg0) throws SQLException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isWrapperFor(Class<?> paramArg0) throws SQLException {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> paramArg0) throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection(String paramUsername, String paramPassword)
            throws SQLException {
        return null;
    }

}
