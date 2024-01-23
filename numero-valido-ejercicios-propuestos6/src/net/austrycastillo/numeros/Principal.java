package net.austrycastillo.numeros;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Programa que lee un número entero entre 1 y 10 ambos valores incluidos. Si el
		 * número es válido se muestra un mensaje indicándolo y se vuelve a pedir.
		 * Finalmente se muestra por pantalla el número introducido.
		 */
		int n;
		Scanner sc = new Scanner(System.in);
		do { // inicio del do .. while
			System.out.print("Escribe un número entero entre 1 y 10: ");
			n = sc.nextInt();
			if (n < 1 || n > 10) {
				System.out.println("Valor no válido");
			}
		} while (n < 1 || n > 10); // fin del do .. while

		System.out.println("Número valido introducido: " + n);
	}

}
