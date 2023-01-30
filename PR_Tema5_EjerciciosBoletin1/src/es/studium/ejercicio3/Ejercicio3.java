package es.studium.ejercicio3;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements ActionListener, WindowListener {
	// Atributos:
	Frame window = new Frame("Calcular el Porcentaje");
	Label lbltext1 = new Label("Introduzca la cantidad");
	Label lbltext2 = new Label("Introduzca el porcentaje");
	TextField txtCantidad = new TextField(10);
	TextField txtPorcentaje = new TextField(10);
	Button btnCalcular = new Button("Calcular");
	Label lbltext3 = new Label("Resultado");
	Button btnFahtoCel = new Button("Fahrenheit a Celsius ");
	TextField txtResultado = new TextField(10);
	
	Dialog dlgMensaje = new Dialog(window, "Error", true);
	Label lblMensaje = new Label("Format Error");

	Ejercicio3() {

		window.setSize(1000, 70);
		window.setLayout(new GridLayout(1, 7));
		window.addWindowListener(this);
		window.add(lbltext1);
		window.add(txtCantidad);

		window.add(lbltext2);
		window.add(txtPorcentaje);
		btnCalcular.addActionListener(this);
		window.add(btnCalcular);
		window.add(lbltext3);
		window.add(txtResultado);

		txtResultado.setEnabled(false);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		dlgMensaje.setSize(100,100);
		dlgMensaje.addWindowListener(this);
		dlgMensaje.setLayout(new GridLayout(1, 7));
		dlgMensaje.add(lblMensaje);
		dlgMensaje.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Ejercicio3();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		if(dlgMensaje.isActive()) 
		{
			dlgMensaje.setVisible(false);
			txtCantidad.setText("");
			txtPorcentaje.setText("");
			txtResultado.setText("");
	
		}
		else
		{
			System.exit(0);
		}
		

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource().equals(btnCalcular)) 
		{
			
				  float cantidad, porcentaje, resultado;
				  try {
					  cantidad = Float.parseFloat(txtCantidad.getText());
					  porcentaje = Float.parseFloat(txtPorcentaje.getText());
					  
					  
					  resultado = cantidad * porcentaje / 100f;
					  
					  txtResultado.setText(String.format("%.2f",resultado));
				  }
				  catch(NumberFormatException nfe){
					  System.out.println("Format Error");
					  txtResultado.setText(String.format("Format error"));
					  dlgMensaje.setVisible(true);
				  }
			
				
			}
			
		}

}
