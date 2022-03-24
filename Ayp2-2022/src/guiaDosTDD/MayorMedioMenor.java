package guiaDosTDD;

public class MayorMedioMenor {
//	Dados tres
//	valores numéricos enteros,
//	indicar cual
//	es el mayor,
//	cual es
//	el del
//	medio y
//	cual el
//	menor.Considerar que
//	los tres
//	valores son diferentes.

//	public int[] devolver(int a, int b, int c) {
//
//		int[] valoresIngresadas = new int[3];
//
//		if (a > b && a > c) {
//
//			valoresIngresadas[0] = a;
//
//			if (b > c) {
//				valoresIngresadas[1] = b;
//				valoresIngresadas[2] = c;
//			} else {
//				valoresIngresadas[1] = c;
//				valoresIngresadas[2] = b;
//			}
//
//		} else if (c > b && c > a) {
//			valoresIngresadas[0] = c;
//			if (a > b) {
//				valoresIngresadas[1] = a;
//				valoresIngresadas[2] = b;
//			} else {
//				valoresIngresadas[1] = b;
//				valoresIngresadas[2] = a;
//			}
//		} else {
//			valoresIngresadas[0] = b;
//
//			if (a > c) {
//
//				valoresIngresadas[1] = a;
//				valoresIngresadas[2] = c;
//			} else {
//				valoresIngresadas[1] = c;
//				valoresIngresadas[2] = a;
//			}
//		}
//
//		return valoresIngresadas;
//	}
//
//	public int[] devolverv2(int a, int b, int c) {
//		int[] valoresIngresadas = new int[3];
//
//		// MAYOR
//		valoresIngresadas[0] = a;
//		if (b > valoresIngresadas[0]) {
//			valoresIngresadas[0] = b;
//		}
//		if (c > valoresIngresadas[0]) {
//			valoresIngresadas[0] = c;
//		}
//
//		// MENOR
//		valoresIngresadas[2] = a;
//		if (b < valoresIngresadas[2]) {
//			valoresIngresadas[2] = b;
//		}
//		if (c < valoresIngresadas[2]) {
//			valoresIngresadas[2] = c;
//		}
//
//		// MEDIO
//		if (a > valoresIngresadas[2] && a < valoresIngresadas[0]) {
//			valoresIngresadas[1] = a;
//		}
//
//		if (b > valoresIngresadas[2] && b < valoresIngresadas[0]) {
//			valoresIngresadas[1] = b;
//		}
//
//		if (c > valoresIngresadas[2] && c < valoresIngresadas[0]) {
//			valoresIngresadas[1] = c;
//		}
//
//		return valoresIngresadas;
//	}

	public int[] devolver(int a, int b, int c) {
		int[] valoresIngresadas = new int[3];

		// MAYOR
		valoresIngresadas[0] = mayor(mayor(a, b), c);

		// MENOR
		valoresIngresadas[2] = menor(menor(a, b), c);

		// MEDIO
		if (a > valoresIngresadas[2] && a < valoresIngresadas[0]) {
			valoresIngresadas[1] = a;
		}

		if (b > valoresIngresadas[2] && b < valoresIngresadas[0]) {
			valoresIngresadas[1] = b;
		}

		if (c > valoresIngresadas[2] && c < valoresIngresadas[0]) {
			valoresIngresadas[1] = c;
		}

		return valoresIngresadas;
	}

	private int mayor(int a, int b) {
		return (a > b) ? a : b;
	}

	private int menor(int a, int b) {
		return (a < b) ? a : b;
	}

}
