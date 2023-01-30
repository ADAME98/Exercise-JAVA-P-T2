package es.studium.UndecimoEjemplo;

import java.awt.*;

public class UndecimoEjemplo {

	Frame ventana = new Frame("AwtScrollbar");
	Scrollbar scrVertical = new Scrollbar(Scrollbar.VERTICAL);
	Scrollbar scrHorizontal = new Scrollbar(Scrollbar.HORIZONTAL);

	public UndecimoEjemplo() {
		ventana.setLayout(new BorderLayout());
		ventana.add("East", scrVertical);
		ventana.add("South", scrHorizontal);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(500, 600);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new UndecimoEjemplo();
	}
}
