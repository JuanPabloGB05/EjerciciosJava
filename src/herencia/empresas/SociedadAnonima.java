package herencia.empresas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SociedadAnonima {

	private String nombre;
	private ArrayList<String> trabajos = new ArrayList<>();
	
	public SociedadAnonima(String nombre) {
		this.nombre = nombre;
	}
	
	public SociedadAnonima(String nombre, String trabajo) {
		this.nombre = nombre;
		trabajos.add(trabajo);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void agregarTrabajo(String trabajo) {
		trabajos.add(trabajo);
	}
	
	public void eliminarTrabajo(String trabajo) {
		trabajos.remove(trabajo);
	}
	
	public List<String> getTrabajos() {
		return Collections.unmodifiableList(trabajos);
	}

	@Override
	public String toString() {
		return nombre + " " + trabajos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, trabajos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SociedadAnonima other = (SociedadAnonima) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(trabajos, other.trabajos);
	}
	
}
