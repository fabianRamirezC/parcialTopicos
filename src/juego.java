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
		
		int resultado =juego.Suma(3,5);
		assertEquals(8, resultado);
		}
@Test 
public void testMayor10(){
	JuegoB juego= new JuegoB();	
	int resultado =  juego.Mayor(1,10);
	assertEquals(11, resultado);

}
}

