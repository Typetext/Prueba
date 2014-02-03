/**
 * 
 */
package lanzamientoPag51;

/**
 * @author Carlos
 *
 */
public class Alumnopag_51 {
		String nombre;
		String apellidos;
		String grupo;
		
		Alumnopag_51 (String nombre, String apellidos){
			this.nombre=nombre;
			this.apellidos=apellidos;
		}
		
		public void setGrupo (String nuevoGrupo) throws Exception {
			if (nuevoGrupo == null)
				throw new Exception ("Cadena nula");
			if (nuevoGrupo.length() ==0)
				throw new Exception ("Cadena vacia");
			this.grupo=nuevoGrupo;
		}
}
