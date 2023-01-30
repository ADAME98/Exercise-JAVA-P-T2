package es.studium.QuintoEjemplo;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.GridLayout;

public class QuintoEjemplo {
	
	// Atributos o componentes.

			Frame window = new Frame("GridLayout");
			Button btnAceptar = new Button("Aceptar");
			Label lblNombre = new Label("Nombre: ");
			TextField txtNombre = new TextField(20);
			
			QuintoEjemplo(){
				window.setSize(500,70);
				window.setLayout(new GridLayout(1,3));//primero fila, segundo columna.
				window.setBackground(Color.LIGHT_GRAY);
				window.add(lblNombre);
				window.add(txtNombre);
				window.add(btnAceptar);
				window.setVisible(true);
			}

	public static void main(String[] args) {
		
		new QuintoEjemplo();
	}

}
