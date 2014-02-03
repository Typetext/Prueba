/**
 * 
 */
package lanzamientoPag101;

/**
 * @author Carlos
 *
 */
public class AlumnoPag_101App {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AlumnoPag_101 al;
		
		try{
			al = new AlumnoPag_101 ("Pepe","Sanz",2010);
			al.setAñoDeNacimiento(1019);
		} catch (AñoFueraDeRangoException el) {
			System.out.println(el);
		} catch (Exception el){
			System.out.println(el);
		}
	}

}
