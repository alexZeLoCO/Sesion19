import java.util.Scanner;			//IMPORTA SCANNER
public class PString {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.print("Introduzca una cadena: ");		//SOLICITA CADENA	
		String texto = teclado.next();			//CREA CADENA Y DA VALOR
		int contador=0;			//INICIALIZA CONTADOR

		for (int i=0;i<texto.length();i++) {		//PARA TANTAS VECES COMO CARACTERES EN LA CADENA
			//SI CARACTER ES UNA VOCAL
			if (texto.charAt(i)=='a' || texto.charAt(i)=='e' || texto.charAt(i)=='i' || texto.charAt(i)=='o' || texto.charAt(i)=='u' ) {
				contador++;			//ACTUALIZAR CONTADOR
			}
		}
		//OUTPUT
		System.out.printf("La cadena introducida tiene %d vocales.\n", contador);
		
		System.out.print("Introduzca otra cadena: ");			//SOLICITA OTRA CADENA
		String texto2 = teclado.next();		//CREA OTRA CADENA

		if (texto.length()==texto2.length()) {		//SI AMBAS CADENAS TIENEN LA MISMA LONGITUD
			int i=0;		//INICIALIZAR I
			while (i<texto.length() && texto.charAt(i)==texto2.charAt(i)) {		//MIENTRAS SEAN IGUALES
				i++;	//ACTUALIZAR I
			}
			if (texto.length()==i) {		//SI I ES LA LONGITUD DE LA CADENA (SE LLEGÓ AL FINAL)
				System.out.print("Ambas cadenas son iguales.");		//OUTPUT
			} else {		// SI NO (SE ENCONTRÓ UN CARACTER DISTINTO)
				System.out.print("Las cadenas no son iguales.");		//OUTPUT
			}
		} else {			//SI NO
		System.out.print("Las cadenas no son iguales.");		//OUTPUT
	}

}
}
