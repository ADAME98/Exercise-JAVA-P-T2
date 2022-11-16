package es.studium.ejercicio2; //Suma

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numero1, numero2, suma;
		

		Scanner in = new Scanner (System.in);
		in.close();

		System.out.println("Dame un número:");

		numero1 = in.nextInt();

		System.out.println("Dame otro número:");

		numero2 = in.nextInt();

		suma = numero1 + numero2; 
		System.out.println("La suma es " + suma);
		
		













	}

}
