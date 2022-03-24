package ejerciciosDePractica;

public class Ejercicio5 {

//	Escribir una
//	funci�n que
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

		int tama�o = matrizUno.length;
		int[][] sumatoriaDeMatrices = new int[tama�o][tama�o];

		for (int i = 0; i < tama�o; i++) {
			for (int j = 0; j < tama�o; j++) {
				sumatoriaDeMatrices[i][j] = matrizUno[i][j] + matrizDos[i][j];
			}
		}

		return sumatoriaDeMatrices;
	}

}
