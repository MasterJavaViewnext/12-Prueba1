package es.rodal.clases;

public interface Conducible {
	void arrancar();
	void avanzar(int metros);
	void retroceder(int metros);
	void parar();
	
	double getVelocidadMedia();
	long getTiempoDeViaje();
	long getEspacioRecorrido();
}
