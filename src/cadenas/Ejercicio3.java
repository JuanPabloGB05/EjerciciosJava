package cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Escribe un programa que lea líneas hasta que se introduzca en una de ellas
 * la cadena "fin" sin importar si se hace en mayúsculas o en minúsculas o en
 * cualquier combinación de ambas. Por cada línea leída, excepto la última, 
 * mostrará cuál es el primer carácter que no se repite.
 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.println("Linea: ");
		linea = in.readLine().toLowerCase();
		while (!linea.equalsIgnoreCase("fin")) {
			int i = 0, iUltimo;
			char c;
			do {
				c = linea.charAt(i);
				iUltimo = linea.lastIndexOf(c);
			} while(i++ < iUltimo);
			System.out.println(c);
			System.out.println("Linea: ");
			linea = in.readLine();
		}
		
	}

}
