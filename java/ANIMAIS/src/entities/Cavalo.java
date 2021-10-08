package entities;

public class Cavalo extends Animal {
	private boolean capacidadeCoice;

	public Cavalo(String nome, int idade, boolean emiteSom, boolean capacidadeCoice) {
		super(nome, idade, emiteSom);
		this.capacidadeCoice = capacidadeCoice;
	}

	public boolean isCapacidadeCoice() {
		return capacidadeCoice;
	}

	public void setCapacidadeCoice(boolean capacidadeCoice) {
		this.capacidadeCoice = capacidadeCoice;
	}

	

	

}
