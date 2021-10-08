package app;

import java.util.Scanner;
import entities.Cliente;

public class Exercicio01app {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int dataHoje = 07;
		int mesAtual = 10;

		Cliente cliente1 = new Cliente();

		cliente1.nome = "";
		cliente1.endereco = "";
		cliente1.diaNiversario = 0;
		cliente1.mesNiversario = 0;
		cliente1.anoNascimento = 0;
		cliente1.cpf = "";
		cliente1.rg = 0;
		cliente1.email = " ";
		cliente1.pronome = ' ';

		System.out.print("\n");
		System.out.print("INFORME A DATA DE HOJE: ");
		dataHoje = leia.nextInt();
		System.out.print("INFORME O MES ATUAL: ");
		mesAtual = leia.nextInt();
		System.out.print(" _______________________________________\n");
		System.out.print("|_________REALIZE SEU CADASTRO__________|\n\n");
		System.out.print("|NOME: ");
		cliente1.nome = leia.next();
		System.out.print("|COMO GOSTARIA DE SER CHAMADX? A/O/E: ");
		cliente1.pronome = leia.next().charAt(0);
		System.out.print("|ENDEREÇO: ");
		cliente1.endereco = leia.next();
		System.out.print("|DIA DO ANIVERSÁRIO: ");
		cliente1.diaNiversario = leia.nextInt();
		System.out.print("|MÊS DO ANIVERSÁRIO: ");
		cliente1.mesNiversario = leia.nextInt();
		System.out.print("|ANO DE NASCIMENTO: ");
		cliente1.anoNascimento = leia.nextInt();
		System.out.print("|CPF: ");
		cliente1.cpf = leia.next();
		System.out.print("|RG: ");
		cliente1.rg = leia.nextInt();
		System.out.print("|E-MAIL: ");
		cliente1.email = leia.next();

		System.out.println("Olá,Seja Bem vind(" + cliente1.pronome + "), turu bom? que bom te ter conosco!");
		
		cliente1.mensagemFelizAniversario(07);
	}

}
