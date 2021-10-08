package app;

import java.util.Scanner;
import entities.Pessoa;

public class CadAmigo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
       
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Bárbara";
		p1.email = "bfamorim@outlook.com";
		p1.pronome = 'a';
		p1.anoNascimento = 1993;
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Maria";
		p2.email = "mariaMoura@outlook.com";
		p2.pronome = 'e';
		p2.anoNascimento = 1962;
		
		Pessoa p3 = new Pessoa();
		
		p3.nome = "Marcelo";
		p3.email = "marcelo-famorim@outlook.com";
		p3.pronome = 'o';
		p3.anoNascimento = 1993;
		
		System.out.println(p1.nome);
		System.out.println(p1.nome + " sua idade é " + (2021 - p1.anoNascimento));
		System.out.println(p2.nome + " sua idade é " + (2021 - p2.anoNascimento));
		
		//COM O USUÁRIO DIGITANDO OS VALORES
		
		Pessoa cad1 = new Pessoa();
		
		System.out.println("CADASTRO DE AMIGOS");

        System.out.print("Digite o nome do amigo : ");
        cad1.nome = leia.next();
        
        System.out.print("Digite o ano de nascimento : ");
        cad1.anoNascimento = leia.nextInt();
        
        System.out.print("Digite 1-masculino, 2-feminina, 3-neutre :");
        char op = leia.next().charAt(0);
        
        if (op=='1') {
            cad1.pronome = 'o';
        } else if (op=='2') {
            cad1.pronome = 'a';
        } else {
            cad1.pronome = 'e';
        }
        
        System.out.printf("Bom dia Sr%c. %s, sua idade aproxima é %d anos.\n",cad1.pronome,cad1.nome.toUpperCase(),cad1.calcularIdade(2021));
        System.out.println(cad1.toString());

	}

}
