package regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Escribe un programa que use una expresión regular para encontrar
 * nombres de personas en un texto, teniendo en cuenta que un nombre
 * es válido si cumple las condiciones siguientes:
 * 
 *   • Está formado por dos o más palabras.
 *   
 *   • Cada palabra comienza por una letra mayúscula seguida de
 *     letras minúsculas.
 *     
 *   • Cada palabra debería tener al menos dos letras.
 *   
 *   • Las palabras se separan entre sí por un único espacio en blanco.
 *   
 * El usuario introducirá una línea que contendrá varios nombres separados
 * por comas y los mostrará de nuevo, cada uno en una línea.
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		Pattern regex = Pattern.compile("(\\p{Lu}\\p{L}+(?: \\p{Lu}\\p{L}+)+)\\s*,?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.print("> ");
		linea = in.readLine();
		Matcher matcher = regex.matcher(linea);
		while (matcher.find()) {
			String nombre = matcher.group(1);
			System.out.println(nombre);
		}
	}

}

// Fernando fernández Pérez,María López Álvarez   , Mateo García García



