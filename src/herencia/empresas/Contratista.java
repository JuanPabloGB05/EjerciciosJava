package herencia.empresas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Contratista extends Empleado {

	ArrayList<SociedadAnonima> sociedades = new ArrayList<>();
	
	public Contratista(String nombre, String apellidos, LocalDate fecha, String cuenta) {
		super(nombre, apellidos, fecha, cuenta);
	}
	
	public Contratista(String nombre, String apellidos,
			LocalDate fecha, String cuenta, SociedadAnonima sociedad) {
		super(nombre, apellidos, fecha, cuenta);
		sociedades.add(sociedad);
	}
	
	public void agregarSociedadAnonima(SociedadAnonima sociedad) {
		sociedades.add(sociedad);
	}
	
	public void eliminarSociedadAnonima(SociedadAnonima sociedad) {
		sociedades.remove(sociedad);
	}
	
	public List<SociedadAnonima> getSociedades() {
		return Collections.unmodifiableList(sociedades);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sociedades);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contratista other = (Contratista) obj;
		return Objects.equals(sociedades, other.sociedades);
	}

	@Override
	public void pagar(float importe) {
		System.out.println("Pago al contratista la cantidad de " + importe + " euros en cuenta " + getCuenta());
	}
	
}
