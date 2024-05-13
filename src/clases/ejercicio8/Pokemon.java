package clases.ejercicio8;

public class Pokemon {

	private final String nombre;
	private final String elemento;
	private int salud;

	public Pokemon(String nombre, String elemento, int salud) {

		this.nombre = nombre;
		this.elemento = elemento;
		this.salud = salud;
	}

	public String getNombre() {
		return nombre;
	}

	public String getElemento() {
		return elemento;
	}

	public int getSalud() {
		return salud;
	}

	public int restarSalud(int daño) {
		return salud -= daño;
		
	}
}
