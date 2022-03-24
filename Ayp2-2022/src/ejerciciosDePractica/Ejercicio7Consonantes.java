package ejerciciosDePractica;

public class Ejercicio7Consonantes {

	public String consonantes(String frase) {

		
		String resultado = "";
		String rechazados = "aeiouAEIOUÁÉÍÓÚüÜ";

		
		//Recorro mi cadena de caracteres
		for (int i = 0; i < frase.length(); i++) {
			
			//tomo la posicion individual de cada uno de los caracteres
			char x = frase.charAt(i);

			//si dentro de mis rechazados no se encuentran los caracteres ingresados
			if (!rechazados.contains(Character.toString(x))) {
				//sumo los que no deben estar a mi resultado
				resultado = resultado + x;
			}

		}

		return resultado;
	}

}
