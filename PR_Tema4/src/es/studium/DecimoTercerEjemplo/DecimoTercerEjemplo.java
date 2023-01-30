package es.studium.DecimoTercerEjemplo;

import java.awt.*;

public class DecimoTercerEjemplo {
	Frame ventana = new Frame("AwtTextArea");
	// Crear un TextArea vacío con tamaño 5 filas y 20 columnas
	TextArea areaTexto = new TextArea("", 20, 40);

	public DecimoTercerEjemplo() {
		ventana.setLayout(new FlowLayout());
		ventana.add(areaTexto);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 400);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new DecimoTercerEjemplo();
	}

}
