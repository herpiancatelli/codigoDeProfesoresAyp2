package guiaDeEjercicios1;

public class PersonaDemo {

	public static void main(String[] args) {

		Persona p1 = new Persona("José Ramírez Mota", 32);
		Persona p2 = new Persona("Lucas Gómez", 53);
		Persona p3 = new Persona("José Ramírez Mota", 32);

		System.out.println(p1.equals(p1, p3));
	}

}
