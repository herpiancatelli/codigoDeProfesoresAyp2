package ejerciciosDePractica;

public class Ejercicio5 {

//	Escribir una
//	función que
//	reciba dos
//	matrices de
//	NxN y
//	devuelva la
//	suma de
//	las mismas.
//	Podemos considerar
//	que las
//	matrices se
//	representan como
//	un arreglo bidimensional.

	public int[][] sumarMatrices(int[][] matrizUno, int[][] matrizDos) {

		int tamaño = matrizUno.length;
		int[][] sumatoriaDeMatrices = new int[tamaño][tamaño];

		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				sumatoriaDeMatrices[i][j] = matrizUno[i][j] + matrizDos[i][j];
			}
		}

		return sumatoriaDeMatrices;
	}

}
