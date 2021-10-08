package app;

import java.util.Scanner;

import entities.Celular;

public class Exercicio02app { 

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Celular celular1 = new Celular("37GENPOWER", 1002182, true, 94204488);
		//String celularAux; 
		
		celular1.ligar();
		//System.out.println("Informe o modelo do seu aparelho: ");
		//celularAux = leia.next();
		//celular1.setModelo(celularAux);
		celular1.configuracoesIniciais();
		celular1.desligar();

	}

}
