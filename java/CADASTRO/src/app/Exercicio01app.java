package app;

import java.util.Scanner;
import entities.Cliente;

public class Exercicio01app {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Cliente cliente1 = new Cliente("Bárbara", "Rua Rui Barbosa", "089.642.504-51", 1993);
		
		cliente1.seApresentar(28);
		cliente1.seDespedir();

	}

}
