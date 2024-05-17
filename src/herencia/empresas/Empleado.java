package herencia.empresas;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado implements Pagable {
	
	private String nombre;
	private String apellidos;
	private LocalDate fecha;
	private String cuenta;
	
	public Empleado(String nombre, String apellidos, LocalDate fecha, String cuenta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.cuenta = cuenta;
	}

	public String getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	@Override
	public String toString() {
		return nombre + " " + apellidos + ", " + fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, cuenta, fecha, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(cuenta, other.cuenta)
				&& Objects.equals(fecha, other.fecha) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public void pagar(float importe) {
		System.out.println("Pago al asalariado la cantidad de " + importe + " euros en cuenta " + cuenta);		
	}
	
	
}
