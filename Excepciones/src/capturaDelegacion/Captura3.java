/**
 * 
 */
package capturaDelegacion;

/**
 * @author Carlos
 *
 */
public class Captura3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="  12 ";
		int numero;
		try{
			numero=Integer.parseInt(str);
		}catch (NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
	}

}
