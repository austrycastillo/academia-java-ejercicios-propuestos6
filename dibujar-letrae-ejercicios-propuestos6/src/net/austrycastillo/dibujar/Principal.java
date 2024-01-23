package net.austrycastillo.dibujar;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Desarrolle un algoritmo que permita dibujar en pantalla lo siguiente:
		 * 
		 * @@@@@@
		 * 
		 * @@@
		 * 
		 * @@@@@@
		 * 
		 * @@@
		 * 
		 * @@@@@@
		 * 
		 */
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0)
				System.out.println("@@@@@@");
			else
				System.out.println("@@@");
		}
	}

}
