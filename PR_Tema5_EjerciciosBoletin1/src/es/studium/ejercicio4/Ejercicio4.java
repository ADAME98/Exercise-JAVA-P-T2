package es.studium.ejercicio4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 implements ActionListener, WindowListener {

	// Atributos:
	Frame window = new Frame("Aficiones");
	Checkbox caja1 = new Checkbox("Correr");
	Checkbox caja2 = new Checkbox("Nadar");
	Checkbox caja3 = new Checkbox("Andar");
	Checkbox caja4 = new Checkbox("Leer");
	Checkbox caja5 = new Checkbox("Ir al Cine");
	Checkbox caja6 = new Checkbox("Bailar");
	Checkbox caja7 = new Checkbox("Futbol");
	Checkbox caja8 = new Checkbox("Tenis");
	Checkbox caja9 = new Checkbox("Baloncesto");
	Checkbox caja10 = new Checkbox("Deportes de Vela");

	Button btnComprobar = new Button("Comprobar");

	String resultado = new String("");

	Ejercicio4() {
		window.setSize(400, 300);
		window.setLayout(new FlowLayout());
		window.add(caja1);
		window.add(caja2);
		window.add(caja3);
		window.add(caja4);
		window.add(caja5);
		window.add(caja6);
		window.add(caja7);
		window.add(caja8);
		window.add(caja9);
		window.add(caja10);

		btnComprobar.addActionListener(this);
		window.addWindowListener(this);
		window.add(btnComprobar);
		window.setLocationRelativeTo(null);

		window.setVisible(true);

	}

	public static void main(String[] args) {
		new Ejercicio4();
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
		resultado = "";

		if (caja1.getState() == true) {
			resultado = resultado + "Correr\n";
		}
		if (caja2.getState() == true) {
			resultado = resultado + "Nadar\n";
		}
		if (caja3.getState() == true) {
			resultado = resultado + "Andar\n";
		}
		if (caja4.getState() == true) {
			resultado = resultado + "Leer\n";
		}
		if (caja5.getState() == true) {
			resultado = resultado + "Ir al Cine\n";
		}
		if (caja6.getState() == true) {
			resultado = resultado + "Bailar\n";
		}
		if (caja7.getState() == true) {
			resultado = resultado + "Futbol\n";
		}
		if (caja8.getState() == true) {
			resultado = resultado + "Tenis\n";
		}
		if (caja9.getState() == true) {
			resultado = resultado + "Baloncesto\n";
		}

		if (caja10.getState() == true) {
			resultado = resultado + "Deportes de Vela\n";

		}
		System.out.println(resultado);

	}
}
