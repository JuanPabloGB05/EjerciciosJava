package basicos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final float v0 = 5;
		final float a = 2;
		final float espacioInicial = 5;
		float tiempo;
		float espacioFinal;
		
		System.out.println("Introduce el tiempo");
		tiempo = scanner.nextFloat();
		
		espacioFinal = espacioInicial + v0 * tiempo + (a/2 * (tiempo*tiempo));
		System.out.println("El espacio final es: " + espacioFinal);
	}

}
