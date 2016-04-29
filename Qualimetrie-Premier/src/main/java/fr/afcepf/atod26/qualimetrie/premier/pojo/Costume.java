package fr.afcepf.atod26.qualimetrie.premier.pojo;

public class Costume {

    private boolean isCape;

    private String couleur;

    private boolean isMoulant;

    private String nom;

    public Costume() {
        super();
    }

    public Costume(boolean paramIsCape, String paramCouleur, boolean paramIsMoulant, String paramNom) {
        super();
        isCape = paramIsCape;
        couleur = paramCouleur;
        isMoulant = paramIsMoulant;
        nom = paramNom;
    }

    public boolean isCape() {
        return isCape;
    }

    public void setCape(boolean paramIsCape) {
        isCape = paramIsCape;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String paramCouleur) {
        couleur = paramCouleur;
    }

    public boolean isMoulant() {
        return isMoulant;
    }

    public void setMoulant(boolean paramIsMoulant) {
        isMoulant = paramIsMoulant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String paramNom) {
        nom = paramNom;
    }

}
