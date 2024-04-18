package es.rodal.clases;

public class Viaje {
	
	private long tiempoInicial;//en milisegundos
	private long tiempoTranscurrido;//en milisegundos
	private long ultimoTiempo;//en milisegundos
	private long metrosRecorridos;
	private double velocidadMedia;//en kilometros/hora
	
	
	
	public long getTiempoInicial() {
		return tiempoInicial;
	}

	public void setTiempoInicial(long tiempoInicial) {
		this.tiempoInicial = tiempoInicial;
	}

	public long getTiempoTranscurrido() {
		return tiempoTranscurrido;
	}

	public void setTiempoTranscurrido() {
		this.tiempoTranscurrido = this.ultimoTiempo - this.tiempoInicial;
	}

	public long getUltimoTiempo() {
		return ultimoTiempo;
	}

	public void setUltimoTiempo(long ultimoTiempo) {
		this.ultimoTiempo = ultimoTiempo;
	}

	public long getMetrosRecorridos() {
		return metrosRecorridos;
	}

	public void setMetrosRecorridos(long metrosRecorridos) {
		this.metrosRecorridos += metrosRecorridos;
	}

	public double getVelocidadMedia() {
		return velocidadMedia;
	}

	public void setVelocidadMedia() {
		this.velocidadMedia = calcularVelocidad(this.tiempoInicial, this.ultimoTiempo, this.metrosRecorridos);
	}

	/**
	 * Método que calcula la velocidad en kilometros por hora mediante los metros recorridos en 
	 * el tiempo comprendido entre 2 tiempos recibidos en milisegundos
	 * @param tiempoInicial
	 * @param tiempoFinal
	 * @param metros
	 * @return velocidadKmH
	 */
	public static double calcularVelocidad(long tiempoInicial, long tiempoFinal, long metros) {
		double velocidadMS = metros/((tiempoFinal-tiempoInicial)/1000);
		double velocidadKmH = velocidadMS * 3.6;
		return velocidadKmH;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.metrosRecorridos).append(" metros recorridos en ").append(this.tiempoTranscurrido/1000).append(" segundos")
				.append(" lo que da una velocidad media de: ").append(this.velocidadMedia).append("km/h");
		return builder.toString();
	}
}
