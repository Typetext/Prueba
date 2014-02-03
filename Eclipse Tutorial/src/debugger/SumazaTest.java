/**
 * 
 */
package debugger;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

/**
 * @author Carlos
 *
 */
public class SumazaTest {

	

	
	@Test
	public void testResta() {
		int res=Sumaza.Resta(1, 1);
		Assert.assertTrue(res==0);
	}

	/**
	 * Test method for {@link debugger.Sumaza#Suma(int, int)}.
	 */
	@Test
	public void testSuma() {
		int rea=Sumaza.Suma(1, 1);
		 Assert.assertTrue(rea==2);
		fail("Not yet implemented");
	}

}
