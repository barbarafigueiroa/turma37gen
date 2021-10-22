package aplicacoes;

import entities.ControleRemoto;

public class AplicacaoControle {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.ligarMudo();
		c.menosVolume();
		c.abrirMenu();
		c.fecharMenu();
		

	}

}
