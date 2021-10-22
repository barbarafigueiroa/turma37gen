package entities;

public class Peixe extends Animal {
	//private 
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public void soltarBolha() {
		System.out.println("GlUb GlUuUbB....");
	}

	@Override
	public void locomover() {
		System.out.println("nadando...");

	}

	@Override
	public void alimentar() {
		System.out.println("se alimentando de algas marinhas");

	}

	@Override
	public void emitirSom() {
		System.out.println("blug bglub glub glub ....");

	}

}
