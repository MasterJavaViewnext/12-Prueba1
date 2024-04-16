package es.rodal.clases;

public class Coche extends VehiculoMotorizado  {
	
	public final static int NUM_RUEDAS = 4;
	
	public Coche(Color color, String matricula) {
		super(color, matricula);
	}

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("Arrancando coche");
	} 
	

}
