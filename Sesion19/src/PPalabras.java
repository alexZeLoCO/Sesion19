import java.util.Scanner;		//IMPORTA SCANNER
public class PPalabras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		System.out.printf("Introdzca 5 cadenas de texto separadas por espacios.");			//SOLICITA DATO
		String [] vector = new String [5];		//CREA ARRAY DE STRINGS
		int mayor=0;		//INICIALIZA MAYOR
		for (int i=0;i<vector.length;i++) {
			String texto = teclado.next();			//CREA CADENA Y DA VALOR
			vector [i] = texto;		//RELLENA VECTOR CON CADENA
			if (i>0 && vector[i].length()>vector[mayor].length()) {		//SI CADENA ES MAYOR QUE ANTERIOR
				mayor = i;		//ACTUALIA MAYOR
			}
		}
					//OUTPUT
		System.out.printf("La cadena más larga introducida es la número %d, %s.",mayor+1,vector[mayor]);
		
	}

}