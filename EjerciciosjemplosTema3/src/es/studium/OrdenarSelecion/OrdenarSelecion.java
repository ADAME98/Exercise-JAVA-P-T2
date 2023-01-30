package es.studium.OrdenarSelecion;

import java.util.Scanner;

public class OrdenarSelecion {

	public static void main(String[] args) {
		
		final int TAM = 10;

		int array[] = new int[TAM];

		int i, j, aux, indice_menor;

		Scanner in = new Scanner(System.in);
		
			for (i = 0; i < TAM; i++) {
				System.out.println("Dame un número entero: ");
				array[i] = in.nextInt();
			}
			for (i = 0; i < TAM; i++) 
			{
				indice_menor =i;
				for(j=0;j<TAM;j++)
				if (array[j] < array[indice_menor]) 
				{
					indice_menor = j;
				}
				aux = array[i];
				array[i] = array[indice_menor];
				array[indice_menor] = aux;
			}
			System.out.println("La tabla ordenada queda así: ");
			for(i=0;i<TAM;i++) {
				System.out.println(array[i]);
			}
	}

}
