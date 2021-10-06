package lista4;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double [] numero = {0.0,0.0,0.0,0.0,0.0};
		double maiorNumero = 0.0;
		
		for(int i=0;i<5;i++){
			
			System.out.print("DIGITE UM VALOR: ");
			numero[i] = leia.nextFloat();
		    
		     if(maiorNumero <numero[i]){
		        maiorNumero = numero[i];

		     }
		     
		} 
		 for(int i=0; i<5; i++){
			 System.out.print(numero[i] + "\n");
			 
		            
		    }
		 	System.out.print("MAIOR NÚMERO: " + maiorNumero);
	}

}

