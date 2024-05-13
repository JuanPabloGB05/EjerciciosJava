package clases.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Entrenador {

	private final String nombre;
	private int insignias;
	private final ArrayList<Pokemon>pokemons = new ArrayList<>();
	
	
	public Entrenador(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public int getInsignias() {
		return insignias;
	}


	public List<Pokemon> getPokemons() {
		return Collections.unmodifiableList(pokemons);
	}
	
	public int incrementarInsignias() {
		return ++insignias;
	}
	
	public void añadirPokemon(Pokemon pokemon) {
		pokemons.add(pokemon);
	}


	@Override
	public String toString() {
		return nombre + " " + insignias + " " + pokemons.size();
	}
	
	private void quitarVida() {
		
		Iterator<Pokemon> i = pokemons.iterator();
		
		while(i.hasNext()) {
			Pokemon p = i.next();
			if(p.restarSalud(10) <= 0) {
				i.remove();
			}
		}
	}
	
	public void jugarRonda(String elemento) {
		
		boolean encontrado = false;
		
		for(Pokemon p : pokemons) {
			if(elemento.equals(p.getElemento())) {
				encontrado = true;
				break;
			}
		}
		if(encontrado ) {
			insignias++;
		}else{
			quitarVida();
		}
	}
	
	
	
}
