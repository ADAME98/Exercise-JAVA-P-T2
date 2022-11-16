package es.studium.ejercicio5;


public class Ejercicio5
{

	public static void main(String[] args)
	{
		int i;
		int suma = 0;
		int producto = 1;
		
			
			for (i=0; i<=39; i++) {
				if (i%2==0) {
					suma = suma + i; 
			} else {
				producto = producto * i;	
			}
			
			}
			System.out.println("La suma de los pares es:" + suma);
			
			System.out.println("El producto de los impares es:" + producto);

}}
