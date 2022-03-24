package guiaDosTDD;

public class ejercicio4 {

//	 Empezando por 1 y 2, los primeros 10 términos serán:
//		 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ..

	public int devolverSumaDeFibonacci(int i) {

		// termino par 2
		if (i == 1) {
			return 0;
		}

		int suma = 2;
		int j = 3;

		while (fibonacci(j) < 4000000) {

			if (fibonacci(j) % 2 == 0) {
				suma += fibonacci(j);
			}

			j++;

		}

//		for (int j = 3; j <= i; j++) {
//
//			if (fibonacci(j) % 2 == 0) {
//
//				suma += fibonacci(j);
//
//			}
//
//		}

		return suma;
	}

	private int fibonacci(int n) {

		if (n <= 2) {
			return n;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);

	}

//	public static int getSum3(int limit) {
//		int sum = 0;
//		int i = 2;
//		int fn = f(i);
//		while (fn < limit) {
//			fn = f(++i);
//		}
//		return (f(i + 1) - 1) / 2;
//	}
}
