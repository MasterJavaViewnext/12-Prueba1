package es.rodal.clases;

import java.util.Comparator;

public class VehiculoPorPotenciaComparator implements Comparator<VehiculoAMotor> {

	@Override
	public int compare(VehiculoAMotor o1, VehiculoAMotor o2) {
		return o1.getPotencia() - o2.getPotencia();
	}

}
