package es.studium.DuodecimoEjemplo;

import java.awt.*;

public class DuodecimoEjemplo {
	Frame ventana = new Frame("AwtTextField");
	// Crear un TextField con 20 de ancho
	TextField txtTexto = new TextField(20);

	public DuodecimoEjemplo() {
		ventana.setLayout(new FlowLayout());
		ventana.add(txtTexto);
		txtTexto.requestFocus();
		ventana.setLocationRelativeTo(null);
		ventana.setSize(250, 100);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new DuodecimoEjemplo();
	}
}
