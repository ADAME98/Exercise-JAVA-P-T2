package es.studium.OctavoEjemplo;

import java.awt.*;

public class OctavoEjemplo {

	Frame ventana = new Frame("Opci�n �nica");
	// En este caso, primero se define un grupo
	CheckboxGroup chkgrGrupo = new CheckboxGroup();
	// Al crear los checkboxes, se indica la etiqueta, si est� o no
	// activo y el grupo al que pertenece. En un grupo, solamente
	// podr� estar activo un checkbox
	Checkbox chkUno = new Checkbox("Opci�n Uno", false, chkgrGrupo);
	Checkbox chkDos = new Checkbox("Opci�n Dos", false, chkgrGrupo);
	Checkbox chkTres = new Checkbox("Opci�n Tres", false, chkgrGrupo);

	public OctavoEjemplo() {
		ventana.setLayout(new FlowLayout());
		ventana.add(chkUno);
		ventana.add(chkDos);
		ventana.add(chkTres);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(100, 150);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new OctavoEjemplo();
	}
}
