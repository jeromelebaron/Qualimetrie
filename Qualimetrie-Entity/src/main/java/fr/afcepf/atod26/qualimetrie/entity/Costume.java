package fr.afcepf.atod26.qualimetrie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * POJO pour un costume d'un {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Entity
@Table(name = "costume")
public class Costume {

    /**
     * Identifiant unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCostume;
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
    @Column(name = "is_moulant")
    private boolean isMoulant;
    /**
     * Le nom.
     */
    private String nom;
    /**
     * Le {@link SuperHero} à qui appartient le costume.
     */
    @ManyToOne
    @JoinColumn(name = "id_super_hero")
    private SuperHero superHero;

    /**
     * Constructeur vide.
     */
    public Costume() {
        super();
    }

    /**
     * Constructeur sans id.
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
     * Constructeur plein.
     * @param paramIdCostume {@link #idCostume}
     * @param paramIsCape {@link #isCape()}
     * @param paramCouleur #{@link #couleur}
     * @param paramIsMoulant {@link #isMoulant}
     * @param paramNom {@link #nom}
     */
    public Costume(final Integer paramIdCostume, final boolean paramIsCape,
            final String paramCouleur, final boolean paramIsMoulant, final String paramNom) {
        this(paramIsCape, paramCouleur, paramIsMoulant, paramNom);
        idCostume = paramIdCostume;
    }

    /**
     * Accesseur en lecture du champ <code>idCostume</code>.
     * @return le champ <code>idCostume</code>.
     */
    public Integer getIdCostume() {
        return idCostume;
    }

    /**
     * Accesseur en écriture du champ <code>idCostume</code>.
     * @param paramIdCostume la valeur à écrire dans <code>idCostume</code>.
     */
    public void setIdCostume(final Integer paramIdCostume) {
        idCostume = paramIdCostume;
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

    /**
     * Accesseur en lecture du champ <code>superHero</code>.
     * @return le champ <code>superHero</code>.
     */
    public SuperHero getSuperHero() {
        return superHero;
    }

    /**
     * Accesseur en écriture du champ <code>superHero</code>.
     * @param paramSuperHero la valeur à écrire dans <code>superHero</code>.
     */
    public void setSuperHero(SuperHero paramSuperHero) {
        superHero = paramSuperHero;
    }

}
