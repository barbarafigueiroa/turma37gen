import java.util.Scanner;

public class Oimundo {
	
	public static void main(String [] args) {
		
		System.out.println("oi mundo");
		
			Scanner leia = new Scanner(System.in);
			String nome;
			int anoNascimento;
			double salario;
		
			nome ="b�rbara";
			anoNascimento = 1993;
			salario = 12.000;
		
			System.out.println("escreva o nome: ");
			nome = leia.next();
			
			System.out.println("digite o ano de nascimento: ");
			anoNascimento = leia.nextInt();
			
			System.out.println("digite seu sal�rio: ");
			salario = leia.nextDouble();
			
			System.out.println(nome + " sua idade � " + (2021 - anoNascimento));
	}
}
