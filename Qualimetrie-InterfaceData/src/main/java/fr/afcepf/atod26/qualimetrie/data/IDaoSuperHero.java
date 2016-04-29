/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.data;

import java.util.List;

import fr.afcepf.atod26.qualimetrie.entity.SuperHero;

/**
 * Pour toute la persistance des {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IDaoSuperHero {

    /**
     * Pour ajouter un {@link SuperHero} dans la bdd.
     * @param paramSuperHero {@link SuperHero}.
     * @return un {@link SuperHero} avec son id.
     */
    SuperHero ajouterSuperHero(SuperHero paramSuperHero);

    /**
     * Pour rechercher un {@link SuperHero} avec son nom.
     * @param paramNom le superNom du {@link SuperHero}.
     * @return une liste de {@link SuperHero}.
     */
    List<SuperHero> rechercherSuperHeroParNom(String paramNom);

}
