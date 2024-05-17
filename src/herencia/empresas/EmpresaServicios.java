package herencia.empresas;

import java.util.Objects;

public class EmpresaServicios implements Pagable {

	private String nombre;
	private String tipo;
	private String cuenta;
	
	public EmpresaServicios(String nombre, String tipo, String cuenta) {
		this.nombre = nombre;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return nombre + ", " + tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuenta, nombre, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpresaServicios other = (EmpresaServicios) obj;
		return Objects.equals(cuenta, other.cuenta) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(tipo, other.tipo);
	}
	
	@Override
	public void pagar(float importe) {
		System.out.println("Pago a la empresa la cantidad de " + importe + " euros en cuenta " + cuenta);		
	}
	
}
