package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ruta: ");
		String ruta = teclado.readLine();
		try (BufferedReader in = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while ((linea = in.readLine()) != null) {
				System.out.println(linea);
			}
		}
	}

}
