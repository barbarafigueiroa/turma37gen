package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int valor;
		System.out.println("Digite um valor: ");
		valor = leia.nextInt();
		
		System.out.println(((valor%2) == 0) ? "valor par" : "valor impar");
		
		
		//if((valor%2) == 0) {
			//System.out.println("Valor par");
			
		//}else {
			//System.out.println("Valor ímpar");
		//}
		// (condição) ? "verdadeiro" :

	}

}
