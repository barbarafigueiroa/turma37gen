package lacoRepeticao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.print("DIGITE SUA IDADE: ");
		idade = leia.nextInt();
		
		while(idade >= 1) {
			System.out.print("Sua idade é " + idade);
			if(idade >= 18) {
				System.out.print("\nVocê é maior de idade");
			}
			else {
				System.out.print("\nVocê é menor de idade");
			}
			
			System.out.print("\nDIGITE SUA IDADE: ");
			idade = leia.nextInt();
		}
	}

}
