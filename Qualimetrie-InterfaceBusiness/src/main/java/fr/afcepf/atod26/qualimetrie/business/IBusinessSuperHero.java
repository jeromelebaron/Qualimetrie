/**
 * Créé le 29 avr. 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.business;

import java.util.List;

import fr.afcepf.atod26.qualimetrie.entity.SuperHero;

/**
 * Pour toutes les règles métier du {@link SuperHero}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IBusinessSuperHero {

    /**
     * Pour ajouter un {@link SuperHero}.
     * @param paramSuperHero le {@link SuperHero} à ajouter.
     * @return un {@link SuperHero} avec son id.
     */
    SuperHero ajouterSuperHero(SuperHero paramSuperHero);

    /**
     * Pour récupérer tous les {@link SuperHero}.
     * @return une liste de {@link SuperHero}.
     */
    List<SuperHero> recupererTousLesSuperHero();

    /**
     * Pour rechercher un {@link SuperHero} par son nom.
     * @param paramNom le nom du {@link SuperHero}.
     * @return une liste de {@link SuperHero}.
     */
    List<SuperHero> rechercherSuperHeroParNom(String paramNom);
}
