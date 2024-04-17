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
	
	//Método que establece el tiempo en le cominza el viaje e inicializa el ultimoTiempo
	@Override
	public void arrancar() {
		this.tiempoInicial = System.currentTimeMillis();
		this.ultimoTiempo = this.tiempoInicial;
	}
	
	//Método 
	@Override
	public void moverse(long metros) {
		long tiempoActual = System.currentTimeMillis();
		System.out.println("--> " + metros + " metros avanzados a una velocidad de " 
					+ calcularVelocidad(this.ultimoTiempo, tiempoActual, metros) + "km/h" );
		this.metrosRecorridos += metros;
		this.ultimoTiempo = tiempoActual;
	}

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
