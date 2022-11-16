package es.studium.ejercicio17;

import java.util.Scanner;

public class Ejercicio17
{

	public static void main(String[] args)
	{
int a,b,c; 
        
        Scanner in = new Scanner(System.in);
        System.out.println("Primer número: ");
        a=in.nextInt();
        System.out.println("Segundo número: ");
        b=in.nextInt();
        System.out.println("Tercer número: ");
        c=in.nextInt();
        in.close();
       
        System.out.println("Los números ordenados de mayor a menor son: ");  
        if((a>=b)&& (b>=c))
        {
           System.out.println("Los numeros son ordenados de mayor a menor son: " +a+ " " +b+ " " +c+ " ");  
        }
        if((a>=c)&& (c>=b))
        {
           System.out.println("Los numeros son ordenados de mayor a menor son: " +a+ " " +c+ " " +b+ " ");  
        }
        if((b>=a)&& (a>=c))
        {
            System.out.println("Los numeros son ordenados de mayor a menor son: " +b+ " " +a+ " " +c+ " ");  
         }
        if((b>=c)&& (c>=a))
        {
            System.out.println("Los numeros son ordenados de mayor a menor son: " +b+ " " +c+ " " +a+ " ");  
         }
        if((c>=a)&& (a>=b))
        {
            System.out.println("Los numeros son ordenados de mayor a menor son: " +c+ " " +a+ " " +b+ " ");  
         }
        if((c>=b)&& (b>=a))
        {
            System.out.println("Los numeros son ordenados de mayor a menor son: " +c+ " " +b+ " " +a+ " ");  
         }

	}

}
