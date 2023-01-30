package es.studium.TercerEjemplo;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
public class TercerEjemplo {
	
	Frame window = new Frame();
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre: ");
	TextField txtNombre = new TextField(20);
	
	TercerEjemplo()
	{
		window.setTitle("Componentes");
		window.setSize(300,200);
		window.setLayout(new FlowLayout());
		//lblNombre.setLocation(200,500);
		window.add(lblNombre);
		window.add(txtNombre);
		window.add(btnAceptar);
		window.setBackground(Color.DARK_GRAY);
		window.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new TercerEjemplo();

	}

}
