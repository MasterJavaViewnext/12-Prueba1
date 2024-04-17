package es.rodal.clases.hijas;

import es.rodal.clases.Color;
import es.rodal.clases.VehiculoAMotor;

public class Barco extends VehiculoAMotor{

	public Barco(Color color, String matricula) {
		super(color, matricula);
	}
	
	public double kilometrosHoraToNudos(double velocidadKmH) {
		return velocidadKmH / 1.852;
	}
	
}
