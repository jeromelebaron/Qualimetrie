package fr.afcepf.atod26.qualimetrie.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pojo qui représente un {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Entity
@Table(name = "super_hero")
public class SuperHero implements Serializable {

    /**
     * Serialisation.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Identifiant unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_super_hero")
    private int idSuperHero;
    /**
     * Nom de famille.
     */
    @Column(nullable = false, length = 45)
    private String nom;
    /**
     * Prénom.
     */
    @Column(nullable = false, length = 45)
    private String prenom;
    /**
     * Nom de super héros.
     */
    @Column(name = "super_nom", nullable = false, length = 45)
    private String superNom;
    /**
     * Liste de {@link Pouvoir}.
     */
    @OneToMany(mappedBy = "superHero")
    private List<Pouvoir> lesPouvoirs;
    /**
     * Tous les {@link Costume} du héros.
     */
    @OneToMany(mappedBy = "superHero")
    private List<Costume> lesCostumes;

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
     */
    public SuperHero(final String paramNom, final String paramPrenom, final String paramSuperNom) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        superNom = paramSuperNom;
    }

    /**
     * Constructeur.
     * @param paramIdSuperHero {@link #idSuperHero}
     * @param paramNom {@link #nom}
     * @param paramPrenom {@link #prenom}
     * @param paramSuperNom {@link #superNom}
     */
    public SuperHero(final int paramIdSuperHero, final String paramNom, final String paramPrenom,
            final String paramSuperNom) {
        this(paramNom, paramPrenom, paramSuperNom);
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

    /**
     * Accesseur en lecture du champ <code>lesCostumes</code>.
     * @return le champ <code>lesCostumes</code>.
     */
    public List<Costume> getLesCostumes() {
        return lesCostumes;
    }

    /**
     * Accesseur en écriture du champ <code>lesCostumes</code>.
     * @param paramLesCostumes la valeur à écrire dans <code>lesCostumes</code>.
     */
    public void setLesCostumes(List<Costume> paramLesCostumes) {
        lesCostumes = paramLesCostumes;
    }

}
