package entities;

public class Cachorro extends Animal {
	private boolean capacidadeCorrer;

	public Cachorro(String nome, int idade, boolean emiteSom, boolean capacidadeCorrer) {
		super(nome, idade, emiteSom);
		this.capacidadeCorrer = capacidadeCorrer;
	}

	public boolean isCapacidadeCorrer() {
		return capacidadeCorrer;
	}

	public void setCapacidadeCorrer(boolean capacidadeCorrer) {
		this.capacidadeCorrer = capacidadeCorrer;
	}

	

	@Override
	public void correr() {
		System.out.println("Correndo fofinho...");
	}

	@Override
	public void emitirSom() {
		System.out.println("au au au...");
		
	}
	

	
}
