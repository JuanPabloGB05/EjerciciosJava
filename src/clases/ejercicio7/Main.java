package clases.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("> ");
			int n = s.nextInt();
			ArrayList<Automovil> autos = new ArrayList<>();
			for (int i=0; i<n; i++) {
				System.out.println("> ");
				autos.add(new Automovil(
						s.next(),
						s.nextFloat(),
						s.nextFloat(),
						s.nextFloat()));
			}
			System.out.print("> ");
			String orden = s.next();
			while (!orden.equalsIgnoreCase("fin")) {
				String modelo = s.next();
				float km = s.nextFloat();
				for (Automovil a: autos) {
					if (modelo.equals(a.getModelo())) {
						float combustibleConsumido = a.desplazar(km);
						if (combustibleConsumido != -1)
							System.out.println(a.getModelo() + " " + a.getCombustible() + " " + combustibleConsumido);
						else
							System.out.println("Combustible insuficiente para este desplazamiento");
						break;
					}
				}
				System.out.print("> ");
				orden = s.next();
			}
			
			autos.forEach(a -> {
				System.out.println(a.getModelo() + " " + a.getCombustible() + " " + a.getTotalKm() + " " + a.getTotalCombustible()); 
			});
		}
	}
	
/*

2
AudiA4 80 23 0,3
BMW-M2 75 45 0,42
desplazar AudiA4 5
desplazar BMW-M2 56
desplazar AudiA4 13
fin
 	
*/

}
