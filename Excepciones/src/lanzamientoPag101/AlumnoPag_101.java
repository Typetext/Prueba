/**
 * 
 */
package lanzamientoPag101;

/**
 * @author Carlos
 *
 */
public class AlumnoPag_101 {
	String nombre;
	String apellidos;
	int añoDeNacimiento;
	
AlumnoPag_101 (String nombre,String apellidos,int añoDeNacimiento)
		throws AñoFueraDeRangoException, Exception {
	if (nombre == null || apellidos == null)
		throw new Exception ("Argumentos no validos");
	if (añoDeNacimiento < 1900 || añoDeNacimiento > 2014)
		throw new AñoFueraDeRangoException ("Demasiado joven o demasiado viejo");
	
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.añoDeNacimiento = añoDeNacimiento;
	
}
public void setAñoDeNacimiento (int añoDeNacimiento) throws AñoFueraDeRangoException{
	if (añoDeNacimiento < 1900 || añoDeNacimiento > 2014)
		throw new AñoFueraDeRangoException ("Demasiado joven o demasiado viejo");
	this.añoDeNacimiento=añoDeNacimiento;
}

}
