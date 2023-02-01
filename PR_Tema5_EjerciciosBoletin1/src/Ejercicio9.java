import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio9 extends Frame implements WindowListener, ActionListener {


	TextField pantalla = null;

	Button boton = null;

	Panel panel01 = null;

	int operador1 = 0;

	int operador2 = 0;

	String operacion = null;

	boolean nuevoNumeroEnPantalla = true;

	public Ejercicio9() {

		this.setLayout(new BorderLayout());

		this.setTitle("Calculadora");

		// Campo de texto pantalla

		pantalla = new TextField();

		pantalla.setText("");

		pantalla.setBackground(Color.LIGHT_GRAY);

		// Cuando se añade un componente a un BorderLayout tenemos que indicarle la
		// ubicación con estas constantes.

		// NORTH, SOUTH, EAST, WEST y CENTER

		this.add(pantalla, BorderLayout.NORTH);

		// Botones

		panel01 = new Panel();

		panel01.setLayout(new GridLayout(4, 4));

		boton = new Button("0");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("1");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("2");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("+");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("3");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("4");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("5");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("-");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("6");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("7");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("8");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("*");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("9");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("C");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("=");

		boton.addActionListener(this);

		panel01.add(boton);

		boton = new Button("/");

		boton.addActionListener(this);

		panel01.add(boton);

		this.add(panel01, BorderLayout.CENTER);

		this.addWindowListener(this);

		this.setSize(300, 300);

		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Ejercicio9();

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		String botonPulsado = ((Button) e.getSource()).getLabel();

		if (botonPulsado.equals("C")) {

			pantalla.setText("0");

			operador1 = 0;

			operador2 = 0;

			nuevoNumeroEnPantalla = true;

		} else if (botonPulsado.equals("=")) {

			operador2 = Integer.parseInt(pantalla.getText());

			if (operacion != null) {

				if (operacion.equals("+")) {

					// Integer suma = new Integer(operador1 + operador2);

					// pantalla.setText(suma.toString());

					pantalla.setText(new Integer(operador1 + operador2).toString());

				} else if (operacion.equals("-")) {

					pantalla.setText(new Integer(operador1 - operador2).toString());

				} else if (operacion.equals("*")) {

					pantalla.setText(new Integer(operador1 * operador2).toString());

				} else if (operacion.equals("/")) {

					pantalla.setText(new Integer(operador1 / operador2).toString());

				}

			}

			nuevoNumeroEnPantalla = true;

			operacion = null;

		} else if (botonPulsado.equals("+") || botonPulsado.equals("-") || botonPulsado.equals("*")
				|| botonPulsado.equals("/")) {

			operacion = botonPulsado;

			operador1 = Integer.parseInt(pantalla.getText());

			nuevoNumeroEnPantalla = true;

		} else {

			if (nuevoNumeroEnPantalla == true) {

				pantalla.setText(botonPulsado);

				nuevoNumeroEnPantalla = false;

			} else {

				pantalla.setText(pantalla.getText() + botonPulsado);

				// Quitamos 0 como primer carácter

				if ((pantalla.getText().length() > 1) && (pantalla.getText().charAt(0) == '0')) {

					pantalla.setText(pantalla.getText().substring(1));

				}

			}

		}

	}

	@Override

	public void windowActivated(WindowEvent arg0) {

		// TODO Auto-generated method stub

	}

	@Override

	public void windowClosed(WindowEvent arg0) {

		// TODO Auto-generated method stub

	}

	@Override

	public void windowClosing(WindowEvent arg0) {

		// TODO Auto-generated method stub

		System.exit(0);

	}

	@Override

	public void windowDeactivated(WindowEvent arg0) {

		// TODO Auto-generated method stub

	}

	@Override

	public void windowDeiconified(WindowEvent arg0) {

		// TODO Auto-generated method stub

	}

	@Override

	public void windowIconified(WindowEvent arg0) {

		// TODO Auto-generated method stub

	}

	@Override

	public void windowOpened(WindowEvent arg0) {

		// TODO Auto-generated method stub

	}

}