package fr.afcepf.atod26.qualimetrie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * POJO pour le pouvoir d'un {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Entity
@Table(name = "pouvoir")
public class Pouvoir {

    /**
     * Identifiant unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
     * Le {@link SuperHero} à qui appartient le pouvoir.
     */
    @ManyToOne
    @JoinColumn(name = "id_super_hero")
    private SuperHero superHero;

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
    public Pouvoir(final Integer paramIdPouvoir, final String paramNom, final int paramPuissance) {
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
