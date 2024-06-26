package es.rodal.main;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import es.rodal.clases.VehiculoPorPotenciaComparator;
import es.rodal.clases.Color;
import es.rodal.clases.RegistroTacometro;
import es.rodal.clases.VehiculoAMotor;
import es.rodal.clases.hijas.Barco;
import es.rodal.clases.hijas.Camion;
import es.rodal.clases.hijas.Coche;

public class Principal {
	public static void main(String[] args) throws InterruptedException {

		//CREACION INSTANCIAS VEHICULOS
		Coche coche = new Coche(Color.AMARILLO, "9836 FDN", 100);
		Coche coche2 = new Coche(Color.NEGRO, "0000 VVV", 300);
		Coche coche3 = new Coche(Color.ROJO, "1231 BBB", 200);
		Camion camion = new Camion(Color.BLANCO, "9999 BHF", 400); 
		Barco barco = new Barco(Color.VERDE, "6ª-BA-1-000-18", 350);

			
		//LISTA DE VEHICULOS ORDEN	
			List<VehiculoAMotor> vehiculos = new ArrayList<>();
			vehiculos.add(coche);
			vehiculos.add(camion);
			vehiculos.add(coche2);
			vehiculos.add(coche3);
			vehiculos.add(barco);
			System.out.println("Vehiculos sin ordenar" + vehiculos.toString());
			Collections.sort(vehiculos);
			System.out.println("\nOrdenado por matricula" + vehiculos.toString());
			Collections.sort(vehiculos, new VehiculoPorPotenciaComparator());
			System.out.println("\nOrdenado por potencia" + vehiculos.toString());
			
			
		//VIAJE COCHE(se podrian crear multiples viajes)
			coche.arrancar();
			coche.conducir();
			
			Thread.sleep(5000);
			coche.moverse(100);
			Thread.sleep(10000);
			coche.moverse(300);
			Thread.sleep(6000);
			coche.moverse(100);
			
			coche.parar();
			System.out.println(coche);
			coche.resultadoViajes();

			
		//CAMION
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

			//VIAJE 1 DE CAMION
			Thread.sleep(5000);
			camion.arrancar();
			camion.conducir();
			
			Thread.sleep(3000);
			camion.moverse(60);
			Thread.sleep(6000);
			camion.moverse(140);
			Thread.sleep(6000);
			camion.moverse(100);
			
			camion.parar();
			
			//VIAJE 2 DE CAMION
			Thread.sleep(3000);
			camion.arrancar();
			camion.conducir();
			
			Thread.sleep(3000);
			camion.moverse(58);
			Thread.sleep(5000);
			camion.moverse(110);
			Thread.sleep(6000);
			camion.moverse(105);
			Thread.sleep(6000);
			camion.moverse(95);
			
			camion.parar();
			
			//RESULTADOS
			camion.resultadoViajes();
			camion.showTacometro();

	}
}
