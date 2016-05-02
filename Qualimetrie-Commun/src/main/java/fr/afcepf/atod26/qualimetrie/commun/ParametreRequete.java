/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.commun;

/**
 * Pour tous les éléments communs aux différentes requêtes de l'application.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public enum ParametreRequete {

    /**
     * Premier paramètre d'une requête.
     */
    PREMIER_PARAMETRE_REQUETE(1),
    /**
     * Second paramètre d'une requête.
     */
    SECOND_PARAMETRE_REQUETE(2),
    /**
     * Troisième paramètre d'une requête.
     */
    TROISIEME_PARAMETRE_REQUETE(3),
    /**
     * Numéro de la colonne de l'id généré après insertion.
     */
    INDEX_ID_GENERE(1);

    /**
     * Le numéro du utile pour une requete.
     */
    private int numeroParametre;

    /**
     * Constructeur plein.
     * @param paramNumeroParametre le numéro utile.
     */
    ParametreRequete(int paramNumeroParametre) {
        numeroParametre = paramNumeroParametre;
    }

    /**
     * Accesseur en lecture du champ <code>numeroParametre</code>.
     * @return le champ <code>numeroParametre</code>.
     */
    public int getNumeroParametre() {
        return numeroParametre;
    }

}
