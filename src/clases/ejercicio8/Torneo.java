package clases.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Torneo {
	
	

	public static void main(String[] args) {
		ArrayList<Entrenador>entrenadores= new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.print("> ");
		
		String token = in.next();
		
		boolean torneo= false;
		
		while(!token.equalsIgnoreCase("fin")) {
			if(token.equalsIgnoreCase("torneo")) {
				torneo = true;
			}else if(torneo) {
				for(Entrenador e : entrenadores) {
					e.jugarRonda(token);
				}
			}else {
				String nombre = in.next();
				String elemento = in.next();
				int vida = in.nextInt();
				
				Pokemon p = new Pokemon(nombre, elemento, vida);
				
				Entrenador entrenador = null;
				
				for(Entrenador e : entrenadores) {
					if(e.getNombre().equalsIgnoreCase(token)) {
						entrenador = e;
						break;
					}
				}
				if(entrenador == null) {
					entrenador = new Entrenador(token);
					entrenadores.add(entrenador);
					
				}
				entrenador.añadirPokemon(p);
			}
			System.out.print("> ");
			token = in.next();
		}
		
		for(Entrenador e : entrenadores) {
			System.out.println(e);
		}

	}

}
