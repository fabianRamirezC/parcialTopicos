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
@Test ()
public void testMayor19(){
	JuegoB juego= new JuegoB();	
	int resultado =  juego.Suma(9,10);
	assertEquals(19, resultado);
}
@Test
public void testPositivo(){

	JuegoB juego= new JuegoB();	
int resultado=juego.Suma(-1, 0);
assertEquals(-1, resultado);
}
}


