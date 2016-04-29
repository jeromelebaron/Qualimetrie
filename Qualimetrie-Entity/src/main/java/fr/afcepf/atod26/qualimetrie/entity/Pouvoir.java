package fr.afcepf.atod26.qualimetrie.entity;

/**
 * POJO pour le pouvoir d'un {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class Pouvoir {

    /**
     * Identifiant unique.
     */
    private Integer idPouvoir;
    /**
     * Le nom.
     */
    private String nom;
    /**
     * La puissance.
     */
    private int puissance;

    /**
     * Constructeur vide.
     */
    public Pouvoir() {
        super();
    }

    /**
     * Constructeur sans id.
     * @param paramNom {@link #nom}
     * @param paramPuissance {@link #puissance}
     */
    public Pouvoir(final String paramNom, final int paramPuissance) {
        super();
        nom = paramNom;
        puissance = paramPuissance;
    }

    /**
     * Constructeur plein.
     * @param paramIdPouvoir {@link #idPouvoir}
     * @param paramNom {@link #nom}
     * @param paramPuissance {@link #puissance}
     */
    public Pouvoir(final Integer paramIdPouvoir, final String paramNom,
            final int paramPuissance) {
        this(paramNom, paramPuissance);
        idPouvoir = paramIdPouvoir;
    }

    /**
     * Accesseur en lecture du champ <code>idPouvoir</code>.
     * @return le champ <code>idPouvoir</code>.
     */
    public Integer getIdPouvoir() {
        return idPouvoir;
    }

    /**
     * Accesseur en écriture du champ <code>idPouvoir</code>.
     * @param paramIdPouvoir la valeur à écrire dans <code>idPouvoir</code>.
     */
    public void setIdPouvoir(final Integer paramIdPouvoir) {
        idPouvoir = paramIdPouvoir;
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

    /**
     * Accesseur en lecture du champ <code>puissance</code>.
     * @return le champ <code>puissance</code>.
     */
    public int getPuissance() {
        return puissance;
    }

    /**
     * Accesseur en écriture du champ <code>puissance</code>.
     * @param paramPuissance la valeur à écrire dans <code>puissance</code>.
     */
    public void setPuissance(final int paramPuissance) {
        puissance = paramPuissance;
    }

}
