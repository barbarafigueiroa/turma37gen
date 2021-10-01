package lista1;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadeAno = 0;
		int idadeMes = 0;
		int idadeDia = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("DIGITE SUA IDADE EM DIAS: ");
		idadeDia = leia.nextInt();

		idadeAno = idadeDia / 365;
		idadeMes = 12 * idadeAno;

		System.out.println("SUA IDADE EM DIAS: " + idadeDia);
		System.out.println("SUA IDADE EM MESES: " + idadeMes);
		System.out.println("SUA IDADE EM ANOS: " + idadeAno);

	}

}
