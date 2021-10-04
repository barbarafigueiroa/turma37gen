package condicional;

import java.util.Scanner;
public class lacosDeRepeticao {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
		 final int ANO_ATUAL = 2021;
		 String nome;
		 int anoNascimento;
		 int idade;
		 char pronome;
		 
		 System.out.print("Digite o nome: ");
		 nome = leia.next();
		 System.out.print("Digite o ano de nascimento: ");
		 anoNascimento = leia.nextInt();
		 System.out.print("Digite o pronome A/O/E: ");
		 pronome = leia.next().charAt(0);
		 idade = ANO_ATUAL - anoNascimento;
		 
		 if(idade >= 40) {
			 System.out.println("você é cring!");
			 
		 }else if(idade >= 18 && pronome == 'O') {
			 System.out.println("você é adulto!!");
			 
		 }else if(idade >= 18 && pronome == 'A') {
			 System.out.println("você é adulta!!");
			 
		 }else if(idade >= 18 && pronome == 'E') {
			 System.out.println("você é adulte!!");
			 
		 }else {
			 System.out.println("Você é jovem!!!");
			 
		 }
		 
		 switch (pronome) {
		 
		 	case 'A':{
		 		System.out.println("Pronome Feminino");
		 	}
		 	break;
		 	case 'O': {
		 		System.out.println("Pronome Masculino");
		 		
		 	}
		 	break;
		 	case 'E':{
		 		System.out.println("Pronome Neutro");
		 		
		 	}break;
		 
		 }
	}

}
