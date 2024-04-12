package basicos;

import java.util.Scanner;

/*
 * Escribir un programa que introduzca las edades de una serie de alumnos,
 * y que se detendrá al introducir un numero negativo.
 * Se calculará la media, la suma y el número de alumnos con más de 18 años.
 * 
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edad;
		double media;
		double suma=0;
		int numMayores=0;
		int numTotal=0;
		System.out.println("Introduzca una edad");
		edad = scanner.nextInt();
		while(edad >= 0) {
			numTotal++;
			suma = suma + edad;
			if(edad>17) {
				numMayores++;
			
			}
			System.out.println("Introduzca una edad");
			edad = scanner.nextInt();
			
		}
		media = suma / numTotal;
		System.out.println("Suma "+suma);
		System.out.println("Media "+media);
		System.out.println("numMayores "+numMayores);
	
	}
	

}
