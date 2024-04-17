package es.rodal.main;

import java.time.LocalDateTime;
import java.time.Month;

import es.rodal.clases.Color;
import es.rodal.clases.RegistroTacometro;
import es.rodal.clases.hijas.Camion;
import es.rodal.clases.hijas.Coche;

public class Principal {
	public static void main(String[] args) throws InterruptedException {

		//COCHE
			Coche coche = new Coche(Color.AMARILLO, "9836 FDN");
			coche.arrancar();
			
			Thread.sleep(5000);
			coche.moverse(100);
			Thread.sleep(10000);
			coche.moverse(300);
			Thread.sleep(6000);
			coche.moverse(100);
			
			coche.parar();
			
			coche.resultadoViaje();
		
		//CAMION
			Camion camion = new Camion(Color.BLANCO, "9999 BHF"); 
			
			//REGISTROS TACOMETRO
			camion.setRegistroTacometro(new RegistroTacometro(
					LocalDateTime.of(2024, Month.MARCH, 27, 15, 30),
					LocalDateTime.of(2024, Month.MARCH, 27, 20, 30), 410));
			camion.setRegistroTacometro(new RegistroTacometro(
					LocalDateTime.of(2024, Month.MARCH, 28, 11, 30),
					LocalDateTime.of(2024, Month.MARCH, 28, 20, 30), 740));
			camion.setRegistroTacometro(new RegistroTacometro(
					LocalDateTime.of(2024, Month.MARCH, 29, 15, 30),
					LocalDateTime.of(2024, Month.MARCH, 29, 20, 30), 490));
			
			//VIAJE
			Thread.sleep(8000);
			camion.arrancar();
			
			Thread.sleep(3000);
			camion.moverse(60);
			Thread.sleep(6000);
			camion.moverse(140);
			Thread.sleep(6000);
			camion.moverse(100);
			
			camion.parar();
			
			camion.resultadoViaje();
			camion.showTacometro();
	}
}
