package guiaDeRepaso00;

public class ejercicio8 {

	public void mostrarSecuencias(String txt) {

		int contador = 0;
		String txt_min = txt.toLowerCase().replace(" ", "");
		String abc = "abcdefghijklmnñopqrstuvwxyz";

		for (int i = 0; i < abc.length(); i++) {
			for (int j = 0; j < txt_min.length(); j++) {
				if (txt_min.charAt(j) == abc.charAt(i)) {
					contador++;
				}
			}

			if (contador != 0) {
				System.out.println(abc.charAt(i) + ":" + contador);
			}

			contador = 0;
		}

	}

	public static void main(String[] args) {

		ejercicio8 x = new ejercicio8();
		x.mostrarSecuencias("Hola mundo cruel");

	}

}
