/**
 * Créé le 4 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data;

import fr.afcepf.atod26.qualimetrie.entity.Costume;
import fr.afcepf.atod26.qualimetrie.exception.SuperHeroException;

/**
 * Pour la persistence des {@link Costume}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IDaoCostume {

    /**
     * Pour ajouter un {@link Costume} dans la bdd.
     * @param paramCostume le {@link Costume} à ajouter.
     * @throws SuperHeroException si il y a un problème.
     * @return le {@link Costume} avec son id.
     */
    Costume ajouterCostume(Costume paramCostume) throws SuperHeroException;

}
