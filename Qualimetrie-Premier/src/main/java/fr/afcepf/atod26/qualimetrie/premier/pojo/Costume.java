package fr.afcepf.atod26.qualimetrie.premier.pojo;

/**
 * POJO pour un costume d'un {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class Costume {

    /**
     * Si le {@link SuperHero} a une cape.
     */
    private boolean isCape;
    /**
     * COuleur.
     */
    private String couleur;
    /**
     * Si le costume est moulant.
     */
    private boolean isMoulant;
    /**
     * Le nom.
     */
    private String nom;

    /**
     * Constructeur vide.
     */
    public Costume() {
        super();
    }

    /**
     * Constructeur.
     * @param paramIsCape {@link #isCape()}
     * @param paramCouleur #{@link #couleur}
     * @param paramIsMoulant {@link #isMoulant}
     * @param paramNom {@link #nom}
     */
    public Costume(final boolean paramIsCape, final String paramCouleur,
            final boolean paramIsMoulant, final String paramNom) {
        super();
        isCape = paramIsCape;
        couleur = paramCouleur;
        isMoulant = paramIsMoulant;
        nom = paramNom;
    }

    /**
     * Accesseur en lecture du champ <code>isCape</code>.
     * @return le champ <code>isCape</code>.
     */
    public boolean isCape() {
        return isCape;
    }

    /**
     * Accesseur en écriture du champ <code>isCape</code>.
     * @param paramIsCape la valeur à écrire dans <code>isCape</code>.
     */
    public void setCape(final boolean paramIsCape) {
        isCape = paramIsCape;
    }

    /**
     * Accesseur en lecture du champ <code>couleur</code>.
     * @return le champ <code>couleur</code>.
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Accesseur en écriture du champ <code>couleur</code>.
     * @param paramCouleur la valeur à écrire dans <code>couleur</code>.
     */
    public void setCouleur(final String paramCouleur) {
        couleur = paramCouleur;
    }

    /**
     * Accesseur en lecture du champ <code>isMoulant</code>.
     * @return le champ <code>isMoulant</code>.
     */
    public boolean isMoulant() {
        return isMoulant;
    }

    /**
     * Accesseur en écriture du champ <code>isMoulant</code>.
     * @param paramIsMoulant la valeur à écrire dans <code>isMoulant</code>.
     */
    public void setMoulant(final boolean paramIsMoulant) {
        isMoulant = paramIsMoulant;
    }

    /**
     * Accesseur en lecture du champ <code>nom</code>.
     * @return le champ <code>nom</code>.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Accesseur en écriture du champ <code>nom</code>.
     * @param paramNom la valeur à écrire dans <code>nom</code>.
     */
    public void setNom(final String paramNom) {
        nom = paramNom;
    }

}
