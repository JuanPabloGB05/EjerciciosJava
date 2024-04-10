package basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Radio: ");
		double radio;
		radio = Double.parseDouble(teclado.readLine());
		double perimetro = 2d * Math.PI * radio;
		double area = Math.PI * Math.pow(radio, 2);
	}

}
