package guiaDeEjercicios1;

public class BicicletaDemo {

	public static void main(String[] args) {
		Bicicleta bici1 = new Bicicleta(0, 0, 1);
		bici1.acelerar(5);
		bici1.frenar(2);
		bici1.cambiarMarca("Pepito");
		System.out.println(bici1);

		Bicicleta bici2 = new Bicicleta(0, 0, 1);
		bici2.acelerar(15);
		bici2.frenar(2);
		bici2.cambiarMarca("sss");
		System.out.println(bici2);
	}

}
