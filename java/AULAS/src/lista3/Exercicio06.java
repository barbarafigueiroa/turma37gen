package lista3;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int numero = 0;
		int soma = 0;
		int contador = 0;
		int media = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("DIGITE UM N�MERO: ");
			numero = leia.nextInt();

			if (numero > 0 && numero % 3 == 0) {

				soma = soma + numero;
				contador++;
			}

		} while (numero != 0);
		media = (soma / contador);
		System.out.println("M�DIA DOS N�MEROS DIVIS�VEIS POR 3: " + media);

	}

}
