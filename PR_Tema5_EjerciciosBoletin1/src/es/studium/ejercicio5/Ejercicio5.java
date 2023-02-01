package es.studium.ejercicio5;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 implements ActionListener, WindowListener {

	Frame window = new Frame("Ejercicio5");

	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();

	Label etiqueta = new Label("¿Tipo de motorización?");

	CheckboxGroup grupoMotor = new CheckboxGroup();
	Checkbox uno = new Checkbox(" Gasolina", false, grupoMotor);
	Checkbox dos = new Checkbox("Diésel", false, grupoMotor);
	Checkbox tres = new Checkbox("Hibrido", false, grupoMotor);
	Checkbox cuatro = new Checkbox("Eléctrico", false, grupoMotor);

	Label etiqueta2 = new Label("¿Número de puertas?");

	CheckboxGroup grupoPuertas = new CheckboxGroup();
	Checkbox cinco = new Checkbox("3 puertas", false, grupoPuertas);
	Checkbox seis = new Checkbox("4 puertas", false, grupoPuertas);
	Checkbox siete = new Checkbox("5 puertas", false, grupoPuertas);

	Label etiqueta3 = new Label("¿Pintura Metalizada?");

	CheckboxGroup grupoMetal = new CheckboxGroup();
	Checkbox ocho = new Checkbox("Si", false, grupoMetal);
	Checkbox nueve = new Checkbox("No", false, grupoMetal);

	Panel pnlBtn = new Panel();

	Button btnCalPre = new Button("Calcular presupuesto");
	TextField txtPresupuesto = new TextField(20);

	public Ejercicio5() {

		window.setSize(440, 240);
		window.setLayout(new FlowLayout());
		window.setResizable(false);
		window.addWindowListener(this);
		btnCalPre.addActionListener(this);
		panel1.add(etiqueta);
		panel1.add(uno);
		panel1.add(dos);
		panel1.add(tres);
		panel1.add(cuatro);
		window.add(panel1);
		panel2.add(etiqueta2);
		panel2.add(etiqueta2);
		panel2.add(cinco);
		panel2.add(seis);
		panel2.add(siete);
		window.add(panel2);
		panel3.add(etiqueta3);
		panel3.add(ocho);
		panel3.add(nueve);
		window.add(panel3);
		window.add(pnlBtn);

		pnlBtn.add(btnCalPre);
		window.add(txtPresupuesto);
		txtPresupuesto.setEditable(false);
		window.setLocationRelativeTo(null);

		window.setVisible(true);

	}

	public static void main(String[] args) {
		new Ejercicio5();
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
		int totalPresupuesto = 0;

		if (uno.getState()) {

			totalPresupuesto += 7000;

		}

		else if (dos.getState()) {

			totalPresupuesto += 8000;

		}

		else if (tres.getState()) {

			totalPresupuesto += 9000;

		}

		else if (cuatro.getState()) {

			totalPresupuesto += 8500;

		}

		if (cinco.getState()) {

			totalPresupuesto += 2000;

		}

		if (seis.getState()) {

			totalPresupuesto += 3000;

		}

		else if (siete.getState()) {

			totalPresupuesto += 2500;

		}

		else if (ocho.getState()) {

			totalPresupuesto += 1500;

		}

		if (nueve.getState()) {

			totalPresupuesto += 0;

		}

		txtPresupuesto.setText("Total: " + totalPresupuesto + " €");

	}

}
