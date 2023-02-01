package es.studium.ejercicio7;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

public class Ejercicio7 extends Frame implements WindowListener, ActionListener {

	

	// Creación de una lista con 5 elementos visibles y que no permite
	// multiselección.

	// Creamos un objeto de tipo List

	List lista = new List(5, false);

	public Ejercicio7() {

		setLayout(new FlowLayout());

		setTitle("Lista");

		lista.add("Baloncesto Fuenlabrada");

		lista.add("Bilbao Basket");

		lista.add("CAI Zaragoza");

		lista.add("Cajasol");

		lista.add("Valencia Basket Club");

		add(lista);

		addWindowListener(this);

		// Añadimos el listener a la lista

		// Para implementar el doble clic del ratón

		// Si sólo quisiéramos una pulsación, lista.addItemListener(this) y para ello
		// tenemos que

		// implementar ItemListener y añadir addItemListener a la lista e implementar el
		// código del

		// cambio de colores en el método itemStateChanged()

		lista.addActionListener(this);

		setSize(250, 250);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejercicio7();

	}

	public void windowActivated(WindowEvent we) {

	}

	public void windowClosed(WindowEvent we) {

	}

	public void windowClosing(WindowEvent we) {

		System.exit(0);

	}

	public void windowDeactivated(WindowEvent we) {

	}

	public void windowDeiconified(WindowEvent we) {

	}

	public void windowIconified(WindowEvent we) {

	}

	public void windowOpened(WindowEvent we) {

	}

	// Implementamos el método del listener

	public void actionPerformed(ActionEvent ae) {

		String ciudad = new String();

		if ("Baloncesto Fuenlabrada".equals(lista.getSelectedItem())) {

			ciudad = "Madrid";

		}

		if ("Bilbao Basket".equals(lista.getSelectedItem())) {

			ciudad = "Bilbao";

		}

		if ("CAI Zaragoza".equals(lista.getSelectedItem())) {

			ciudad = "Zaragoza";

		}

		if ("Cajasol".equals(lista.getSelectedItem())) {

			ciudad = "Sevilla";

		}

		if ("Valencia Basket Club".equals(lista.getSelectedItem())) {

			ciudad = "Valencia";

		}

		System.out.println(ciudad);

	}

}
