package es.studium.ejercicio13;

import java.util.Scanner;

public class Ejercicio13
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = in.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);  
             in.close();

	}}

}
