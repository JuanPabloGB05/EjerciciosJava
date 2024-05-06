package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

		
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int tamaño = aleatorio.nextInt(491)+10;
		int vector[]= new int [tamaño];
		for(int i=0; i<vector.length;i++) {
			vector[i] = aleatorio.nextInt(201)-100;
		}
		
		if(vector.length<=50) {
			System.out.println(Arrays.toString(vector));
		}
		int[] v = new int [] {
				9,2,2,3,2,5,7,7,7,4
		};
		System.out.println(secuencias(v));

		
	}
	public static int secuencias(int[]vector) {
		int contar=0;
		for(int i=0;i<vector.length -1;i++) {
			if(vector[i]==vector[i+1]) {
				contar++;
				while(i<vector.length-1 && vector[i]==vector[i+1]) {
					i++;
				}
			}
		}
		return contar;
	}
	
}
