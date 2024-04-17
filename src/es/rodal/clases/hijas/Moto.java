package es.rodal.clases.hijas;

import es.rodal.clases.Color;
import es.rodal.clases.VehiculoAMotor;

public class Moto extends VehiculoAMotor{

	public static final int NUM_RUEDAS = 2;

	public Moto(Color color, String matricula) {
		super(color, matricula);
	}

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("\n\nArrancando moto");
	} 
}
