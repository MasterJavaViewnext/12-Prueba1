package es.rodal.clases;

/**
 * Clase de la que tendran una instancia todos los vehiculos a motor
 * @author Admin
 *
 */
public class Motor {
	
	private int potencia;
	
	public Motor(int potencia) {
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void arrancar() {
		System.out.print("\n\nArrancando motor del ");
	}
}
