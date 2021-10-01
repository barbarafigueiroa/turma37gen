package lista1;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double mediaSemPeso = 0.0;
		double mediaComPeso = 0.0;
		Scanner leia = new Scanner(System.in);

		System.out.println("DIGITE O PRIMEIRA NOTA: ");
		nota1 = leia.nextDouble();
		System.out.println("DIGITE O SEGUNDA NOTA: ");
		nota2 = leia.nextDouble();
		System.out.println("DIGITE O TERCEIRA NOTA: ");
		nota3 = leia.nextDouble();

		mediaSemPeso = (nota1 + nota2 + nota3) / 3;
		System.out.println("MÉDIA DO ALUNO SEM PESO DE NOTAS: " + mediaSemPeso);
		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 5;
		mediaComPeso = (nota1 + nota2 + nota3) / 3;
		System.out.println("MÉDIA DO ALUNO COM PESO DE NOTAS: " + mediaComPeso);

	}

}
