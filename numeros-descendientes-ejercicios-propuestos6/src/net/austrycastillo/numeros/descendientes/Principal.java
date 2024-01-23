package net.austrycastillo.numeros.descendientes;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Arme un algoritmo que imprima los números del 100 al 1 sin mostrar en
		 * pantalla los números 88, 66 y 22
		 */
		for (int i = 100; i >= 1; i--) {
			if (i != 88 && i != 66 && i != 22)
				System.out.println(i);
		}
	}

}
