/**
 * Créé le 3 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.pom.front;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.afcepf.atod26.qualimetrie.pom.api.IEjb;
import fr.afcepf.atod26.qualimetrie.pom.entity.De;

@ManagedBean
@SessionScoped
public class ManagedBeanDe {

    @EJB
    private IEjb ejb;

    private int nbFace;

    private De leDe = new De(6);

    private int resultat;

    public String lancer() {
        leDe.setNbFaces(nbFace);
        resultat = ejb.indecis(leDe);
        return "";
    }

    /**
     * Accesseur en lecture du champ <code>nbFace</code>.
     * @return le champ <code>nbFace</code>.
     */
    public int getNbFace() {
        return nbFace;
    }

    /**
     * Accesseur en écriture du champ <code>nbFace</code>.
     * @param paramNbFace la valeur à écrire dans <code>nbFace</code>.
     */
    public void setNbFace(int paramNbFace) {
        nbFace = paramNbFace;
    }

    /**
     * Accesseur en lecture du champ <code>leDe</code>.
     * @return le champ <code>leDe</code>.
     */
    public De getLeDe() {
        return leDe;
    }

    /**
     * Accesseur en écriture du champ <code>leDe</code>.
     * @param paramLeDe la valeur à écrire dans <code>leDe</code>.
     */
    public void setLeDe(De paramLeDe) {
        leDe = paramLeDe;
    }

    /**
     * Accesseur en lecture du champ <code>resultat</code>.
     * @return le champ <code>resultat</code>.
     */
    public int getResultat() {
        return resultat;
    }

    /**
     * Accesseur en écriture du champ <code>resultat</code>.
     * @param paramResultat la valeur à écrire dans <code>resultat</code>.
     */
    public void setResultat(int paramResultat) {
        resultat = paramResultat;
    }

}
