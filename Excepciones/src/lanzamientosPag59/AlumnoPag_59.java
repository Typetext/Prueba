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
	int aņoDeNacimiento;
	
	//COnstructor parametrizado que sustituye al constructor por defecto
	//SI queremos llamar al constructor por defecto hay que definirlo
	//Lanzamiento de excepciones en el constructor para controlar que los objetos
	//se cren correctamente o no se creen
	AlumnoPag_59 (String nombre, String apellidos, int aņoDeNacimiento) throws Exception{
		if (nombre == null || apellidos==null)
			throw new Exception ("Argumentos no validos");
		if (aņoDeNacimiento < 0)
			throw new Exception ("Aņo incorrecto");
		//Si no hay lanzamiento de excepciones se crea el objeto
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.aņoDeNacimiento=aņoDeNacimiento;
		}
	public String toString(){
		return "nombre\n" +nombre +
				"apellidos\n" +apellidos +
				"aņo de nacimiento"+aņoDeNacimiento;
	}
}
