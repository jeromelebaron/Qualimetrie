package fr.afcepf.atod26.qualimetrie.premier.dao;

import fr.afcepf.atod26.qualimetrie.premier.pojo.SuperHero;

/**
 * Pour la persistance d'un {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class DaoSuperHero {

    /**
     * Constructeur vide.
     */
    public DaoSuperHero() {
        // EMPTY
    }

    /**
     * Pour ajouter un {@link SuperHero} dans la bdd.
     * @param paramSuperHero {@link SuperHero}
     * @return un {@link SuperHero}
     */
    public SuperHero ajouterSuperHero(final SuperHero paramSuperHero) {
        paramSuperHero.setIdSuperHero(1);
        return paramSuperHero;
    }

}
