package es.studium.ejercicio1;

import java.util.Scanner;

public class Pseudocodigo {

	public static void main(String[] args) {
		// Aquí incluimos las variables que vamos a necesitar.
		int n, a = 0, b = 0;

		// Incluimos el Scanner para que el usuario pueda incluir los datos.
		Scanner in = new Scanner(System.in);
		// A partir del "do" va a ejecutar el código comprendido entre sus llaves
		// mientras no se cumpla la condición del "while"( cuando "n" valga 0 parará).
		do {
			System.out.println("Dame un numero entero:");
			n = in.nextInt();
			
			// Aquí es donde almacenaremos los numero en negativo.
			// La variable “a” empieza en 0 y resta 1 a su contador si el numero introducido
			// es negativo hasta que paremos el bucle.
			if (n < 0) {
				a = a - 1;
			}
			// Aquí es donde almacenamos los números en positivo, "el 0 también está
			// incluido como numero positivo".
			// La variable “b” empieza en 0 y suma 1 a su contador si el numero introducido
			// es positivo hasta que paremos el bucle.
			// Hay que tener en cuenta que el 0 cuenta como positivo y sumara 1 al contador
			// "b".
			else {
				b = b + 1;
			}
		}
		// El “while” está indicando que cuando el usuario ponga "0", el programa
		// contará los datos introducidos. Y parara el bucle.
		while (n != 0);
		
		// Cerramos el teclado, ya que no lo vamos a volver a utilizar.
					in.close();
		// Cuando acabe de contar, imprimirá por pantalla los resultados almacenados.
		System.out.println(a);
		System.out.println(b);

	}

}
