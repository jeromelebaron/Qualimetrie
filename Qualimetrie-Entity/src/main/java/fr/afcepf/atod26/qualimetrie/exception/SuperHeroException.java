/**
 * Créé le 2 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.exception;

/**
 * Les exceptions liées au projet.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class SuperHeroException extends Exception {

    /**
     * Liste des codes d'erreur de l'application.
     * @author Jérome LE BARON
     * @author $LastChangedBy$
     * @version $Revision$ $Date$
     */
    public enum SuperErrorCode {
        /**
         * Si l'ajout dans la bdd ne fonctionne pas.
         */
        ERREUR_AJOUT_SUPER_HEROS,
        /**
         * Si un super heros avec le même nom existe.
         */
        NOM_EXISTE_DEJA,
        /**
         * Si il y a une erreur.
         */
        CA_MARCHE_PAS
    }

    /**
     * Code d'erreur de l'exception.
     */
    private SuperErrorCode superErrorCode = SuperErrorCode.CA_MARCHE_PAS;

    /**
     * Pour la sérialisation.
     */
    private static final long serialVersionUID = -7529886658506931711L;

    /**
     * Constructeur.
     */
    public SuperHeroException() {
        super();
    }

    /**
     * Constructeur avec message.
     * @param paramMessage le message de l'erreur.
     */
    public SuperHeroException(String paramMessage) {
        super(paramMessage);
    }

    /**
     * Constructeur plein.
     * @param paramMessage le message.
     * @param paramSuperErrorCode le code d'erreur
     */
    public SuperHeroException(String paramMessage, SuperErrorCode paramSuperErrorCode) {
        super(paramMessage);
        superErrorCode = paramSuperErrorCode;
    }

    /**
     * Accesseur en lecture du champ <code>superErrorCode</code>.
     * @return le champ <code>superErrorCode</code>.
     */
    public SuperErrorCode getSuperErrorCode() {
        return superErrorCode;
    }

    /**
     * Accesseur en écriture du champ <code>superErrorCode</code>.
     * @param paramSuperErrorCode la valeur à écrire dans <code>superErrorCode</code>.
     */
    public void setSuperErrorCode(SuperErrorCode paramSuperErrorCode) {
        superErrorCode = paramSuperErrorCode;
    }

}
