package aplicacoes;

import entities.Luta;
import entities.Lutador;

public class AplicacaoCombat {

	public static void main(String[] args) {
		/*
		 * criando um objeto normal
		 * Lutador l = new Lutador("Pretty Boy", "Fran�a",31,1.75, 68.9, 11, 2, 1);
		 * l.status();
		 */

		//criando um array de objetos
		Lutador l[] = new Lutador[6];

		l[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75, 68.9, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		l[3] = new Lutador("barbara", "Grecia", 28, 1.93, 81.6, 13, 0, 2);
		l[4] = new Lutador("josy", "janga", 59, 1.70, 119.3, 5, 4, 3);
		l[5] = new Lutador("domdom", "peixinhos", 30, 1.78, 105.7, 12, 2, 4);

		//l[5].status();
		Luta UEC01 = new Luta();
		
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		//l[0].status();
		//l[1].status();

	}

}
