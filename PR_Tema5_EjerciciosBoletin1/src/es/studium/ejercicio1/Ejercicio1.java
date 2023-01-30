package es.studium.ejercicio1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 implements ActionListener, WindowListener {

	// Atributos:
	Frame window = new Frame("Horas");
	Label lblHH1 = new Label("HH");
	Label lblHH2 = new Label("HH");
	Label lblMM1 = new Label("MM");
	Label lblMM2 = new Label("MM");
	TextField txtSpace1 = new TextField(10);
	TextField txtSpace2 = new TextField(10);
	TextField txtSpace3 = new TextField(10);
	TextField txtSpace4 = new TextField(10);
	Button btnCalc = new Button("Calcular");
	TextField txtSpace5 = new TextField(10);

	Ejercicio1() {

		window.setSize(400, 130);
		window.setLayout(new GridLayout(3, 4));
		window.add(lblHH1);
		window.add(txtSpace1);
		window.add(lblMM1);
		window.add(txtSpace3);
		window.add(lblHH2);
		window.add(txtSpace2);
		window.add(lblMM2);
		window.add(txtSpace4);
		window.addWindowListener(this);
		btnCalc.addActionListener(this);
		txtSpace5.setEnabled(false);
		// txtSpace5.setEditable(false); <--- Haría lo mismo que el setEnable pero
		// dejaría clicar el campo.
		window.add(btnCalc);
		window.add(txtSpace5);

		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio1();

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
	public void actionPerformed(ActionEvent e) {
		int hh1 = Integer.parseInt(txtSpace1.getText());
		int hh2 = Integer.parseInt(txtSpace3.getText());

		int mm1 = Integer.parseInt(txtSpace2.getText());
		int mm2 = Integer.parseInt(txtSpace4.getText());
		int horas = Math.abs(hh1 - 60 + mm1) - (hh2 - 60 + mm2);
		txtSpace5.setText(String.format("%02d:%02d", horas / 60, horas % 60));

	}

}