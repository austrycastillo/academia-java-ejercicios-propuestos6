package net.austrycastillo.suma10;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Elabore un programa que muestre los números de 10 en 10 hasta el 100 y
		 * muestre un mensaje con la suma de los números leídos
		 */

		int num1 = 0, num2 = 100; // variable que contiene el número inicial y final
		int suma = 0; // variable donde acumularemos la suma de los números
		while (num1 <= num2) { // inicio del bucle while
			System.out.println(num1);
			suma = suma + num1; // se suma el número introducido
			num1 = num1 + 10;
		} // fin del bucle while
		System.out.println("La suma de todo es: " + suma);
	}

}
