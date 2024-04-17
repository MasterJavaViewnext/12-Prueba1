package es.rodal.clases.hijas;

import java.util.ArrayList;
import java.util.List;

import es.rodal.clases.Color;
import es.rodal.clases.RegistroTacometro;
import es.rodal.clases.VehiculoAMotor;

public class Camion extends VehiculoAMotor{

	List<RegistroTacometro> tacometro;
	
	public Camion(Color color, String matricula) {
		super(color, matricula);
		tacometro = new ArrayList<>();
	}

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("\n\nArrancando camion");
	} 
	
	public void setRegistroTacometro(RegistroTacometro registroTacometro) {
		tacometro.add(registroTacometro);
	}
	
	public void showTacometro() {
		for (RegistroTacometro registroTacometro : tacometro) {
			System.out.println(registroTacometro);
		}
	}
	
}
