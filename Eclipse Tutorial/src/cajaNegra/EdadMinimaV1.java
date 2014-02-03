/**
 * 
 */
package cajaNegra;

import java.util.Scanner;

/**
 * @author Carlos
 *
 */
public class EdadMinimaV1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad1;
		int edad2;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduzca una edad");
		edad1=sc.nextInt();
		System.out.println("Introduzca otra edad");
		edad2=sc.nextInt();
		
		if (edad1>edad2){
			System.out.println("La edad menor es "+edad2);
		}else{
			System.out.println("La edad menor es "+edad1);
		}
			sc.close();
		
			
	}

}
