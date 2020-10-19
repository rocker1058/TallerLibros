package ejercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> titulos= new ArrayList<String>();
		titulos.add("El Secreto");
		titulos.add("El placebo eres tu");
		titulos.add("La biblia");
		
		List<Double> valores= new ArrayList<Double>(Arrays.asList(2.3,4.5,6.9));
		
		Libreria L= new Libreria(titulos, valores);
		ControlVentaLibro C = new ControlVentaLibro();
		C.setLibreria(L);
		
		System.out.println(C.buscarLibro("El Secretoo"));
		System.out.println(C.mostrarValor("El Secretoo"));
		
	}

}
