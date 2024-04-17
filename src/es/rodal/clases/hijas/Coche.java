package es.rodal.clases.hijas;

import es.rodal.clases.Color;
import es.rodal.clases.VehiculoAMotor;

public class Coche extends VehiculoAMotor  {
	
	public final static int NUM_RUEDAS = 4;
	
	public Coche(Color color, String matricula) {
		super(color, matricula);
	}

	//Llama al metodo padre y muestra una linea por pantalla
	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("\n\nArrancando coche");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCoche con matricula: ").append(getMatricula())
		.append(", de color: ").append(getColor())
		.append(", tiene: ").append(getPotencia()).append(" caballos");
		return builder.toString();
	}
	
	
	
	
}
