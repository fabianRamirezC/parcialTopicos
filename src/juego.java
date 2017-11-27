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
int resultado=juego.Suma(1, 0);
assertEquals(1, resultado);
}
@Test
public void  pleno(){
	JuegoB juego= new JuegoB();	
int resultado=juego.Suma(10, 0);
assertEquals(10, resultado);
}

@Test
public void totalmax(){
    int resultado=300;
	assertEquals(300, resultado);
}

@Test
public void sumaFrame(){
	JuegoB juego= new JuegoB();	
	int resultado=juego.SUMAFRAME(1,2,3,4,5,6,7,8,9,10);
	assertEquals(0, resultado);

}
}



