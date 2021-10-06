package lista4;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] lancamentos = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int soma = 0;
		double media = 0.0;
		int maiorPontuacao = 0;
		int contador = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print(i + ".LANÇAMENTO: ");
			lancamentos[i] = leia.nextInt();

			soma = soma + lancamentos[i];

			if (lancamentos[i] > maiorPontuacao) {
				maiorPontuacao = lancamentos[i];

			}

		}
		media = soma / 10.0;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + ".LANÇAMENTO: " + lancamentos[i] + "\n");
			if (lancamentos[i] == maiorPontuacao) {
				contador++;
			}

		}
		System.out.print("\nMÉDIA DE LANÇAMENTO: " + media + "\n");
		System.out.print("\nMAIOR PONTUAÇÃO: " + maiorPontuacao + "\n");
		System.out.print("\nNUMERO DE VEZES QUE A MAIOR PONTUAÇÃO APARECEU: " + contador + "\n");

	}

}
