package arrays;

import java.util.Scanner;

/*
 * Programa que realice las tareas siguientes:
 * 
 *     • Crear un vector de números enteros de un tamaño especificado por el usuario
 *       que estará comprendido entre 10 y 200 elementos.
 *       
 *     • Llenar el vector con números aleatorios comprendidos entre -100 y 100.
 *     
 *     • Mostrar la suma de los números almacenados teniendo en cuenta que hay quien
 *       piensa que el número 13 es el número de la mala suerte. Por tanto, si en
 *       alguna posición se encuentra almacenado el número 13, no se sumará ni este
 *       número ni los que se encuentren almacenados eán las 13 posiciones siguientes
 *       (o las que haya hasta el final del vector si estas son menos de 13) si la 
 *       suma de todos ellos es distinta de 7.
 *       
 *     • Mostrar el contenido del vector y la cantidad de números que no se han sumado.
 *     
 */

public class Ejercicio4 {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int numero;
//		do {
//			System.out.println("Introduce un numero entero entre 10 y 200: ");
//			numero = in.nextInt();
//		} while (numero > 200 || numero < 10);
		
//		int[] vector = new int[numero];
		
//		for(int i=0; i<vector.length;i++) {
//		 vector[i] = (int) (Math.random() * 100000)% 201-100;
//		}
		
		int[] vector = {1, 2, 13, 1, 1, 1, 1, 1, 1, 1, -13};
	
		int suma =0;
		int noSumados=0;
		
		for(int i=0; i<vector.length;i++) {
			 if (vector[i]==13) {
				int parcial = 13;
				int contador = 0;
				while (++i < vector.length && contador < 13) {
					parcial += vector[i];
					contador++;
				}
				if(parcial == 7) {
					suma += 7;
				} else {
					noSumados += contador;
				}
			 }else {
				 suma += vector[i];
			 }
		}
		System.out.println("suma: "+suma);
		System.out.println("no Sumados: "+noSumados);
		System.out.println("Tamaño: " +vector.length);
		

	}

}
