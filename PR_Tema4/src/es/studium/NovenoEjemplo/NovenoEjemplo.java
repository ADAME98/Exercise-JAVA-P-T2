package es.studium.NovenoEjemplo;

import java.awt.*;

public class NovenoEjemplo {
	Frame ventana = new Frame("NovenoEjemplo");
	Choice choLista = new Choice();

	public NovenoEjemplo() {
		ventana.setLayout(new FlowLayout());
//Añadir elementos a la lista
		choLista.add("Selecciona un color...");
		choLista.add("Blanco");
		choLista.add("Rojo");
		choLista.add("Azul");
//Añadir la lista
		ventana.add(choLista);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 200);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new NovenoEjemplo();
	}
}