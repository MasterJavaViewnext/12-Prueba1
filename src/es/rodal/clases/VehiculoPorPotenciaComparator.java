package es.rodal.clases;

import java.util.Comparator;

/**
 * Comparator para ordenar vehiculos por pootencia
 * @author Admin
 *
 */
public class VehiculoPorPotenciaComparator implements Comparator<VehiculoAMotor> {

	@Override
	public int compare(VehiculoAMotor o1, VehiculoAMotor o2) {
		return o1.getPotencia() - o2.getPotencia();
	}

}
