package lista1;

import java.util.Scanner;
import java.lang.Math;

public class ex04 {

	public static void main(String[] args) {
		int numeroA = 0;
		int numeroB = 0;
		int numeroC = 0;
		double numeroR = 0;
		double numeroS = 0;
		double numeroD = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("DIGITE O PRIMEIRO N�MERO A: ");
		numeroA = leia.nextInt();
		System.out.println("DIGITE O PRIMEIRO N�MERO B: ");
		numeroB = leia.nextInt();
		System.out.println("DIGITE O PRIMEIRO N�MERO C: ");
		numeroC = leia.nextInt();

		numeroR = Math.pow((numeroA + numeroB), 2);
		numeroS = Math.pow((numeroA + numeroB), 2);

		numeroD = (numeroR + numeroS) / 2;

		System.out.println("O RESULTADO DA OPERA��O �: " + numeroD);

	}

}
