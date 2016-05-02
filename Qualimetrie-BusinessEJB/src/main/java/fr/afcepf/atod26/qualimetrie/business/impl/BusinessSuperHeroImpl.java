/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.afcepf.atod26.qualimetrie.business.IBusinessSuperHero;
import fr.afcepf.atod26.qualimetrie.data.IDaoSuperHero;
import fr.afcepf.atod26.qualimetrie.entity.SuperHero;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException;

/**
 * L'implémentation du business.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IBusinessSuperHero.class)
@Stateless
public class BusinessSuperHeroImpl implements IBusinessSuperHero {

    /**
     * Pour récupérer le dao.
     */
    @EJB
    private IDaoSuperHero daoSuperHero;

    /**
     * {@inheritDoc}
     */
    @Override
    public SuperHero ajouterSuperHero(final SuperHero paramSuperHero) throws SuperHeroException {
        return daoSuperHero.ajouterSuperHero(paramSuperHero);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<SuperHero> recupererTousLesSuperHero() {
        return daoSuperHero.rechercherSuperHeroParNom("");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<SuperHero> rechercherSuperHeroParNom(final String paramNom) {
        return daoSuperHero.rechercherSuperHeroParNom(paramNom);
    }

}
