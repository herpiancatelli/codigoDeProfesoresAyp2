package guiaDeEjercicios1;

public class Persona {

	public Persona() {
	}

	public Persona(String nombre, int edad) {
	}

	public boolean equals(Persona a, Persona b) {

		return a == b;

	}

	public static void main(String[] args) {

		Persona p1 = new Persona("Jos� Ram�rez Mota", 32);
		Persona p2 = new Persona("Lucas G�mez", 53);
		Persona p3 = new Persona("Jos� Ram�rez Mota", 32);

		p1 = p2;

		System.out.println(p1.equals(p1, p3));
	}

}
