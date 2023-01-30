package es.studium.ejercicio4;

import java.util.Scanner;

public class OrdenacionPorTeclado {

	public static void main(String[] args) {
		final int TAM = 10;

		int array[] = new int[TAM];

		int i, j, aux;

		Scanner in = new Scanner(System.in);
		// Aqui le pedimos al usuario que introduzca los datos.
		for (i = 0; i < TAM; i++) {
			System.out.println("Dame un número entero: ");
			array[i] = in.nextInt();

		}
		for (i = 0; i < TAM - 1; i++) {
			for (j = i + 1; j < TAM; j++) {
				if (array[i] < array[j]) // Si cambiamos el simbolo cambiara el orden al imprimirlo por pantalla.
				{
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		// Cerramos el teclado, ya que no lo vamos a volver a utilizar.
		in.close();
		System.out.println("La tabla ordenada queda asi: ");
		for (i = 0; i < TAM; i++) {
			System.out.println(array[i]);
		}

	}

}
