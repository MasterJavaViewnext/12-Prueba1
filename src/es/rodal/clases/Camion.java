package es.rodal.clases;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Camion extends VehiculoMotorizado {
	
	private Map<Long, Long> tacometro;

	public Camion(Color color, String matricula) {
		super(color, matricula);
		this.tacometro = new LinkedHashMap<>();
		tacometro.put(Long.valueOf(0), Long.valueOf(0));
	}
	
	public Map<Long, Long> getTacometro() {
		return tacometro;
	}
	

	/**
	 * Metodo que convierte los registros del tacometro en velociades en metros/segundo
	 * @return
	 */
	public LinkedList<Long> getVelocidadTacometro(){
		
		LinkedList<Long> tacometroVelocidad = new LinkedList<>();
		tacometro.forEach((metros, segundos) -> { 
			if(segundos != 0) tacometroVelocidad.add(metros/segundos);
		});
		return tacometroVelocidad;
	}
	
	public long getVelocidadMaxima() {
		
		var velocidadMaxima = new Object() { long value = 0;};
		getVelocidadTacometro().forEach(registro -> {
			if(registro > velocidadMaxima.value) velocidadMaxima.value = registro;
		} );
		
		return velocidadMaxima.value;
	}

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("Arrancando camion");
	}
	
	/**
	 * Método invocado por avanzar() y retroceder() que suma los metros recorridos que se le pasen
	 * por parámetro, añade registro al tacómetro con los metros recorridos y el timepo del ultimo
	 * intervalo y actualiza el ultimoTiempoRegistrado
	 * @param metros
	 */
	private void moverse(long metros) {
		this.metrosRecorridos += metros;
		this.tacometro.put(metrosRecorridos, (System.currentTimeMillis()-this.ultimoTiempoRegistrado)/1000);
		this.ultimoTiempoRegistrado = System.currentTimeMillis(); 
	}
	
}
