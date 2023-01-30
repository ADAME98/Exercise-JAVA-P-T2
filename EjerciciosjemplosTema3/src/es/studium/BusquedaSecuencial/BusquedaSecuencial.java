package es.studium.BusquedaSecuencial;
import java.util.Scanner;
public class BusquedaSecuencial {

	public static void main(String[] args) {
		
		final int TAM =10;
		
		int tabla[] = new int [TAM];
		
		
		int i;
		boolean encontrado;
		int elemento;
		
		Scanner in = new Scanner(System.in);
		
		for(i=0;i<TAM-1;i++) {
			System.out.println("Dame un numero entero: ");
			tabla[i] = in.nextInt();
		}
		System.out.println("Dame el número a buscar: ");
		elemento= in.nextInt();
		
		encontrado = false;
		i =0;
		
		while((!encontrado)&&(i < TAM)){
			if (tabla[i] == elemento) {
				encontrado = true;
			}else {
				i++;
			}
			
		}
		if (encontrado == true) {
			System.out.println("El elemento se encontro en la posicion "+i+".");
			
		}else {
			System.out.println("El elemento no se ha  encontrado.");
		}
in.close();
	}

}
