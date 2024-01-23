package net.austrycastillo.tabla;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Programa un sistema que permita solicitar un número entero entre 1 y 10 y
		 * muestre por pantalla la tabla de multiplicar de dicho número
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número entero entre 1 y 10: ");
		int num = sc.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}

}
