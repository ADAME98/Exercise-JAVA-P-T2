package es.studium.ejercicio2;

import java.util.Scanner;

public class Hora {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// pedimos la hora al usuario en formato 24 horas.
		System.out.print("Introduzca la hora en formato 24 horas (hh:mm): ");
		String hora24 = in.nextLine();

		// dividimos la hora en horas y minutos.
		String[] horasSeparadas = hora24.split(":");
		int horas = Integer.parseInt(horasSeparadas[0]);
		int minutos = Integer.parseInt(horasSeparadas[1]);

		// cerramos el teclado, ya que no lo vamos a volver a utlilizar.
		in.close();
		if (minutos >= 60) {
			System.out.println("Error.\nMinutos por encima de lo posible. \nVuelva a introducir la hora correcta.");
		} else if (horas >= 25) {
			System.out.println("Error.\nHora por encima de lo posible. \nVuelva a introducir la hora correcta.");
		} else {

			// convertimos la hora a formato 12 horas.
			String formatoHora = "AM";
			if (horas >= 12) {
				horas -= 12;
				formatoHora = "PM";
			}
			if (horas == 0) {
				horas = 12;
			}

			// mostramos la hora en formato 12 horas.
			System.out.println("La hora en formato 12 horas es: " + horas + ":" + minutos + " " + formatoHora);
		}
	}
}