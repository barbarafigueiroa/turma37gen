package lista2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int maiorNumero = 0;
		
		System.out.print("DIGITE UM N�MERO:");
		numero1 = leia.nextInt();
		
		System.out.print("DIGITE OUTRO N�MERO:");
		numero2 = leia.nextInt();
		
		System.out.print("DIGITE MAIS OUTRO N�MERO:");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			maiorNumero = numero1;
			
		}else if(numero2 > numero1 && numero2 > numero3) {
			maiorNumero = numero2;
			
		}else if(numero3> numero1 && numero3 > numero2) {
			maiorNumero = numero3;
			
		}
		System.out.print("O MAIOR VALOR FOI: " + maiorNumero);
	}

}
