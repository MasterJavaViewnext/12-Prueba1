package es.rodal.clases;

public abstract class VehiculoMotorizado extends Vehiculo implements Comparable<VehiculoMotorizado>, Conducible {

	private final String MATRICULA;
	
	protected long momentoInicial;
	private long metrosRecorridos;
	
	//en metros/segundo
	private double velocidad;

	public VehiculoMotorizado(Color color, String matricula) {
		super(color);
		this.MATRICULA = matricula;
	}

	public String getMatricula() {
		return MATRICULA;
	}

	
	public double getVelocidad() {
		return velocidad;
	}

	@Override
	public abstract void arrancar();

	@Override
	public void avanzar(int metros) {
		this.metrosRecorridos += metros;
	}

	@Override
	public void retroceder() {
		
	}

	@Override
	public void parar() {
		long tiempoTranscurrido = System.currentTimeMillis() - this.momentoInicial;
		//divido el tiempo transcurrido entre 1000 para obtener segundos y que la
		//velocidad esté en metros/segundo
		this.velocidad = this.metrosRecorridos / (tiempoTranscurrido/1000);
	}
	
	@Override
	public int compareTo(VehiculoMotorizado o) {
		return this.MATRICULA.compareTo(o.MATRICULA);
	}

}
