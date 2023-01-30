package es.studium.OrdenarIntercambio;

import java.util.Scanner;

public class OrdenarIntercambio {

	public static void main(String[] args) {
		final int TAM = 10;

		int array[] = new int[TAM];

		int i, j, aux;

		Scanner in = new Scanner(System.in);

		for (i = 0; i < TAM; i++) {
			System.out.println("Dame un número entero: ");
			array[i] = in.nextInt();

		}
		for (i = 0; i < TAM - 1; i++) {
			for (j = i + 1; j < TAM; j++) 
			{
				if (array[i] < array[j]) 
				{
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		in.close();

		System.out.println("La tabla ordenada queda asi: ");
		for (i = 0; i < TAM; i++) {
			System.out.println(array[i]);
		}

	}

}
