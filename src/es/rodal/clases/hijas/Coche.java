package es.rodal.clases.hijas;

import es.rodal.clases.Color;
import es.rodal.clases.VehiculoAMotor;

public class Coche extends VehiculoAMotor  {
	
	public final static int NUM_RUEDAS = 4;
	
	public Coche(Color color, String matricula, int potencia) {
		super(color, matricula, potencia);
	}

	//Llama al metodo padre y muestra una linea por pantalla
	@Override
	public void conducir() {
		super.conducir();
		System.out.println("Conduciendo coche");
	}
	
}
