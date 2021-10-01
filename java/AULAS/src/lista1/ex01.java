package lista1;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadeAno = 0;
		int idadeMes = 0;
		int idadeDia = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("DIGITE SUA IDADE: ");
		idadeAno = leia.nextInt();

		idadeMes = 12 * idadeAno;
		idadeDia = 365 * idadeAno;

		System.out.println("SUA IDADE EM DIAS: " + idadeDia);
		System.out.println("SUA IDADE EM MESES: " + idadeMes);
		System.out.println("SUA IDADE EM ANOS: " + idadeAno);

	}

}
