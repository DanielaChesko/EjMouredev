package eliminando.caracteres;

public class EliminandoCaracteres {

	public static void recorrerYEliminar(String str1, String str2) {
		if(str1.length() == 0 || str2.length() == 0) {
			System.out.println("Alguna de las dos cadenas estan vacias");
		}
		
		String out1 = "";
		String out2 = "";
		
		//str1
		for(int s1 = 0; s1 < str1.length(); s1++) {
			boolean str1Encontrado = false;
			
			for (int s2 = 0; s2 < str2.length(); s2++) {
				if (str1.charAt(s1) == (str2.charAt(s2))) {
					str1Encontrado = true;
					break;
				}
			}
			
			if (str1Encontrado == false) {
				out1 += str1.charAt(s1);
			}
		}
		
		//str2
		for(int s2 = 0; s2 < str2.length(); s2++) {
			boolean str2Encontrado = false;
			
			for (int s1 = 0; s1 < str1.length(); s1++) {
				if (str2.charAt(s2) == (str1.charAt(s1))) {
					str2Encontrado = true;
					break;
				}
			}
			
			if (str2Encontrado == false) {
				out2 += str2.charAt(s2);
			}
		}
		
        System.out.println("out1: " + out1);
        System.out.println("out2: " + out2);
	}
	
	public static void main(String[] args) {
		String str1 = "Hola";
		String str2 = "Que tal";
		
		recorrerYEliminar(str1, str2);
	}

}
