package condicional;

import java.util.Scanner;

public class desafioAuxilio {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 String nome;
		 char respostaOutroAxulio;
		 final double auxilioEmergencial = 600.0;
		 final double auxilioChefaFmilia = 1200.0;
		 double auxilioEmergencialFinal;
		 char pronome;
		 char respostaChefeFamilia;
		 int quantidadeFilhos;
		 double valorPorFilho;
		 
		
		System.out.print("DIGITE SEU NOME COMPLETO: ");
		nome = leia.next();
		
		
		System.out.print("VOC� RECEBE ALGUM TIPO DE AJUDA FINANCEIRA DO GOVERNO: ");
		respostaOutroAxulio = leia.next().toUpperCase().charAt(0);
		
		if(respostaOutroAxulio == 'S') {
			System.out.print("Voc� n�o pode receber outro aux�lio");
			
		}
		else if(respostaOutroAxulio == 'N') {
			System.out.print("COMO VOC� SE IDENTIFICA? A/O: ");
			pronome = leia.next().toUpperCase().charAt(0);
			
			if( pronome == 'A') {
				System.out.print("VOC� SE CONSIDERA CHEFE DE FAM�LIA? ");
				respostaChefeFamilia = leia.next().toUpperCase().charAt(0);
				
				if(respostaChefeFamilia == 'S') {
					System.out.print("INFORME QUANTOS FILHOS VOC� TEM: ");
					quantidadeFilhos = leia.nextInt();
					valorPorFilho = quantidadeFilhos * 50;
					auxilioEmergencialFinal = valorPorFilho + auxilioChefaFmilia;
					System.out.println("VALOR POR FILHOS: " + valorPorFilho);
					System.out.println("VALOR POR CHEFA DE FAM�LIA: " +auxilioChefaFmilia );
					System.out.println("VALOR TOTAL: " +auxilioEmergencialFinal );
					
				}
				else if(respostaChefeFamilia == 'N') {
					System.out.print("Seu Aux�lio emergencial � de R$" + auxilioEmergencial +" reais");
				}
				else {
					System.out.print("Desculpe! op��o inv�lida!");
				}
				
			}
			else if(pronome == 'O') {
				System.out.print("INFORME QUANTOS FILHOS VOC� TEM: ");
				
				System.out.print("Seu Aux�lio emergencial � de R$" + auxilioEmergencial +" reais");
			}
			else {
				System.out.print("Desculpe! op��o inv�lida!");
			}
		
		}else {
			
			System.out.print("Desculpe! op��o inv�lida!");
		}
		
	}

}
