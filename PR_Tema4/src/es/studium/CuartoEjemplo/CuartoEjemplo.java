package es.studium.CuartoEjemplo;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class CuartoEjemplo {
	// Atributos o componentes.

	Frame window = new Frame("Absoluto");
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre: ");
	TextField txtNombre = new TextField(20);

	CuartoEjemplo() {
		window.setSize(500, 300);
		window.setLayout(null);
		window.setBackground(Color.DARK_GRAY);
		lblNombre.setBounds(25, 50, 50, 20);
		window.add(lblNombre);
		txtNombre.setBounds(80, 50, 150, 20);
		window.add(txtNombre);
		btnAceptar.setBounds(235, 50, 50, 20);
		window.add(btnAceptar);
		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new CuartoEjemplo();
	}

}
