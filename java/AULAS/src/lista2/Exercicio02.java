package lista2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int maiorNumero = 0;
		int menorNumero = 0	;
		int numeroMeio = 0;
		
		
				
				
				System.out.print("DIGITE O PRIMEIRO N�MERO: ");
				numero1 = leia.nextInt();
				
				if(numero1 >= maiorNumero) {
				maiorNumero = numero1;
				
				}
				menorNumero = maiorNumero;
				if(numero1 <= menorNumero) {
				menorNumero = numero1;
				}
				
				System.out.print("DIGITE O SEGUNDO N�MERO");
				numero2 = leia.nextInt();
				
				if(numero2 >= maiorNumero) {
				maiorNumero = numero2;
				}
				
				if(numero2 <= menorNumero) {
					menorNumero = numero2;
				}
				
				System.out.print("DIGITE O TERCEIRO N�MERO");
				numero3 = leia.nextInt();
				if (numero3 >= maiorNumero) {
					maiorNumero = numero3;
				}
				if(numero3 <= menorNumero) {
					menorNumero = numero3;
				}
				if(numero1 < maiorNumero && numero1 > menorNumero){
					numeroMeio = numero1;
					
				}
				if(numero2 < maiorNumero && numero2 > menorNumero){
					numeroMeio = numero2;
					
				}
				if(numero3 < maiorNumero && numero3 > menorNumero){
					numeroMeio = numero3;
					
				}
				
					
				System.out.println("MAIOR N�MERO: "+maiorNumero);
				System.out.println("MENOR N�MERO: "+menorNumero);
				System.out.println("N�MERO DO MEIO: "+numeroMeio);
				System.out.println(menorNumero+" "+numeroMeio+" "+maiorNumero);
		}
	
}


