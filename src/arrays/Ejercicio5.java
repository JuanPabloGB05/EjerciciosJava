package arrays;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
	int[] vector = {4, 52, 6, -96, 33, 68, -77};
	String[] sandwich = {"abc", "efabgh", "hijk", "mondongo", "mate"};
	System.out.println("el valor maximo del array es: " + valorMaximo(vector));
	System.out.println("la media del vector es: "+ media(vector));
	System.out.println("la cantidad que es: " + calcularStrings(sandwich, "ab"));
	intercambio(sandwich);
	System.out.println(Arrays.toString(sandwich));
	System.out.println("rango del vector: " + rango(vector));
	}

	/*
	 * Método que acepte un vector de números enteros y retorne
	 * el valor máximo en él almacenado.
	 */
	public static int valorMaximo(int[] vector) {
		int a, b = Integer.MIN_VALUE;
		for(int i = 0; i < vector.length; i++) {
			a = vector[i];
			if(b < a)
				b = a;
		}
		return b;
	}
	
	/*
	 * Método que acepte un vector de números 
	 * enteros y retorne la media exacta de todos 
	 * los valores almacenados en él.
	 */
	
	public static double media(int[] vector) {
		double a = 0, b = 0;
		for(int i = 0; i < vector.length; i++) {
			a = a + vector[i];
		}
		b = a / vector.length;
		return b;
	}
	
	/*
	 * Método que acepte dos parámetros: un vector de Strings 
	 * y un String. Este método tiene que retornar el número de 
	 * cadenas en el array que contienen a la que se pasa en el 
	 * segundo parámetro.
	 */
	
	public static int calcularStrings(String[] jamon, String queso) {
		int contador = 0;
		String b;
		for(int i = 0; i < jamon.length; i++) {
			b = jamon[i];
			if(b.contains(queso))
				contador++;
		}
		return contador;
	}
	
	/*
	 * Método que reciba dos vectores de Strings y retorne true si ambos
	 * son iguales, es decir, tienen el mismo número de elementos y las 
	 * cadenas que se encuentran en la misma posición en ambos arrays son iguales.
	 */
	
	public static boolean comparaVectoresDeStrings(String [] v1, String [] v2) {
		if (v1.length == v2.length) {
			int i = 0;
			while (v1[i].equals(v2[i]))
				i++;
			return (i == v1.length);
		}
		return false;
	}
	
	/*
	 * Método que acepte un vector de Strings e intercambie lo que hay en la
	 * posición 0 con lo que hay en la posición 1, lo que hay en la 2 con lo
	 * que hay en la 3, etc. Si el array contiene un número impar de cadenas,
	 * la última no se intercambia.
	 */
	
	public static void intercambio(String[] v) {
		for (int i = 0;i < v.length - 1;i = i + 2) {
			String aux = v[i];
			v[i] = v[i + 1];
			v[i + 1] = aux;
		}
	}
	
	/*
	 * Método que acepte un vector de números enteros y retorne el rango de 
	 * valores almacenados, entendiendo por rango la diferencia entre el valor 
	 * mayor y el valor menor más 1.
	 */
	
	public static int rango(int[] v) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < v.length; i++) {
			if (v[i] > max) {
				max = v[i];
			}
			else if (v[i] < min){
				min = v[i];
			}
		}
		return max - min + 1;
	}
	
}
