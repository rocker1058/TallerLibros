package ejercicio;

public class ControlVentaLibro {

	private Libreria libreria;

	public int buscarLibro(String titulo) {
		for (int i = 0; i < libreria.getTitulos().size(); i++) {
			if (libreria.getTitulos().get(i).equals(titulo)) {
				return i;
			}
		}
		return -1;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	public String mostrarValor(String titulo) {
		int posicionLibro;
		if ((posicionLibro = buscarLibro(titulo)) != -1) {
			return "El precio es: " + libreria.getValores().get(posicionLibro);
		}
		return "Libro no encontrado";
	}
}