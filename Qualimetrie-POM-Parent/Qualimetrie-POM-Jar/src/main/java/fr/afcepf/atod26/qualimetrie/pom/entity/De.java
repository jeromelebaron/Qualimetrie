/**
 * Créé le 3 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.pom.entity;

import java.io.Serializable;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class De implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private int nbFaces = 6;

    public De() {
        // EMPTY
    }

    public De(int paramNbFaces) {
        nbFaces = paramNbFaces;
    }

    /**
     * Accesseur en lecture du champ <code>nbFaces</code>.
     * @return le champ <code>nbFaces</code>.
     */
    public int getNbFaces() {
        return nbFaces;
    }

    /**
     * Accesseur en écriture du champ <code>nbFaces</code>.
     * @param paramNbFaces la valeur à écrire dans <code>nbFaces</code>.
     */
    public void setNbFaces(int paramNbFaces) {
        nbFaces = paramNbFaces;
    }

}
