/**
 * Créé le 3 mai 2016 par Jérome LE BARON
 */
package fr.afcepf.atod26.qualimetrie.pom.ejb.impl;

import java.util.Random;

import javax.ejb.Remote;
import javax.ejb.Singleton;

import fr.afcepf.atod26.qualimetrie.pom.api.IEjb;
import fr.afcepf.atod26.qualimetrie.pom.entity.De;

@Remote(IEjb.class)
@Singleton
public class EjbImpl implements IEjb {

    @Override
    public int indecis(final De paramDe) {
        final Random random = new Random();
        return random.nextInt(paramDe.getNbFaces()) + 1;
    }

}
