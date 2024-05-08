package clases.ejercicio1;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {

		Animal a = new Animal("Fernando Alonso", LocalDate.parse("1991-01-01"));
		
		Animal a2 = new Animal("Paco");
		
		System.out.println(a);
		System.out.println(a2);
		
	}

}
