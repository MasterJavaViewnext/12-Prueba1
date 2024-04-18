package es.rodal.clases;

/**
 * Interfaz que contiene las 3 acciones que tendran que implementar los VehiculoAMotor
 * @author Admin
 *
 */
public interface Conducible {
	void conducir();
	void moverse(long metros);
	void parar();
}
