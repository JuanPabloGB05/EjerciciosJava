package clases.ejercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Animal {

	private String nombre;
	private LocalDate fecha;
	
	public Animal(String nombre, LocalDate fecha) {

		this.nombre = nombre;
		this.fecha = fecha;
	}

	public Animal(String nombre) {
		this.nombre = nombre;
		fecha = LocalDate.now();
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		
		long edad = ChronoUnit.YEARS.between(fecha, LocalDate.now());
		return "Nombre:" + nombre + "- Edad:" + edad;
	}
	
	
	
	
	
	
	
	
	
	
	
}
