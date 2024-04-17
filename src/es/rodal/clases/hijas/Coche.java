package es.rodal.clases.hijas;

import es.rodal.clases.Color;
import es.rodal.clases.VehiculoAMotor;

public class Coche extends VehiculoAMotor  {
	
	public final static int NUM_RUEDAS = 4;
	
	public Coche(Color color, String matricula) {
		super(color, matricula);
	}

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("\n\nArrancando coche");
	} 
	
}
