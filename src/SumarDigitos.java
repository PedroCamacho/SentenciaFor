import java.util.Scanner;

public class SumarDigitos {

	int sumador (String cadena){
		int respuesta=0;
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if (Character.isDigit(letra))
					respuesta+=Character.getNumericValue(letra);
		}
		return respuesta;
	}
	
	public static void main(String[] args) {
		//Entrada
		System.out.print("Introduzca una cadena de caracteres: ");
		Scanner sc = new Scanner (System.in);
		String entrada = sc.nextLine();
		int suma;
		SumarDigitos programa = new SumarDigitos ();
		
		//Proceso
		suma = programa.sumador (entrada);
		
		//Salida
		System.out.println("La suma de los dígitos de la cadena es: " + suma);

	}

}
