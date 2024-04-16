package es.rodal.main;

import es.rodal.clases.Coche;
import es.rodal.clases.Color;

public class Principal {
	public static void main(String[] args) {
		Coche coche = new Coche(Color.AMARILLO, "matricula");
		{
			coche.arrancar();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			coche.avanzar(500);
			coche.parar();
		}
		System.out.println(coche.getVelocidad());
	}
}
