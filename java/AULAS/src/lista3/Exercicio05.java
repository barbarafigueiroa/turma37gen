package lista3;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num = 0;
		int soma = 0;

		do {
			System.out.println("DIGITE UM NÚMERO: ");
			num = leia.nextInt();
			soma = soma + num;
		} while (num != 0);
		System.out.println("SOMA DE TODOS OS VALORES DIGITADOS: " + soma);

	}

}
