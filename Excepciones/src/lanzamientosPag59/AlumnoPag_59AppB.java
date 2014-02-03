/**
 * 
 */
package lanzamientosPag59;

/**
 * @author Carlos
 *
 */
public class AlumnoPag_59AppB {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoPag_59 al = null;
		try{
			al= new AlumnoPag_59 (null,"Sanz",1985);
		}catch (Exception e){
			System.out.println(e);
		}
		System.out.println("Capturando la excepcion no se interrumpe"
				+ "la ejecucion del programa");
		System.out.println("Datos del alumno: "+al);
	}

}
