package lista1;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		double valorX1 = 0.0;
		double valorX2 = 0.0;
		double valorY1 = 0.0;
		double valorY2 = 0.0;
		double valorD = 0.0;
		Scanner leia = new Scanner(System.in);

		System.out.println("DIGITE O VALOR DE X1: ");
		valorX1 = leia.nextDouble();
		System.out.println("DIGITE O VALOR DE X2: ");
		valorX2 = leia.nextDouble();
		System.out.println("DIGITE O VALOR DE Y1: ");
		valorY1 = leia.nextDouble();
		System.out.println("DIGITE O VALOR DE Y2: ");
		valorY2 = leia.nextDouble();
		valorD = Math.sqrt(Math.pow((valorX1 - valorX2), 2) + Math.pow((valorY1 - valorY2), 2));

		System.out.printf("O VALOR DE D É %.2f ", valorD);

	}

}
