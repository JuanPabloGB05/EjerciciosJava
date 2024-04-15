package cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * Escribe un programa que lea dos cadenas y muestre el número
 * de veces que encuentra cada palabra de la primera dentro de la segunda.
 */

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cadena 1: ");
		String s1 = in.readLine();
		System.out.println("Cadena 2: ");
		String s2 = in.readLine();
		String [] palabras = s1.split(" ");
		for (String p: palabras) {
			int n = Ejercicio1.buscarNumeroDeOcurrencias(s2, p);
			System.out.println(n);
		}
	}

}
