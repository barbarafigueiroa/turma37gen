package entities;

public class Ave extends Animal {
	private String corPena;

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public void fazerNinho() {
		System.out.println("construindo ninho....");
	}

	@Override
	public void locomover() {
		System.out.println("voando...");

	}

	@Override
	public void alimentar() {
		System.out.println("se alimentando de minhocas...");

	}

	@Override
	public void emitirSom() {
		System.out.println("ppipipipipi pipipipi pipipi...");

	}

}
