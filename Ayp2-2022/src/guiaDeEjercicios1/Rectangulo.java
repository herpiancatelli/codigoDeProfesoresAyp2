package guiaDeEjercicios1;

public class Rectangulo {

	private int posicionX;
	private int posicionY;
	private double ancho;
	private double alto;

	/*
	 * @pre:
	 * 
	 * @param ancho: no debe ser ni menores ni iguales a cero
	 * 
	 * @param alto: no debe ser ni menores ni iguales a cero
	 * 
	 * @post: se crea el constructor
	 */
	public Rectangulo(int posicionX, int posicionY, double ancho, double alto) {

		if (ancho <= 0 && alto <= 0) {
			throw new Error("El ancho y el alto no deben ser ni menores ni iguales a cero");
		} else {

			this.posicionX = posicionX;
			this.posicionY = posicionY;
			this.alto = alto;
			this.ancho = ancho;

		}

	}

	/*
	 * @pre:
	 * 
	 * @param ancho: no debe ser ni menores ni iguales a cero
	 * 
	 * @param alto: no debe ser ni menores ni iguales a cero
	 * 
	 * @post: se crea el constructor
	 */

	public Rectangulo(double ancho, double alto) {

		if (ancho <= 0 && alto <= 0) {
			throw new Error("El ancho y el alto no deben ser ni menores ni iguales a cero");
		} else {

			this.alto = alto;
			this.ancho = ancho;

		}

	}

	/*
	 * @post: retorna el area del rectangulo
	 */

	public double area() {

		return ancho * alto;

	}

	/*
	 * @post: se cambian los puntos en el plano x e y
	 */
	public void trasladarseAOtroPuntoEnElPlano(int nuevaPoscionEnX, int nuevaPosicionEnY) {

		this.posicionX = nuevaPoscionEnX;
		this.posicionY = nuevaPosicionEnY;

	}

	/*
	 * @post: devuelte true en caso de que el rectangulo contenga un punto en su
	 * interior
	 */
	public boolean contieneUnPuntoEnSuInterior(int nuevoPuntoX, int nuevoPuntoY) {

		boolean contieneUnPunto = true;

		for (int i = posicionX; i < ancho - 1; i++) {

			for (int j = posicionY; j < alto; j++) {

				if (i != nuevoPuntoX && j != nuevoPuntoY) {

					contieneUnPunto = false;

				}

			}

		}

		return contieneUnPunto;
	}

}
