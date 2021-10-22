package entities;

public class Cachorro extends Mamifero {
	
	public void enterrarOsso() {
		System.out.println("Enterrando o osso....");
		
	}
	
	public void abanarRabo() {
		System.out.println("abanando o rabo....");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("au au au au....");

	}

}
