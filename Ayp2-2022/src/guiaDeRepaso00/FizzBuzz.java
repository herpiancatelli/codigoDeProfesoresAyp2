package guiaDeRepaso00;

public class FizzBuzz {

	// Opcion 1
	public void losPrimerosCienNumeros() {

		for (int contador = 1; contador < 100; contador++) {

			if (contador % 3 == 0) {

				System.out.print("," + "Fizz");

			} else if (contador % 5 == 0) {

				System.out.print("," + "Buzz");

			} else if (contador % 15 == 0) {

				System.out.print("," + "Fizz Buzz");

			} else {

				System.out.print("," + contador);
			}

		}

	}

	// Opcion 2
	public String fizzBuzz() {

		String fb = "1";
		for (int contador = 2; contador < 100; contador++) {

			if (contador % 3 == 0) {

				fb += ", Fizz";
			} else if (contador % 5 == 0) {

				fb += ", Buzz";
			} else if (contador % 15 == 0) {

				fb += ", Fizz Buzz";

			} else {

				fb += ", " + contador;
			}

		}

		return fb + ",";
	}

//	public static void main(String[] args) {
//
//		FizzBuzz x = new FizzBuzz();
//
//		x.losPrimerosCienNumeros();
//
//	}

	// Opcion 3

	private Integer n;

	public FizzBuzz(int n) {
		this.n = n;
	}

	private String mostrar() {

		if (n % 15 == 0) {
			return "FizzBuzz";
		} else if (n % 5 == 0) {
			return "Fizz";
		} else {
			return n.toString();
		}
	}

	// Opcion 4

	public void ffbb() {
		for (int i = 1; i < 20; i++) {
			System.out.println((i % 15 == 0) ? "FizzBuzz" : (i % 5 == 0) ? "Buzz" : (i % 3 == 0) ? "Fizz" : i);
		}
	}

	
	
}
