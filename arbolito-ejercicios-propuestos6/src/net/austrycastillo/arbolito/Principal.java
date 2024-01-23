package net.austrycastillo.arbolito;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Programe un algoritmo que permita dibujar en pantalla lo siguiente:
		 * 
		 * @
		 * 
		 * @@
		 * 
		 * @@@
		 * 
		 * @@@@
		 * 
		 * @@@@@
		 * 
		 * @@@@@@
		 * 
		 * @@@@@@@
		 * 
		 * @@@@@@@@
		 * 
		 * @@@@@@@@@
		 * 
		 * @@@@@@@@@@
		 * 
		 */
		String arroba = "@";
		for (int i = 0; i < 10; i++) {
			System.out.println(arroba);
			arroba += "@";
		}
	}

}
