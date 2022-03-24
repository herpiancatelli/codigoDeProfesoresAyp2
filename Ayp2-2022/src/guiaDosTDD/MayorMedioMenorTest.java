package guiaDosTDD;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MayorMedioMenorTest {

	MayorMedioMenor x = new MayorMedioMenor();
	int[] esperado = { 2, 1, 0 };

	@Test
	public void ascendente() {

		int[] obtenido = x.devolver(0, 1, 2);

		assertArrayEquals(esperado, obtenido);

	}

	@Test
	public void devuelveUltimoMayor() {

		int[] obtenido = x.devolver(1, 0, 2);

		assertArrayEquals(esperado, obtenido);

	}

	@Test
	public void mayorAlMedio() {

		int[] obtenido = x.devolver(1, 2, 0);

		assertArrayEquals(esperado, obtenido);

	}

	@Test
	public void mayorAlMedioMenorAlPrincipio() {

		int[] obtenido = x.devolver(0, 2, 1);

		assertArrayEquals(esperado, obtenido);

	}

	@Test
	public void decreciente() {

		int[] obtenido = x.devolver(2, 1, 0);

		assertArrayEquals(esperado, obtenido);

	}

	@Test
	public void mayorAlPrincipioYMedioAlFinal() {

		int[] obtenido = x.devolver(2, 0, 1);

		assertArrayEquals(esperado, obtenido);

	}

	@Test
	public void numerosNegativos() {

		int[] obtenido = x.devolver(-1, -2, -3);
		esperado = new int[] { -1, -2, -3 };

		assertArrayEquals(esperado, obtenido);

	}
}
