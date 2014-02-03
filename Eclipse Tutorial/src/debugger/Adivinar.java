/**
 * 
 */
package debugger;

import java.util.Scanner;

/**
 * @author Carlos
 * 
 */
public class Adivinar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1;
		int cont;
		int num2;

		System.out.println("Adivine el numero");
		System.out
				.println("A continuación se generara un numero aleatorio del 1 al 100");
		num1 = (int) Math.round((Math.random() * 100));

		Scanner sc = new Scanner(System.in);
		cont = 0;
		num2 = 0;
		do {

			System.out.println("\nIntroduzca número entero del 1 a 100");
			num2 = sc.nextInt();

			System.out.println("Número fallido, prueba de nuevo :)");
			cont++;
			if (num1 != num2) {
				if (num1 > num2) {
					System.out.println("El número es mayor que " + num2);
				} else if (num1 < num2) {
					System.out.println("El número es menor que " + num2);
				}
			}

		} while (num1 != num2);

		System.out.println("¡Has acertado!");
		System.out.println("El numero de intentos ha sido " + cont);
		sc.close();
	}

}
