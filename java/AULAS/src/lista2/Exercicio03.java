package lista2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0;
		
		System.out.print("INFORME SUA IDADE: ");
		idade = leia.nextInt();
		
		if(idade >=10 && idade <= 14) {
			System.out.print("CATEGORIA INFANTIL");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.print("CATEGORIA JUVENIL");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.print("CATEGORIA ADULTO");
		}
		else if(idade <10){
			System.out.print("Idade abaixo das categorias permitidas");
		}
		else if(idade > 25) {
			System.out.print("Idade acima da categorias permitidas");
		}
		else {
			System.out.print("Desculpe, opção inválida!!!");
		}
	}

}
