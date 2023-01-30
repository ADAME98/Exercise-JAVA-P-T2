package es.studium.CuartoEjemploEventos;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CuartoEjemploEventos implements WindowListener, ItemListener {

	Frame window = new Frame("Eventos");
	Choice choList = new Choice();

	CuartoEjemploEventos() {

		choList.add("Selecciona un color...");
		choList.add("Amarillo");
		choList.add("Azul");
		choList.add("Rojo");
		choList.add("Verde");
		choList.addItemListener(this);
		window.add(choList);
		window.addWindowListener(this);
		window.setLayout(new FlowLayout());
		window.setSize(240, 170);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

	public static void main(String[] args) {
		new CuartoEjemploEventos();

	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getItem().equals("Amarillo")) {
			window.setBackground(Color.YELLOW);
		} else if (e.getItem().equals("Azul")) {
			window.setBackground(Color.BLUE);
		} else if (e.getItem().equals("Rojo")) {
			window.setBackground(Color.RED);
		} else if (e.getItem().equals("Verde")) {
			window.setBackground(Color.GREEN);
		}
	}
}
