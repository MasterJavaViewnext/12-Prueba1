package es.rodal.main;

import es.rodal.clases.Camion;
import es.rodal.clases.Coche;
import es.rodal.clases.Color;

public class Principal {
	public static void main(String[] args) {
		Camion camion = new Camion(Color.AMARILLO, "9836 CBK");
		{
			camion.arrancar();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			camion.avanzar(500);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			camion.avanzar(700);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			camion.avanzar(500);
			camion.parar();
		}
		System.out.println(camion.getTacometro());
		System.out.println(camion.getVelocidadTacometro());
		System.out.println(camion.getVelocidad());
		camion.resultadoViaje();
	}
}
