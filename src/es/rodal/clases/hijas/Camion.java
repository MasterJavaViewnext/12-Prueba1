package es.rodal.clases.hijas;

import java.util.ArrayList;
import java.util.List;

import es.rodal.clases.Color;
import es.rodal.clases.RegistroTacometro;
import es.rodal.clases.VehiculoAMotor;

/**
 * Clase que hereda de VehiculoAMotor, sobreescribe su metodo arrancar y
 * gestiona el tacometro
 * @author Admin
 *
 */
public class Camion extends VehiculoAMotor{

	List<RegistroTacometro> tacometro;
	
	public Camion(Color color, String matricula) {
		super(color, matricula);
		tacometro = new ArrayList<>();
	}

	//Llama al metodo padre y muestra una linea por pantalla
	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("\n\nArrancando camion");
	} 
	
	//Añade un registro al tacómetro
	public void setRegistroTacometro(RegistroTacometro registroTacometro) {
		tacometro.add(registroTacometro);
	}
	
	//Recorre el tacometro y muestra por pantalla cad uno de los registros
	public void showTacometro() {
		for (RegistroTacometro registroTacometro : tacometro) {
			System.out.println(registroTacometro);
		}
	}
	
}
