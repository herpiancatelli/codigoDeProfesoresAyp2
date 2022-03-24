package guiaDosTDD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ejercicio4Test {

	@Test
	public void devuelveHasta1erTermino() {

		ejercicio4 x = new ejercicio4();

		assertEquals(0, x.devolverSumaDeFibonacci(1));

	}
	
	@Test
	public void devuelveHasta2doTermino() {

		ejercicio4 x = new ejercicio4();

		assertEquals(2, x.devolverSumaDeFibonacci(2));

	}

	@Test
	public void devuelveHasta3erTermino() {

		ejercicio4 x = new ejercicio4();

		assertEquals(2, x.devolverSumaDeFibonacci(3));

	}
	
	@Test
	public void devuelveHasta5toTermino() {

		ejercicio4 x = new ejercicio4();

		assertEquals(10, x.devolverSumaDeFibonacci(5));

	}

	@Test
	public void devuelveHasta10moTermino() {

		ejercicio4 x = new ejercicio4();

		assertEquals(44, x.devolverSumaDeFibonacci(10));

	}
	
//	@Test
//	public void devuelveTermino4M() {
//
//		ejercicio4 x = new ejercicio4();
//
//		assertEquals(46, x.devolverSumaDeFibonacci(10));
//
//	}


}
