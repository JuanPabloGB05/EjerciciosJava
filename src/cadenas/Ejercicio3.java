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

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		String linea;
//		System.out.println("Linea: ");
//		linea = in.readLine().toLowerCase();
//		while (!linea.equalsIgnoreCase("fin")) {
//			int i = 0, iPrimero, iUltimo;
//			char c;
//			boolean seRepite;
//			do {
//				c = linea.charAt(i);
//				iPrimero = linea.indexOf(c);
//				iUltimo = linea.lastIndexOf(c);
//				seRepite = iPrimero < i || iUltimo > i;
//				i++;
//			} while(seRepite);
//			System.out.println(c);
//			System.out.println("Linea: ");
//			linea = in.readLine();
//		}
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.println("Linea: ");
		linea = in.readLine().toLowerCase();
		while (!linea.equalsIgnoreCase("fin")) {
			int i = -1, iPrimero, iUltimo;
			char c;
			do {
				i++;
				c = linea.charAt(i);
				iPrimero = linea.indexOf(c);
				iUltimo = linea.lastIndexOf(c);
			} while(iPrimero < i || iUltimo > i);
			System.out.println(c);
			System.out.println("Linea: ");
			linea = in.readLine();
		}
		
	}

}
