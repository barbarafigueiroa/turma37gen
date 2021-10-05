package arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int [] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int [] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};
		
		float [] nota = new float[5];
		
		//tamanho do array
		if(arrayDois.length > 8) {
			System.out.println("Tamanho do arrayDois - Maior que 8!");
		}else {
			System.out.println("Tamanho do arrayDois - Menor que 8!");

		}
		System.out.println("Tamanho do arrayUm: " + arrayUm.length);
		
		//utilização do for-each
		String[] cars = {"volvo", "", "Ford", "Mazda"};
		
		for(String i : cars) {
			System.out.println(i);
			//imprime todas as posições do vetor

		}
		//preenchendo um array
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma nota: ");
			nota[i] = leia.nextFloat();

		}
		
		//imprimindo um array 
		for(int i = 0; i < 5; i++) {
			System.out.println("nota " + i + " = " + nota[i]);
		}


	}

}
