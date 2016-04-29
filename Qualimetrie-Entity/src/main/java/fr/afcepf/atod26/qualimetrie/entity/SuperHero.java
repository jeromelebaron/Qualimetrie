package fr.afcepf.atod26.qualimetrie.entity;


import java.util.Date;
import java.util.List;

/**
 * Pojo qui représente un {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class SuperHero {

    /**
     * Identifiant unique.
     */
    private int idSuperHero;
    /**
     * Nom de famille.
     */
    private String nom;
    /**
     * Prénom.
     */
    private String prenom;
    /**
     * Nom de super héros.
     */
    private String superNom;
    /**
     * {@link Costume}.
     */
    private Costume costume;
    /**
     * Date de naissance.
     */
    private Date dateDeNaissance;
    /**
     * Liste de {@link Pouvoir}.
     */
    private List<Pouvoir> lesPouvoirs;

    /**
     * Constructeur vide.
     */
    public SuperHero() {
        super();
    }

    /**
     * Constructeur sans id.
     * @param paramNom {@link #nom}
     * @param paramPrenom {@link #prenom}
     * @param paramSuperNom {@link #superNom}
     * @param paramCostume {@link #costume}
     * @param paramDateDeNaissance {@link #dateDeNaissance}
     * @param paramLesPouvoirs {@link #lesPouvoirs}
     */
    public SuperHero(final String paramNom, final String paramPrenom,
            final String paramSuperNom, final Costume paramCostume,
            final Date paramDateDeNaissance,
            final List<Pouvoir> paramLesPouvoirs) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        superNom = paramSuperNom;
        costume = paramCostume;
        dateDeNaissance = paramDateDeNaissance;
        lesPouvoirs = paramLesPouvoirs;
    }

    /**
     * Constructeur.
     * @param paramIdSuperHero {@link #idSuperHero}
     * @param paramNom {@link #nom}
     * @param paramPrenom {@link #prenom}
     * @param paramSuperNom {@link #superNom}
     * @param paramCostume {@link #costume}
     * @param paramDateDeNaissance {@link #dateDeNaissance}
     * @param paramLesPouvoirs {@link #lesPouvoirs}
     */
    public SuperHero(final int paramIdSuperHero, final String paramNom,
            final String paramPrenom, final String paramSuperNom,
            final Costume paramCostume, final Date paramDateDeNaissance,
            final List<Pouvoir> paramLesPouvoirs) {
        this(paramNom, paramPrenom, paramSuperNom, paramCostume,
                paramDateDeNaissance, paramLesPouvoirs);
        idSuperHero = paramIdSuperHero;
    }

    /**
     * Accesseur en lecture du champ <code>idSuperHero</code>.
     * @return le champ <code>idSuperHero</code>.
     */
    public int getIdSuperHero() {
        return idSuperHero;
    }

    /**
     * Accesseur en écriture du champ <code>idSuperHero</code>.
     * @param paramIdSuperHero la valeur à écrire dans <code>idSuperHero</code>.
     */
    public void setIdSuperHero(final int paramIdSuperHero) {
        idSuperHero = paramIdSuperHero;
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
     * Accesseur en lecture du champ <code>prenom</code>.
     * @return le champ <code>prenom</code>.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Accesseur en écriture du champ <code>prenom</code>.
     * @param paramPrenom la valeur à écrire dans <code>prenom</code>.
     */
    public void setPrenom(final String paramPrenom) {
        prenom = paramPrenom;
    }

    /**
     * Accesseur en lecture du champ <code>superNom</code>.
     * @return le champ <code>superNom</code>.
     */
    public String getSuperNom() {
        return superNom;
    }

    /**
     * Accesseur en écriture du champ <code>superNom</code>.
     * @param paramSuperNom la valeur à écrire dans <code>superNom</code>.
     */
    public void setSuperNom(final String paramSuperNom) {
        superNom = paramSuperNom;
    }

    /**
     * Accesseur en lecture du champ <code>costume</code>.
     * @return le champ <code>costume</code>.
     */
    public Costume getCostume() {
        return costume;
    }

    /**
     * Accesseur en écriture du champ <code>costume</code>.
     * @param paramCostume la valeur à écrire dans <code>costume</code>.
     */
    public void setCostume(final Costume paramCostume) {
        costume = paramCostume;
    }

    /**
     * Accesseur en lecture du champ <code>dateDeNaissance</code>.
     * @return le champ <code>dateDeNaissance</code>.
     */
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * Accesseur en écriture du champ <code>dateDeNaissance</code>.
     * @param paramDateDeNaissance la valeur à écrire dans
     *            <code>dateDeNaissance</code>.
     */
    public void setDateDeNaissance(final Date paramDateDeNaissance) {
        dateDeNaissance = paramDateDeNaissance;
    }

    /**
     * Accesseur en lecture du champ <code>lesPouvoirs</code>.
     * @return le champ <code>lesPouvoirs</code>.
     */
    public List<Pouvoir> getLesPouvoirs() {
        return lesPouvoirs;
    }

    /**
     * Accesseur en écriture du champ <code>lesPouvoirs</code>.
     * @param paramLesPouvoirs la valeur à écrire dans <code>lesPouvoirs</code>.
     */
    public void setLesPouvoirs(final List<Pouvoir> paramLesPouvoirs) {
        lesPouvoirs = paramLesPouvoirs;
    }

}
