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
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException.SuperErrorCode;

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
        final List<SuperHero> lesSuperHero = daoSuperHero
                .rechercherSuperHeroParSuperNom(paramSuperHero.getSuperNom());
        for (SuperHero localSuperHero : lesSuperHero) {
            if (localSuperHero.getSuperNom().equals(paramSuperHero.getSuperNom())) {
                throw new SuperHeroException("Ce super héros existe déjà",
                        SuperErrorCode.NOM_EXISTE_DEJA);
            }
        }
        return daoSuperHero.ajouterSuperHero(paramSuperHero);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<SuperHero> recupererTousLesSuperHero() {
        return daoSuperHero.rechercherSuperHeroParSuperNom("");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<SuperHero> rechercherSuperHeroParNom(final String paramNom) {
        return daoSuperHero.rechercherSuperHeroParSuperNom(paramNom);
    }

    /**
     * Accesseur en écriture du champ <code>daoSuperHero</code>.
     * @param paramDaoSuperHero la valeur à écrire dans <code>daoSuperHero</code>.
     */
    public void setDaoSuperHero(IDaoSuperHero paramDaoSuperHero) {
        daoSuperHero = paramDaoSuperHero;
    }

}
