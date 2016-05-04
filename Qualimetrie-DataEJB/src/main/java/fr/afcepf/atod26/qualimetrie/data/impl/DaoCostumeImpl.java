/**
 * Créé le 4 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.atod26.qualimetrie.data.IDaoCostume;
import fr.afcepf.atod26.qualimetrie.entity.Costume;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException.SuperErrorCode;

/**
 * Implémentation du dao des {@link Costume}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IDaoCostume.class)
@Stateless
public class DaoCostumeImpl implements IDaoCostume {

    /**
     * Le mananger JPA.
     */
    @PersistenceContext(unitName = "Qualimetrie-Entity")
    private EntityManager entityManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public Costume ajouterCostume(final Costume paramCostume) throws SuperHeroException {
        try {
            entityManager.persist(paramCostume);
            entityManager.flush();
        } catch (Exception localE) {
            throw new SuperHeroException("Erreur d'ajout de costume", SuperErrorCode.CA_MARCHE_PAS);
        }
        return paramCostume;
    }

}
