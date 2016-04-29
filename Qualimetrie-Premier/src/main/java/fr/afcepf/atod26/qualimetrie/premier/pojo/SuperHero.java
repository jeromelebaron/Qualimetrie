package fr.afcepf.atod26.qualimetrie.premier.pojo;

import java.util.Date;
import java.util.List;

public class SuperHero {

    private int idSuperHero;

    private String nom;

    private String prenom;

    private String superNom;

    private Costume costume;

    private Date dateDeNaissance;

    private List<Pouvoir> lesPouvoirs;

    public SuperHero() {
        super();
    }

    public SuperHero(String paramNom, String paramPrenom, String paramSuperNom, Costume paramCostume, Date paramDateDeNaissance,
            List<Pouvoir> paramLesPouvoirs) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        superNom = paramSuperNom;
        costume = paramCostume;
        dateDeNaissance = paramDateDeNaissance;
        lesPouvoirs = paramLesPouvoirs;
    }

    public SuperHero(int paramIdSuperHero, String paramNom, String paramPrenom, String paramSuperNom, Costume paramCostume,
            Date paramDateDeNaissance, List<Pouvoir> paramLesPouvoirs) {
        this(paramNom, paramPrenom, paramSuperNom, paramCostume, paramDateDeNaissance, paramLesPouvoirs);
        idSuperHero = paramIdSuperHero;
    }

    public int getIdSuperHero() {
        return idSuperHero;
    }

    public void setIdSuperHero(int paramIdSuperHero) {
        idSuperHero = paramIdSuperHero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String paramNom) {
        nom = paramNom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String paramPrenom) {
        prenom = paramPrenom;
    }

    public String getSuperNom() {
        return superNom;
    }

    public void setSuperNom(String paramSuperNom) {
        superNom = paramSuperNom;
    }

    public Costume getCostume() {
        return costume;
    }

    public void setCostume(Costume paramCostume) {
        costume = paramCostume;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date paramDateDeNaissance) {
        dateDeNaissance = paramDateDeNaissance;
    }

    public List<Pouvoir> getLesPouvoirs() {
        return lesPouvoirs;
    }

    public void setLesPouvoirs(List<Pouvoir> paramLesPouvoirs) {
        lesPouvoirs = paramLesPouvoirs;
    }

}
