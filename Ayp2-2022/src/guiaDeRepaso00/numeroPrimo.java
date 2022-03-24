package guiaDeRepaso00;

public class numeroPrimo {

	public boolean esNumeroPrimo(int numeroAEvaluar) {

		int contador = 2;

		while ((contador < numeroAEvaluar) && (numeroAEvaluar % contador != 0)) {

			contador++;
		}
		return (contador == numeroAEvaluar);
	}

	public static void main(String[] args) {

		numeroPrimo x = new numeroPrimo();

		System.out.println(x.esNumeroPrimo(3));
		System.out.println(x.esNumeroPrimo(5));
		System.out.println(x.esNumeroPrimo(10));
		System.out.println(x.esNumeroPrimo(500));
	}

}
