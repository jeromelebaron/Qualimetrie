package fr.afcepf.atod26.qualimetrie.premier.dao;

import fr.afcepf.atod26.qualimetrie.premier.pojo.SuperHero;

public class DaoSuperHero {

    public DaoSuperHero() {
        // EMPTY
    }

    public SuperHero ajouterSuperHero(final SuperHero paramSuperHero) {
        paramSuperHero.setIdSuperHero(1);
        return paramSuperHero;
    }

}
