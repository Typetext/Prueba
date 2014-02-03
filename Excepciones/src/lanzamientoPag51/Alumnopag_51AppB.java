/**
 * 
 */
package lanzamientoPag51;

/**
 * @author Carlos
 *
 */
public class Alumnopag_51AppB {
	public static void main (String[]args) {
	Alumnopag_51 al =new Alumnopag_51 ("Pepe","Sanz");
	
		try {
			al.setGrupo("");//al.setGrupo(null);
		} catch (Exception e) {
			System.out.println(e);
		} //al.setGrupo(null);
	System.out.println("No Capturando la excepcion se interrumpe"
			+ "la ejecucion del programa");
	}
}
