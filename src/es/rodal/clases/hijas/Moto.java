package es.rodal.clases.hijas;

import es.rodal.clases.Color;
import es.rodal.clases.VehiculoAMotor;

public class Moto extends VehiculoAMotor{

	public static final int NUM_RUEDAS = 2;

	public Moto(Color color, String matricula, int potencia) {
		super(color, matricula, potencia);
	}

	//Llama al metodo padre y muestra una linea por pantalla
	@Override
	public void conducir() {
		super.conducir();
		System.out.println("\n\nConduciendo moto");
	} 
}
