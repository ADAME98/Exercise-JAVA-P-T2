package es.studium.OrdenaInserccion;

import java.util.Scanner;

public class OrdenaInserccion {

	public static void main(String[] args) {
		final int TAM = 10;

		int array[] = new int[TAM];

		int i, j , aux ;

		Scanner in = new Scanner(System.in);

		for (i = 0; i < TAM; i++) {
			System.out.println("Dame un número entero: ");
			array[i] = in.nextInt();

		}
		for (i = 0; i < TAM; i++) {
			j = i;
			aux = array[i];

			while (j > 0 && aux < array[j - 1]) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = aux;
		}
		System.out.println("La tabla ordenada queda así: ");
		for (i = 0; i < TAM; i++) {
			System.out.println(array[i]);
		}
		in.close();
	}
}


