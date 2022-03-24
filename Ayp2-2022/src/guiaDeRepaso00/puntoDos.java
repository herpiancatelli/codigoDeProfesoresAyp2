package guiaDeRepaso00;

public class puntoDos {

	public int sumaDeMultiplos(int numero) {

		int suma = 0;

		for (int contador = 3; contador < numero; contador++) {
			if (contador % 3 == 0 || contador % 5 == 0) {
				suma += contador;
			}
		}

		return suma;
	}

	public static void main(String[] args) {

		puntoDos x = new puntoDos();

		System.out.println(x.sumaDeMultiplos(16));

	}

}
