package es.studium.ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio2 implements ActionListener, WindowListener {
	// Atributos:
	Frame window = new Frame("Conversión de Temperaturas");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(10);
	TextField txtFahrenheit = new TextField(10);
	Button btnCeltoFah = new Button("Celsius a Fahrenheit");
	Button btnFahtoCel = new Button("Fahrenheit a Celsius ");

	Ejercicio2() {

		window.setSize(400, 130);
		window.addWindowListener(this);
		window.setLayout(new GridLayout(3, 2));
		window.add(lblCelsius);
		window.add(txtCelsius);
		window.add(lblFahrenheit);
		window.add(txtFahrenheit);
		btnCeltoFah.addActionListener(this);
		btnFahtoCel.addActionListener(this);
		window.add(btnCeltoFah);
		window.add(btnFahtoCel);

		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio2();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

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
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(btnCeltoFah)) {
			if (!txtCelsius.getText().equals("")) {
				float celsius = Float.parseFloat(txtCelsius.getText());
				// ºF = (ºC * 9 / 5)+ 32
				float fahrenheit = (celsius * 9.0f / 5.0f) + 32.0f;
				txtFahrenheit.setText(fahrenheit + "");
			}
		} else if (e.getSource().equals(btnFahtoCel)) {
			if (!txtFahrenheit.getText().equals("")) {
				float fahrenheit = Float.parseFloat(txtFahrenheit.getText());
				// ºC = (ºF -32) * 5/9
				float celsius = (fahrenheit - 32.0f) * 5.0f / 9.0f;
				txtCelsius.setText(celsius + (""));
			}

		}

	}

}
