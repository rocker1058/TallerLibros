package ejercicio;

import java.util.List;

public class Libreria {
	private List<String> titulos;
	private List<Double> valores;

	public Libreria(List<String> titulos, List<Double> valores) {
		this.titulos = titulos;
		this.valores = valores;
	}

	public List<String> getTitulos() {
		return titulos;
	}

	public List<Double> getValores() {
		return valores;
	}
}
