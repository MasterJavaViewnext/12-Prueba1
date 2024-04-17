package es.rodal.clases;

/**
 * Clase abstracta que extiende de Vehiculo e implementa  las interfaces Comparable (por MATRICULA)
 * y Conducible que se implementan los 3 métodos. Esta clase controla todo lo referente a cada viaje:
 * velocidad, distancia e informe de viaje.
 * @author Admin
 *
 */
public abstract class VehiculoAMotor extends Vehiculo implements Comparable<VehiculoAMotor>, Conducible {

	private final String MATRICULA;
	
	private long tiempoInicial;//en milisegundos
	private long tiempoTranscurrido;//en milisegundos
	private long ultimoTiempo;//en milisegundos
	protected long metrosRecorridos;
	private double velocidadMedia;//en kilometros/hora

	public VehiculoAMotor(Color color, String matricula) {
		super(color);
		this.MATRICULA = matricula;
	}

	public String getMatricula() {
		return MATRICULA;
	}

	public double getVelocidadMedia() {
		return this.velocidadMedia;
	}
	
	/**
	 * Método que establece el tiempo en le cominza el viaje e inicializa el ultimoTiempo
	 * cada uno de los hijos sobreescribirá este método
	 */
	@Override
	public void arrancar() {
		this.tiempoInicial = System.currentTimeMillis();
		this.ultimoTiempo = this.tiempoInicial;
	}
	
	/**
	 * Método que va registrando los metros recorridos en ese movimiento, también el tiempo
	 * transcurrido y muestra por pantalla la velocidad media en km/h de este ultimo movimiento
	 */
	@Override
	public void moverse(long metros) {
		long tiempoActual = System.currentTimeMillis();
		System.out.println("--> " + metros + " metros avanzados a una velocidad de " 
					+ calcularVelocidad(this.ultimoTiempo, tiempoActual, metros) + "km/h" );
		this.metrosRecorridos += metros;
		this.ultimoTiempo = tiempoActual;
	}

	/**
	 * Método que finaliza el viaje y establece el tiempo total y la velocidad media en km/h
	 */
	@Override
	public void parar() {
		System.out.println("Parando " + this.getClass().getSimpleName().toLowerCase());
		tiempoTranscurrido = this.ultimoTiempo - this.tiempoInicial;
		this.velocidadMedia = calcularVelocidad(this.tiempoInicial, this.ultimoTiempo, this.metrosRecorridos);
	}

	@Override
	public int compareTo(VehiculoAMotor o) {
		return this.MATRICULA.compareTo(o.MATRICULA);
	}
	
	/**
	 * Método que calcula la velocidad en kilometros por hora mediante los metros recorridos en 
	 * el tiempo comprendido entre 2 tiempos recibidos en milisegundos
	 * @param tiempoInicial
	 * @param tiempoFinal
	 * @param metros
	 * @return velocidadKmH
	 */
	public double calcularVelocidad(long tiempoInicial, long tiempoFinal, long metros) {
		double velocidadMS = metros/((tiempoFinal-tiempoInicial)/1000);
		double velocidadKmH = velocidadMS * 3.6;
		return velocidadKmH;
	}
	
	public void resultadoViaje() {
		System.out.println("\n--------------RESULTADOS DEL VIAJE-----------------");
		System.out.println(this.getClass().getSimpleName() + " con matricula: " + this.MATRICULA + " de color: " + this.getColor());
		System.out.println(this.metrosRecorridos + " metros recorridos en " + this.tiempoTranscurrido/1000 + " segundos");
		System.out.println("Lo que da una velocidad media de: " + this.getVelocidadMedia() +"km/h");
	}
	

}
