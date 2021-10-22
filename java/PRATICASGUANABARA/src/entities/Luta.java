package entities;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;

		}

	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("#### DESAFIADO ####");
			this.desafiado.apresentar();
			System.out.println("#### DESAFIANTE ####");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			switch (vencedor) {
			case 0: // empate
				System.out.println("EMPATOU!!!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // desafiado Vence
				System.out.println("Vit�ria do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // desafiante vence
				System.out.println("Vit�ria do " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;

			}
			
		} else {
			System.out.println("A luta n�o pode acontecer por motivos de incompatibilidade categ�rica");

		}

	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
