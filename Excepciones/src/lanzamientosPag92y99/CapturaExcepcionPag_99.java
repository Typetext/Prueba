/**
 * 
 */
package lanzamientosPag92y99;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Carlos
 *
 */
public class CapturaExcepcionPag_99 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = -1;
		int intentos =0;
		String linea;
		BufferedReader teclado = new BufferedReader (new InputStreamReader (System.in));
		
		do{
			try{
				System.out.println("Introduzca un número entre 0 y 100");
				linea = teclado.readLine();//readLine puede lanzar la escepcion IOException
				numero = Integer.parseInt(linea);
			}catch (IOException e){
				System.out.println("Error al leer del teclado");
			}catch (NumberFormatException e){
				System.out.println("El dato introducido no es un numero entre 0 y 100");
			}finally{ //este bloque se ejecuta siempre
				intentos++; //¿Es necesario ponerlo aqui?
			}
		}while (numero<0 || numero>100); //Para que se pueda chequear cuando 
	}

}
