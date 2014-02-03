/**
 * 
 */
package capturaDelegacion;

/**
 * @author Carlos
 *
 */
public class Captura7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor=5,cero=0;
		int [] array = {1,2,3};
		try{
			try{
				valor= valor/cero; //Division por cero
				array[4]=5; //aceso a una psoicion no disponiblo. Probar
				
			}catch (ArithmeticException e){
				System.out.println("Division por cero");
				System.out.println(e.getMessage());
				//throw e;
			}catch (Exception e){
				System.out.println("Indice del array fuera de rango");
				//System.out.println(e);
			}
		}catch (Exception e){
			System.out.println("catch externo recoje la excepcion del interno"
					);
		}
	}

}
