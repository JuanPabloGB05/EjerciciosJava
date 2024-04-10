package basicos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		float euros;
		float dolares;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la cantidad de euros: ");
		euros = teclado.nextFloat();
		dolares = 1.08f * euros;
		System.out.println(String.format("La cantidad de dolares es: %.2f", dolares));
		
		
	}

}
