package ejerciciosDePractica;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio5test {

	@Test
	public void pruebaDeSuma() {

		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 5, 6 }, { 7, 8 } };
		int[][] c = { { 6, 8 }, { 10, 12 } };

		
		
		
		Ejercicio5 x = new Ejercicio5();
		Assert.assertArrayEquals(c, x.sumarMatrices(a, b));

	}

}
