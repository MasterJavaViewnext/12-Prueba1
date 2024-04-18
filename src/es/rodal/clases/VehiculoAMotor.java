package es.rodal.clases;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase abstracta que extiende de Vehiculo e implementa  las interfaces Comparable (por MATRICULA)
 * y Conducible que se implementan los 3 métodos. Esta clase controla todo lo referente a cada viaje:
 * velocidad, distancia e informe de viaje.
 * @author Admin
 *
 */
public abstract class VehiculoAMotor extends Vehiculo implements Comparable<VehiculoAMotor>, Conducible {

	private final String MATRICULA;
	
	private Motor motor;
	List<Viaje> viajes;

	public VehiculoAMotor(Color color, String matricula, int potencia) {
		super(color);
		this.MATRICULA = matricula;
		motor = new Motor(potencia);
		viajes = new LinkedList<>();//LinkedList porque el orden es importante
	}

	public int getPotencia() {
		return this.motor.getPotencia();
	}
	
	public void setPotencia(int potencia) {
		this.motor.setPotencia(potencia);
	}
	
	public String getMatricula() {
		return MATRICULA;
	}
	
	public Viaje getViajeActual() {
		return viajes.get(viajes.size()-1);
	}
	
	/**
	 * Método que llama al metodo arrancar de motor y añade el nombre de la clase
	 */
	public void arrancar() {
		this.motor.arrancar();
		System.out.println(this.getClass().getSimpleName().toLowerCase());
	}
	
	/**
	 * Método que establece el tiempo en le comienza el viaje e inicializa el ultimoTiempo
	 * cada uno de los hijos sobreescribirá este método
	 */
	@Override
	public void conducir() {
		long tiempoActual = System.currentTimeMillis();
		viajes.add(new Viaje());
		getViajeActual().setTiempoInicial(tiempoActual);
		getViajeActual().setUltimoTiempo(tiempoActual);
	}
	
	/**
	 * Método que va registrando los metros recorridos en ese movimiento, también el tiempo
	 * transcurrido y muestra por pantalla la velocidad media en km/h de este ultimo movimiento
	 */
	@Override
	public void moverse(long metros) {
		long tiempoActual = System.currentTimeMillis();
		System.out.println("--> " + metros + " metros avanzados a una velocidad de " 
					+ Viaje.calcularVelocidad(getViajeActual().getUltimoTiempo(), tiempoActual, metros) + "km/h" );
		getViajeActual().setMetrosRecorridos(metros);
		getViajeActual().setUltimoTiempo(tiempoActual);
	}

	/**
	 * Método que finaliza el viaje y establece el tiempo total y la velocidad media en km/h
	 */
	@Override
	public void parar() {
		System.out.println("Parando " + this.getClass().getSimpleName().toLowerCase());
		getViajeActual().setTiempoTranscurrido();
		getViajeActual().setVelocidadMedia();
	}

	@Override
	public int compareTo(VehiculoAMotor o) {
		return this.MATRICULA.compareTo(o.MATRICULA);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n").append(this.getClass().getSimpleName()).append(" con matricula: ").append(MATRICULA).append(" de color: ").append(this.getColor())
				.append(" y ").append(getPotencia()).append(" caballos de potencia");
		return builder.toString();
	}

	public void resultadoViajes() {
		System.out.println("--------------RESULTADOS DE LOS VIAJES-----------------");
		for (Viaje viaje : viajes) {
			System.out.println(viaje.toString());
		}
	}
	

}
