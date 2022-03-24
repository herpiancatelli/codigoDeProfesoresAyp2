package guiaDeRepaso00;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class primosTest {
	
	numeroPrimo x;
	
	void setUp() throws Exception{
		x = new numeroPrimo();
	}

	
	@Test
	public void testUno() {
		assertFalse(x.esNumeroPrimo(4));
	}
	
	
}
