package arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
	int[] vector = {4, 52, 6 -96, 33, 68, -77};
	String[] sandwich = {"abc", "efabgh", "hijk"};
	System.out.println("el valor maximo del array es: " + valorMaximo(vector));
	System.out.println("la media del vector es: "+ media(vector));
	System.out.println("la cantidad que es: " + calcularStrings(sandwich, "ab"));
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
}
