package fr.afcepf.atod26.qualimetrie.premier.pojo;

public class Pouvoir {

    private String nom;

    private int puissance;

    public Pouvoir() {
        super();
    }

    public Pouvoir(String paramNom, int paramPuissance) {
        super();
        nom = paramNom;
        puissance = paramPuissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String paramNom) {
        nom = paramNom;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int paramPuissance) {
        puissance = paramPuissance;
    }

}
