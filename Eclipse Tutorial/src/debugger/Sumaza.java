
package debugger;

import java.util.Scanner;

/**
 * @author Carlos
 *
 */
public class Sumaza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Primer entero");
		num1=sc.nextInt();
		System.out.println("Segundo entero");
		num2=sc.nextInt();
		System.out.println("La suma es "+Suma(num1,num2));
		System.out.println("La resta es "+Resta(num1,num2));
		
		sc.close();
	}



	public static  int Resta(int num1, int num2) {
		
		return (num1-num2);
	}


	public static  int Suma(int num1, int num2) {
		
		return (num1+num2);
	}

}
