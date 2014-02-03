/**
 * 
 */
package lanzamientosPag59;

/**
 * @author Carlos
 *
 */
public class AlumnoPag_59 {
	String nombre; //Asignacion de cadena a null
	String apellidos;
	int añoDeNacimiento;
	
	//COnstructor parametrizado que sustituye al constructor por defecto
	//SI queremos llamar al constructor por defecto hay que definirlo
	//Lanzamiento de excepciones en el constructor para controlar que los objetos
	//se cren correctamente o no se creen
	AlumnoPag_59 (String nombre, String apellidos, int añoDeNacimiento) throws Exception{
		if (nombre == null || apellidos==null)
			throw new Exception ("Argumentos no validos");
		if (añoDeNacimiento < 0)
			throw new Exception ("Año incorrecto");
		//Si no hay lanzamiento de excepciones se crea el objeto
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.añoDeNacimiento=añoDeNacimiento;
		}
	public String toString(){
		return "nombre\n" +nombre +
				"apellidos\n" +apellidos +
				"año de nacimiento"+añoDeNacimiento;
	}
}
