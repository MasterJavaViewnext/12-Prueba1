package es.rodal.clases.hijas;

import es.rodal.clases.Color;
import es.rodal.clases.VehiculoAMotor;

public class Barco extends VehiculoAMotor{

	public Barco(Color color, String matricula) {
		super(color, matricula);
	}
	
	//Llama al metodo padre y muestra una linea por pantalla
	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("\n\nArrancando moto");
	} 
	
	public double kilometrosHoraToNudos(double velocidadKmH) {
		return velocidadKmH / 1.852;
	}
	
}
