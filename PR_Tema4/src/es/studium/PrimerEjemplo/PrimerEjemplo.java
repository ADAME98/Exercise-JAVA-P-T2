package es.studium.PrimerEjemplo;

import java.awt.Color;
import java.awt.Frame;

public class PrimerEjemplo {
	Frame window = new Frame();

	PrimerEjemplo() {
		window.setBackground(Color.DARK_GRAY);
		window.setSize(500, 700);
		window.setTitle("Titulo");
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new PrimerEjemplo();

	}

}
