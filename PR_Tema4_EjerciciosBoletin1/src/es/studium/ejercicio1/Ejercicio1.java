package es.studium.ejercicio1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1 {
	
	// Atributos o componentes.

				Frame window = new Frame("Horas");
				Label lblhoras1 = new Label("HH");
				Label lblhoras2 = new Label("MM");
				Label lblmeses3 = new Label("HH");
				Label lblmeses4 = new Label("MM");
				TextField txthoras1 = new TextField(20);
				TextField txthoras2 = new TextField(20);
				TextField txtmeses3 = new TextField(20);
				TextField txtmeses4 = new TextField(20);
				Button btnAceptar = new Button("Aceptar");
				TextField txtButton1 = new TextField(20);
				
				Ejercicio1 (){
					window.setSize(350,140);
					window.setLayout(new GridLayout(3,3));//primero fila, segundo columna.
					window.setBackground(Color.LIGHT_GRAY);
					window.add(lblhoras1);
					window.add(txthoras1);
					window.add(lblhoras2);
					window.add(txthoras2);
					window.add(lblmeses3);
					window.add(txtmeses3);
					window.add(lblmeses4);
					window.add(txtmeses4);
					
					txtButton1.setEnabled(false);
					window.add(btnAceptar);
					window.add(txtButton1);
					
					
					
					window.setResizable(false);
					window.setLocationRelativeTo(null);
					window.setVisible(true);
				}

	public static void main(String[] args) {
		
		new Ejercicio1();
	}

}
