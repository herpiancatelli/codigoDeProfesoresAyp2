package guiaDeEjercicios1;

public class CerraduraConCombinacion {

//	Una cerradura
//	con combinación
//	tiene las
//	siguientes propiedades básicas:
//	la combinación (una secuencia de tres números) está oculta, la cerradura sólo se puede abrir si se le provee la 
//	combinación correcta, para cerrar la cerradura no hace falta la combinación, la combinación se puede cambiar pero 
//	sólo si se conoce la combinación vieja.
//	Que una cerradura tenga más de una combinación posible. ¿Cómo cambia el ejercicio?

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
