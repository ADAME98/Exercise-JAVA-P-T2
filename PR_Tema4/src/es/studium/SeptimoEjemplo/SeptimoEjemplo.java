package es.studium.SeptimoEjemplo;

import java.awt.*;

public class SeptimoEjemplo {

	Frame window = new Frame("Opción múltiple");
	// En este caso, se pueden elegir todas las opciones que queramos
	Checkbox chkUno = new Checkbox("Opción Uno");
	Checkbox chkDos = new Checkbox("Opción Dos");
	Checkbox chkTres = new Checkbox("Opción Tres");

	public SeptimoEjemplo() {
		window.setLayout(new FlowLayout());
		window.add(chkUno);
		window.add(chkDos);
		window.add(chkTres);
		window.setLocationRelativeTo(null);
		window.setSize(100, 150);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new SeptimoEjemplo();
	}
}
