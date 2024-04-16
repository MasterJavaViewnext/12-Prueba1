package es.rodal.clases;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public  class VehiculoMotorizado extends Vehiculo implements Comparable<VehiculoMotorizado>, Conducible {

	private final String MATRICULA;
	
	protected long tiempoInicial;
	protected long ultimoTiempoRegistrado;
	protected long tiempoTranscurrido;
	protected long metrosRecorridos;
	private long distancia;
	
	//en metros/segundo
	private double velocidadMedia;

	public VehiculoMotorizado(Color color, String matricula) {
		super(color);
		this.MATRICULA = matricula;
	}

	public String getMatricula() {
		return MATRICULA;
	}
	
	public double getVelocidad() {
		return velocidadMedia;
	}

	private void moverse(long metros) {
		this.metrosRecorridos += metros;
		this.ultimoTiempoRegistrado = System.currentTimeMillis(); 
	}
	
	@Override
	public void arrancar() {
		this.tiempoInicial = System.currentTimeMillis();
		this.ultimoTiempoRegistrado = this.tiempoInicial;
	}

	@Override
	public void avanzar(int metros) {
		moverse(metros);
		this.distancia += metros;
	}

	@Override
	public void retroceder(int metros) {
		moverse(metros);
		this.distancia -= metros;
	}

	@Override
	public void parar() {
		tiempoTranscurrido = System.currentTimeMillis() - this.tiempoInicial;
		//divido el tiempo transcurrido entre 1000 para obtener segundos y que la
		//velocidad esté en metros/segundo
		this.velocidadMedia = this.distancia / (tiempoTranscurrido/1000);
	}
	
	
	@Override
	public double getVelocidadMedia() {
		return this.velocidadMedia;
	}

	

	@Override
	public long getTiempoDeViaje() {
		return this.tiempoTranscurrido;
	}

	@Override
	public long getEspacioRecorrido() {
		return this.metrosRecorridos;
	}

	@Override
	public int compareTo(VehiculoMotorizado o) {
		return this.MATRICULA.compareTo(o.MATRICULA);
	}
	
	public void resultadoViaje() {
		System.out.println("--------------RESULTADOS DEL VIAJE-----------------");
		System.out.println(this.getClass().getSimpleName() + " con matricula: " + this.MATRICULA + " de color: " + this.getColor());
		System.out.println(this.metrosRecorridos + " metros recorridos en " + this.tiempoTranscurrido + " segundos");
		System.out.println("Lo que da una velocidad media de: " + this.getVelocidadMedia());
	}
	

}
