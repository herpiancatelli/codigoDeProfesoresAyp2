package guiaHerenciaYPolimorfismo;

public class Animal {
	protected int edad;
	public String nombre;

	public void crecer() {
		edad = edad + 7;
		System.out.println("Soy m�todo crecer");
	}

}
