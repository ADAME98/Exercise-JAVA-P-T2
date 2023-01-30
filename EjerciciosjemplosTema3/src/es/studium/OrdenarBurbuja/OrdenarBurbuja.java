package es.studium.OrdenarBurbuja;

import java.util.Scanner;

public class OrdenarBurbuja {

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
			for (j = i + 1; j < TAM -i -1; j++) 
			{
				if (array[i] > array[j+1]) 
				{
					aux = array[i];
					array[i] = array[j+1];
					array[j+1] = aux;
				}
			}
		}	
		System.out.println("La tabla ordenada queda así: ");
		for(i=0;i<TAM;i++) {
			System.out.println(array[i]);	}
		in.close();	
	}
}
