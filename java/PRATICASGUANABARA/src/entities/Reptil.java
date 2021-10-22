package entities;

public class Reptil extends Animal {
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Se rastejando...");
	}

	@Override
	public void alimentar() {
		System.out.println("utilizando a língua para se alimentar...");

	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som de réptil ???");

	}

}
