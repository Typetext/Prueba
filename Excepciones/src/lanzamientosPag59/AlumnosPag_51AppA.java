/**
 * 
 */
package lanzamientosPag59;

/**
 * @author Carlos
 *
 */
public class AlumnosPag_51AppA {
	// TODO Auto-generated method stub
			/*Ejercicio que controla que los objetos se creen correctamente mediante el
			 * lanzamiento de excepciones en el constructor.
			 * Para realizar este control se ha modificado el constructor de la clase Alumno, para
			 * que desde el se lance la excepcion correspondiente cuando el nombre o el a
			 * pellido del alumno sean cadena nulas  y tambien cuando el año de nacimiento sea
			 * menor que cero
			 * ASI SE CONTROLA QUE LOS OBJETOS SE CREEN CORRECTAMENTE O NO SE CREEN*/
			
			/** De nuevo el metodo main, alerta del posible lanzamiento de excepciones
			 * @throws Exception
			 */
	public static void main(String[] args) throws Exception {
		AlumnoPag_59 al = new AlumnoPag_59 (null,"Sanz",1995);
		System.out.println(al);
	}

}
