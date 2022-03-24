package guiaDeEjercicios1;

import org.junit.Assert;
import org.junit.Test;

public class RectanguloTest {

	@Test
	public void calcularElArea() {

		Rectangulo rectangulito = new Rectangulo(2, 2, 3, 3);

		Assert.assertEquals(9, rectangulito.area(), 0);

	}

	@Test
	public void contieneUnPuntoEnSuInterior() {

		Rectangulo rectangulito = new Rectangulo(2, 2, 3, 3);

		Assert.assertTrue(rectangulito.contieneUnPuntoEnSuInterior(4, 4));

	}

}
