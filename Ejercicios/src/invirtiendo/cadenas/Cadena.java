package invirtiendo.cadenas;

public class Cadena {

	public static String invertir(String cadena) {
		String cadenaInvertida = "";
		
		for (int i = cadena.length()-1 ; i >= 0 ;i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		
		return cadenaInvertida;
	}
	
	public static void main(String[] args) {
		String cadena = "Hola mundo";
		System.out.println(invertir(cadena));
	}
}