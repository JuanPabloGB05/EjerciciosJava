package clases.ejercicio7;

public class Automovil {
	
	private String modelo;
	private float capacidadDeposito;
	private float combustible;
	private float consumo;
	private float totalKm;
	private float totalCombustible;
	
	public Automovil(String modelo, float capacidadDeposito, float combustible, float consumo) {
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.combustible = combustible;
		this.consumo = consumo;
	}

	public Automovil(String modelo, float capacidadDeposito, float consumo) {
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.consumo = consumo;
		combustible = capacidadDeposito;
	}
	
	public float llenarDeposito () {
		float loQueFalto = capacidadDeposito - combustible;
		combustible = capacidadDeposito;
		return loQueFalto;
	}
	
	public float llenarDeposito (float litros) {
		if(litros + combustible  > capacidadDeposito) {
			float sobrante = litros + combustible - capacidadDeposito;
			combustible = capacidadDeposito;
			return sobrante;
		}
		else {
			combustible += litros;
			return 0;
		}
	}
	
	public float desplazar (float kilometros) {
		float combustibleNecesario = consumo * kilometros;
		if (combustibleNecesario > combustible) {
			return -1;
		}
		else {
			combustible -= combustibleNecesario;
			totalKm += kilometros;
			totalCombustible += combustibleNecesario;
			return combustibleNecesario;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public float getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public float getCombustible() {
		return combustible;
	}

	public float getConsumo() {
		return consumo;
	}

	public float getTotalKm() {
		return totalKm;
	}

	public float getTotalCombustible() {
		return totalCombustible;
	}
	
}
