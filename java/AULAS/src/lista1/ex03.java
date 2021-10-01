package lista1;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempoDuracaoSegundos = 0;
		int tempoDuracaoMinutos = 0;
		int tempoDuracaoHoras = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("QUAL A DURAÇÃO DO SEU EVENTO: ");
		tempoDuracaoHoras = leia.nextInt();

		tempoDuracaoMinutos = tempoDuracaoHoras * 60;
		tempoDuracaoSegundos = 60 * tempoDuracaoMinutos;

		System.out.println("TEMPO EM SEGUNDOS: " + tempoDuracaoSegundos + "s");
		System.out.println("TEMPO EM MINUTOS: " + tempoDuracaoMinutos + "min");
		System.out.println("TEMPO EM HORAS: " + tempoDuracaoHoras + "h");

	}

}
