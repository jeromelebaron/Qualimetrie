/*
 * Créé le 2 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.dao.superhero.test;

import java.io.IOException;

/**
 * Pour tester le fonctionnement du script.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public final class TestGenerationBDD {

    /**
     * Constructeur privé.
     */
    private TestGenerationBDD() {
        // EMPTY
    }

    /**
     * @param args arguments.
     */
    public static void main(String[] args) {
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

}
