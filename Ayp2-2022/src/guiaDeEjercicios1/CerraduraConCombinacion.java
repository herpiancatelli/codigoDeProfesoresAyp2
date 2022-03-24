package guiaDeEjercicios1;

public class CerraduraConCombinacion {

//	Una cerradura
//	con combinaci�n
//	tiene las
//	siguientes propiedades b�sicas:
//	la combinaci�n (una secuencia de tres n�meros) est� oculta, la cerradura s�lo se puede abrir si se le provee la 
//	combinaci�n correcta, para cerrar la cerradura no hace falta la combinaci�n, la combinaci�n se puede cambiar pero 
//	s�lo si se conoce la combinaci�n vieja.
//	Que una cerradura tenga m�s de una combinaci�n posible. �C�mo cambia el ejercicio?

	private int[] cantidadDeCombinaciones;
	private boolean estaCerradaLaCerradura = true;
	private int a = 1;
	private int b = 2;
	private int c = 3;
	
	

	private boolean combinacionCorrecta(int a, int b, int c) {

		return this.a == a && this.b == b && this.c == c;
	}

	public boolean abrir(int a, int b, int c) {

		if (combinacionCorrecta(a, b, c)) {

			estaCerradaLaCerradura = false;

		}

		return estaCerradaLaCerradura;

	}

	public boolean cerrar() {
		return estaCerradaLaCerradura = true;

	}

	public void cambiarCombinacion(int a, int b, int c, int n1, int n2, int n3) {

		if (combinacionCorrecta(a, b, c)) {

			this.a = n1;
			this.b = n2;
			this.c = n3;

		}

	}

}
