package app;

import entities.Leitor;
import entities.ParticipanteForum;
import entities.Programador;

public class TesteInterface {

	public static void main(String[] args) {
		
		ParticipanteForum participante1 = new ParticipanteForum();
		Leitor leitor1 = participante1;
		System.out.println("O participante está lendo: " + leitor1.lendo());
		Programador programador1 = participante1;
		String java = "JAVA";
		programador1.pensando(java.toCharArray());
		System.out.println("E programando: " + programador1.digitando());
		
		
		

	}

}
