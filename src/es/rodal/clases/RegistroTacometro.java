package es.rodal.clases;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que sirve para almacenar cada unop de los registros que tendrá el tacometro
 * estos registros tienen una feche de inicio, otra de fin, ambas de tipo LocalDateTime
 * y el numero de kilometros recorridos en ese tramo. La clase tiene un método que 
 * devuelve la velocidad media calculada en ese trayecto getVelocidad. También dispone
 * de un metodo toString() donde se mostrarán todos los datos correspondientes al registro.
 * @author Admin
 *
 */
public class RegistroTacometro {

	//Variable para dar formato al LocalDateTime
	public static final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
	
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private int kilometros;
	
	public RegistroTacometro(LocalDateTime fechaInicio, LocalDateTime fechaFin, int kilometros) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.kilometros = kilometros;
	}
	
	//Método que calcula la velocidad media en kilometros por hora de este registro y la devuelve
	public double getVelocidad() {
		Duration duracion = Duration.between(fechaInicio, fechaFin);
		return kilometros / duracion.toHours();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n------------REGISTRO TACOMETRO------------")	
				.append("\nFecha de inicio -> ").append(fechaInicio.format(formatoFecha))
				.append("\nFecha de fin -> ").append(fechaFin.format(formatoFecha))
				.append("\nKilometros recorridos -> ").append(kilometros)
				.append("\nVelociad media -> ").append(getVelocidad()).append("km/h");
		return builder.toString();
	}
	
	
}
