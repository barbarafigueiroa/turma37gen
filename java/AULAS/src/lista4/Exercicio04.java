package lista4;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int soma = 0;
		int somaDiagonalPrincipal = 0;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("INFORME UM VALOR PARA LINHA E OUTRO PARA COLUNA: ");
				matriz[linha][coluna] = leia.nextInt();
				soma = soma + matriz[linha][coluna];
				if (linha == coluna) {
					somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[linha][coluna];
				}
			}
		}
		System.out.print("\nSOMA DOS VALORES DA DIAGONAL: " + somaDiagonalPrincipal + "\n");
		System.out.print("\nSOMA DE TODOS OS VALORES DA MATRIZ: " + soma + "\n");

	}

}
