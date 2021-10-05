package lista3;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int par = 0;
		int impar = 0;
		int i = 0;
		int numero = 0;

		for (i = 1; i < 10; i++) {
			System.out.print("DIGITE UM NÚMERO \n");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				System.out.print("é par! \n");
				par = par + 1;

			} else if (numero % 2 == 1) {
				System.out.print("é ímpar! \n");
				impar = impar + 1;

			}
		}
		System.out.print("\nO Total de números pares é: " + par);
		System.out.print("\nO Total de números ímpares é: " + impar);
	}

}
