package decimal.a.binario;
import invirtiendo.cadenas.Cadena;

public class decimalABinario {

	public static String conseguirRestos(int decimal) {
		String restos = "";
		int dividendo = decimal;
		
		if(decimal == 0) {
			return "" + 0;
		}
		
		if(decimal == 1) {
			return "" + 1;
		}
		
		while(dividendo > 1) {
			if (dividendo % 2 == 0) {
				restos = restos + "" + 0;
				dividendo = dividendo / 2;
			}else {
				restos = restos + "" + 1;
				dividendo = dividendo / 2;
			}
		}
		restos = restos + "" + 1;
		return restos;
	}
	
	public static String invertirResto(int decimal) {
		String restosDeCadena = conseguirRestos(decimal); //consigo los restos de la cadena del main
		String cadenaInvertida = Cadena.invertir(restosDeCadena); //invierto la cadena usando el metodo de otro paquete
		return cadenaInvertida;
	}
	
	public static void main(String[] args) {
		int decimal = 15;
		System.out.println("El binario de " + decimal + " es: " + invertirResto(decimal));
	}
}