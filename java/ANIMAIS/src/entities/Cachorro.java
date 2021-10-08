package entities;

public class Cachorro extends Animal {
	private boolean abanaRabo;

	public Cachorro(String nome, int idade, boolean emiteSom, boolean abanaRabo) {
		super(nome, idade, emiteSom);
		this.abanaRabo = abanaRabo;
	}

	public boolean isAbanaRabo() {
		return abanaRabo;
	}

	public void setAbanaRabo(boolean abanaRabo) {
		this.abanaRabo = abanaRabo;
	}

	

	
}
