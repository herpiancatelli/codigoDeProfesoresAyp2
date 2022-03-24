package ejerciciosDePractica;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio7ConsonantesTest {

	@Test
	public void retornaCorrectamenteLaFrase() {

		Ejercicio7Consonantes ejercicio = new Ejercicio7Consonantes();

		Assert.assertEquals("hl cm sts", ejercicio.consonantes("hola como estas"));
		Assert.assertEquals("HL L", ejercicio.consonantes("HOLA LEO"));
		Assert.assertEquals("Q ND", ejercicio.consonantes("QUE ONDA"));
	}

}
