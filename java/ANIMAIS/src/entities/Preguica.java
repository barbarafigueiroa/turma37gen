package entities;

public class Preguica extends Animal{
	private boolean CapacidadeEscalar;

	public Preguica(String nome, int idade, boolean emiteSom, boolean capacidadeEscalar) {
		super(nome, idade, emiteSom);
		CapacidadeEscalar = capacidadeEscalar;
	}

	public boolean isCapacidadeEscalar() {
		return CapacidadeEscalar;
	}

	public void setCapacidadeEscalar(boolean capacidadeEscalar) {
		CapacidadeEscalar = capacidadeEscalar;
	}

	
	
	public void somFolhas() {
		System.out.println("barulho de folhas sendo pisadas....");
	}
	
	@Override
	public void correr() {
		System.out.println("Correndo beeeem devagar...");
	}
	

}
