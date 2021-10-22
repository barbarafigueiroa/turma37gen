package app;

import java.util.Scanner;
import entities.ContaPoupanca;

public class aplication {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double auxSaldo = 0;
		ContaPoupanca cp1 = new ContaPoupanca(1002182, "08964250451", 16);

		//cp1.setSaldo(1000.0);
		cp1.ativarConta();
		System.out.println("         $ $ $    BANGOO - G6   $ $ $");
		System.out.println("     >> AQUI VOCÊ ENTRA LISO E SAI RICO <<\n");
		System.out.println("[ESCOLHA A OPÇÃO ABAIXO E DIGITE O NÚMERO CORRESPONDENTE]\n");
		System.out.println("             [1-CONTA POUPANÇA  ]");
		System.out.println("             [2-CONTA CORRENTE  ]");
		System.out.println("             [3-CONTA ESPECIAL  ]");
		System.out.println("             [4-CONTA EMPRESA   ]");
		System.out.println("             [5-CONTA ESTUDANTIL]");
		System.out.println("             [6-SAIR            ]\n");
		System.out.println("DIGITE SUA ESCOLHA: ");
		int escolhaOperacao = leia.nextInt();
		switch (escolhaOperacao) {
		
		case 1: {
			System.out.println(">> CONTA POUPANÇA <<");
			System.out.println("DIGITE O DIA DE HOJE: ");
			int diaAtual = leia.nextInt();
			cp1.setDiaAniversario(diaAtual);
			System.out.println("DIGITE O DIA DO SEU ANIVERSÁRIO: ");
			int diaAniver = leia.nextInt();
			cp1.setDiaAniversario(diaAniver);
			//cp1.correcao(diaAtual, diaAniver, auxSaldo);
			
		}
			break;
		case 2:{
			System.out.println(">> CONTA CORRENTE <<");
			
		}
		break;

		}

	}

}