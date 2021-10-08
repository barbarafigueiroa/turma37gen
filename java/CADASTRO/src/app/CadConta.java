package app;

import java.util.Scanner;

import entities.ContaBancaria;

public class CadConta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.print("Digite o numero da conta: " );
		int auxConta = leia.nextInt();
		
		System.out.print("Digite o cpf da conta: " );
		String auxCpf = leia.next();
		
		ContaBancaria cc2 =  new ContaBancaria(auxConta, auxCpf);
		
		
		
		System.out.print("Cliente " + cc2.getCpf() + " numero da sua conta: " + cc2.getNumero());
		System.out.print("Ativa a conta sim ou não S / N? " );
		char op = leia.next().toUpperCase().charAt(0);
		if(op == 'S' ) {
			cc2.ativarConta();
		} 
		
		System.out.print(" Saldo atual R$ " + cc2.getSaldo());
		System.out.print(" " );
		
		for(int x = 1 ; x <= 5 ; x ++ ) {
			
			System.out.print("Lançamento " + x);
			System.out.print("Digite o valor R $ " );
			double auxValor = leia.nextDouble ();
			System.out.print("D-debito ou C-credito: " );
			op = leia.next().toUpperCase().charAt(0);
			
			if(op == 'C' && cc2.isAtiva ()){
				cc2.credito(auxValor);
			} else if(op == 'D' && cc2.isAtiva()) {
				cc2.debito(auxValor);
			}
		}
		System.out.print("Saldo Atual R $ " + cc2.getSaldo());
		
		

	}

}
