package cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que lea dos cadenas y muestre el número
 * de veces que la segunda está contenida en la primera.
 */

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cadena 1: ");
		String s1 = in.readLine();
		System.out.println("Cadena 2: ");
		String s2 = in.readLine();
		int n = buscarNumeroDeOcurrencias(s1, s2);
		System.out.println(n);
	}
	
	public static int buscarNumeroDeOcurrencias(String s1, String s2) {
		int i = 0;
		int contador = 0;
		
//		do {
//			i = s1.indexOf(s2, i);
//			if (i > 0) {
//				contador++;
//				i += s2.length();
//			}
//		} while (i != -1);
		
		while ((i = s1.indexOf(s2, i)) != -1) {
			contador++;
			i += s2.length();
		}
		
		return contador;
	}

}
