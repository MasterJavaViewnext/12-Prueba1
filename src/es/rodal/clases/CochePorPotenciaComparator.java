package es.rodal.clases;

import java.util.Comparator;

import es.rodal.clases.hijas.Coche;

public class CochePorPotenciaComparator implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {
		return o1.getPotencia() - o2.getPotencia();
	}

}
