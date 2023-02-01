package es.studium.ejercicio8;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class Ejercicio8 extends Frame implements WindowListener, ActionListener {




	MenuBar barraMenu = new MenuBar();

	

	Menu articulos = new Menu("Artículos");
	Menu clientes = new Menu("Clientes");
	Menu facturas = new Menu("Facturas");

	

	MenuItem articuloNuevo = new MenuItem("Nuevo Artículo");
	MenuItem articuloEliminar = new MenuItem("Eliminar Artículo");
	MenuItem articuloConsultar = new MenuItem("Consultar Artículo");

	

	MenuItem clientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem clientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem clientesConsultar = new MenuItem("Consultar Cliente");

	

	MenuItem facturasNueva = new MenuItem("Nueva Factura");
	MenuItem facturaConsultar = new MenuItem("Consultar Factura");



	Dialog d = new Dialog(this, "Diálogo con mensaje", true);
	Label e = new Label("");



	public Ejercicio8() {



		setLayout(new FlowLayout());
		setTitle("Menú");

		setMenuBar(barraMenu);

		

		articulos.add(articuloNuevo);
		//articulos.addSeparator();
		articulos.add(articuloEliminar);
		//articulos.addSeparator();
		articulos.add(articuloConsultar);

		

		articuloNuevo.addActionListener(this);
		articuloEliminar.addActionListener(this);
		articuloConsultar.addActionListener(this);

		

		clientes.add(clientesNuevo);
		//clientes.addSeparator();
		clientes.add(clientesEliminar);
		//clientes.addSeparator();
		clientes.add(clientesConsultar);

		

		clientesNuevo.addActionListener(this);
		clientesEliminar.addActionListener(this);
		clientesConsultar.addActionListener(this);

		

		facturas.add(facturasNueva);
		//facturas.addSeparator();
		facturas.add(facturaConsultar);
		

		

		facturasNueva.addActionListener(this);
		facturaConsultar.addActionListener(this);

		

		barraMenu.add(articulos);
		barraMenu.add(clientes);
		barraMenu.add(facturas);

		

		addWindowListener(this);
		setSize(350, 200);
		setVisible(true);
		d.setLayout(new FlowLayout());
		d.setSize(200, 150);
		// Para poder cerrar el Diálogo
		d.addWindowListener(this);

	}



	public static void main(String[] args) {
		new Ejercicio8();

	}

	public void windowActivated(WindowEvent we) {

	}

	public void windowClosed(WindowEvent we) {

	}

	public void windowClosing(WindowEvent we) {

		if (d.hasFocus()) {
			d.setVisible(false);
		} else {
			System.exit(0);
		}

	}

	public void windowDeactivated(WindowEvent we) {

	}

	public void windowDeiconified(WindowEvent we) {

	}

	public void windowIconified(WindowEvent we) {

	}

	public void windowOpened(WindowEvent we) {

	}

	public void actionPerformed(ActionEvent ae) {

		Object a;

		a = ae.getSource();

		if (a.equals(articuloNuevo)) {

			e.setText("Artículo Nuevo");

		} else if (a.equals(articuloEliminar)) {

			e.setText("Artículo Eliminar");

		} else if (a.equals(articuloConsultar)) {

			e.setText("Artículo Consultar");

		} else if (a.equals(clientesNuevo)) {

			e.setText("Cliente Nuevo");

		} else if (a.equals(clientesEliminar)) {

			e.setText("Cliente Eliminar");

		} else if (a.equals(clientesConsultar)) {

			e.setText("Cliente Consultar");

		} else if (a.equals(facturasNueva)) {

			e.setText("Factura Nueva");

		} else {

			e.setText("Factura Consultar");

		}

		d.add(e);
		d.setVisible(true);

	}

}