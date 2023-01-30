package es.studium.DecimoCuartoEjemplo;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class DecimoCuartoEjemplo {
	Frame ventana = new Frame("AwtMenu");
// En primer lugar creamos la barra de men�
	MenuBar barraMenu = new MenuBar();
// Ahora creamos los elementos principales del men�
	Menu menuArchivo = new Menu("Archivo");
	Menu menuEdicion = new Menu("Edici�n");
// Y Ahora los elementos de cada opci�n del men� principal
// Primero los de Archivo
//menuArchivoNuevo contendr� otros elementos, por lo que es tipo Menu
	Menu menuArchivoNuevo = new Menu("Nuevo");
//Los siguientes son MenuItem pues dentro no tienen submen�s
	MenuItem mniArchivoAbrir = new MenuItem("Abrir");
	MenuItem mniArchivoGuardar = new MenuItem("Guardar");
	MenuItem mniArchivoSalir = new MenuItem("Salir");
//Luego los de Edici�n
	MenuItem mniEdicionCortar = new MenuItem("Cortar");
	MenuItem mniEdicionCopiar = new MenuItem("Copiar");
	MenuItem mniEdicionPegar = new MenuItem("Pegar");
//Por �ltimo, creamos los elementos dentro de Nuevo
	MenuItem mniArchivoNuevoVentana = new MenuItem("Ventana");
	MenuItem mniArchivoNuevoDialogo = new MenuItem("Di�logo");

	public DecimoCuartoEjemplo() {
		ventana.setLayout(new FlowLayout());
//Establecemos la barra de men�
		ventana.setMenuBar(barraMenu);
//Empezamos a a�adirle los elementos
//Primero a menuArchivoNuevo, le a�adimos sus submen�s
		menuArchivoNuevo.add(mniArchivoNuevoVentana);
		menuArchivoNuevo.add(mniArchivoNuevoDialogo);
//Seguimos con los elementos de archivo
		menuArchivo.add(menuArchivoNuevo);
		menuArchivo.add(mniArchivoAbrir);
		menuArchivo.add(mniArchivoGuardar);
//A�adimos un separador
		menuArchivo.addSeparator();
		menuArchivo.add(mniArchivoSalir);
//Y ahora a edicion los suyos
		menuEdicion.add(mniEdicionCortar);
		menuEdicion.add(mniEdicionCopiar);
		menuEdicion.add(mniEdicionPegar);
//Por �ltimo agregamos los elementos archivo y edicion a la barra
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEdicion);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 400);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new DecimoCuartoEjemplo();
	}
}
