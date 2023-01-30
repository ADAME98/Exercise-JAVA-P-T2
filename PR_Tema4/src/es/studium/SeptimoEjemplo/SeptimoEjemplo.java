package es.studium.SeptimoEjemplo;

import java.awt.*;

public class SeptimoEjemplo {

	Frame window = new Frame("Opci�n m�ltiple");
	// En este caso, se pueden elegir todas las opciones que queramos
	Checkbox chkUno = new Checkbox("Opci�n Uno");
	Checkbox chkDos = new Checkbox("Opci�n Dos");
	Checkbox chkTres = new Checkbox("Opci�n Tres");

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
