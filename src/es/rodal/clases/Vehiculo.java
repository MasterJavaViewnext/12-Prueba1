package es.rodal.clases;

//Clase padre absoluta de la que no se pueden instanciar objetos
public abstract class Vehiculo{
	
	private Color color;
	
	public Vehiculo (Color color) {
		this.color = color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void pintar(Color color) {
		setColor(color);
	}
	
}
