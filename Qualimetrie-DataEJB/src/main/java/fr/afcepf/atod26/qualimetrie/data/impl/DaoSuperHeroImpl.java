/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.afcepf.atod26.qualimetrie.data.IDaoSuperHero;
import fr.afcepf.atod26.qualimetrie.entity.SuperHero;

/**
 * L'implémentation du dao du {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IDaoSuperHero.class)
@Stateless
public class DaoSuperHeroImpl implements IDaoSuperHero {

    /**
     * {@inheritDoc}
     */
    @Override
    public SuperHero ajouterSuperHero(SuperHero paramSuperHero) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<SuperHero> rechercherSuperHeroParNom(String paramNom) {
        return null;
    }

}
