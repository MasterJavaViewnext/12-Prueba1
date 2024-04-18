package es.rodal.clases.hijas;

import es.rodal.clases.Color;
import es.rodal.clases.VehiculoAMotor;

public class Barco extends VehiculoAMotor{

	public Barco(Color color, String matricula, int potencia) {
		super(color, matricula, potencia);
	}
	
	//Llama al metodo padre y muestra una linea por pantalla
	@Override
	public void conducir() {
		super.conducir();
		System.out.println("Conduciendo barco");
	} 
	
	public double kilometrosHoraToNudos(double velocidadKmH) {
		return velocidadKmH / 1.852;
	}
	
}
