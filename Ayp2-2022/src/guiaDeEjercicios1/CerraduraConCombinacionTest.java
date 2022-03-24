package guiaDeEjercicios1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CerraduraConCombinacionTest {

	private CerraduraConCombinacion cerraduraUno;

	@Before

	public void inicializamosLaCerradura() {
		cerraduraUno = new CerraduraConCombinacion();
	}

	@Test
	public void abrirLaCerradura() {

		Assert.assertFalse(cerraduraUno.abrir(1, 2, 3));

	}

	@Test
	public void estaCerrada() {

		Assert.assertFalse(cerraduraUno.abrir(1, 2, 3));
		Assert.assertTrue(cerraduraUno.cerrar());

	}

	@Test
	public void cambiarCombinacion() {

		cerraduraUno.cambiarCombinacion(1, 2, 3, 0, 0, 0);
		Assert.assertFalse(cerraduraUno.abrir(0, 0, 0));
		Assert.assertTrue(cerraduraUno.cerrar());

	}

}
