package lista3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0;
		int totalComMenos21 = 0;
		int totalComMais50 = 0;

		while (idade != -99) {
			System.out.print("DIGITE SUA IDADE: ");
			idade = leia.nextInt();
			if (idade < 21) {
				totalComMenos21 = totalComMenos21 + 1;
			} else if (idade > 50) {
				totalComMais50 = totalComMais50 + 1;
			}
		}
		System.out.print("TOTAL DE PESSOAS COM MENOS DE 21 ANOS DE IDADE: " + totalComMenos21);
		System.out.print("\nTOTAL DE PESSOAS COM MAIS DE 50 ANOS DE IDADE: " + totalComMais50);
	}

}
