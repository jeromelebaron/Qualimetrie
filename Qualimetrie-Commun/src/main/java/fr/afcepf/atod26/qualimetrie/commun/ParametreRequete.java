/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.commun;

/**
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
    TROISIEME_PARAMETRE_REQUETE(3);

    /**
     * Le numéro du paramètre d'une requete.
     */
    private int numeroParametre;

    /**
     * Constructeur.
     * @param paramNumeroParametre le numéro du paramètre.
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
