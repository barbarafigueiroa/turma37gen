package lacoRepeticao;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.print("DIGITE SUA IDADE: ");
		idade = leia.nextInt();
		
		 do {

			 	System.out.print("Sua idade � " + idade);
			 	if(idade >= 18) {
				System.out.print("\nVoc� � maior de idade");
			 	}
			 	else {
				System.out.print("\nVoc� � menor de idade");
			 	}
			 	System.out.print("\nDIGITE SUA IDADE: ");
				idade = leia.nextInt();
			 	
		 }
		 while(idade >= 1);

	}

}
