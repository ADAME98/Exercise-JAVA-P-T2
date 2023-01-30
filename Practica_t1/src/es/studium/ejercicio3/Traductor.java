package es.studium.ejercicio3;

import java.util.Scanner;

public class Traductor {

	public static void main(String[] args) {

		// Creamos un array bidimensional con las palabras a traducir.
		String[][] diccionarioPalabras = { { "yo", "i" }, { "tu", "you" }, { "el", "he" }, { "ella", "she" },
				{ "soy", "am" }, { "eres", "are" }, { "es", "is" }, { "alto", "tall" }, { "bajo", "short" },
				{ "español", "spanish" }, {"nosotros", "we"}, {"somos","are"}};
		// Creamos un objeto Scanner para leer la frase ingresada por el usuario.
		Scanner in = new Scanner(System.in);

		// Pedimos al usuario que ingrese la frase a traducir.
		System.out.print("Ingresa la frase a traducir: ");
		String frase = in.nextLine();

		in.close();

		// Dividimos la frase en palabras.
		String[] palabras = frase.split(" ");

		// Inicializamos la variable resultado.
		String resultado = "";

		// Recorremos las palabras de la frase.
		for (String palabra : palabras) {
			// Recorremos el array bidimensional buscando la palabra a traducir.
			for (String[] traduccion : diccionarioPalabras) {
				// Si encontramos la palabra en el array, la reemplazamos por su traducción.
				if (palabra.equals(traduccion[0]) || palabra.equals(traduccion[1])) {
					resultado += traduccion[palabra.equals(traduccion[0]) ? 1 : 0] + " ";
					break;
				}
			}
			// Si la palabra no se encuentra en el array, la dejamos sin cambios.
			if (!resultado.endsWith(" ")) {
				resultado += palabra + " ";
			}
		}

		// Mostramos la frase traducida al usuario.
		System.out.println("Frase traducida: " + resultado);

	}
}
