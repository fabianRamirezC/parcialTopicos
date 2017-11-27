import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class juego {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSUma() {
		JuegoB juego= new JuegoB();	
		
		int resultado =juego.Suma(1,1);
		assertEquals(2, resultado);
		}

}
