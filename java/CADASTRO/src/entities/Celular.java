package entities;

public class Celular {

	//atributos
	private String modelo;
	private int pin;
	private boolean ativo;
	private int numero;
	
	//construtor
	public Celular(String modelo, int pin, boolean ativo, int numero) {
		super();
		this.modelo = modelo;
		this.pin = pin;
		this.ativo = ativo;
		this.numero = numero;
	}
	
	//encapsulamentos

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//metodos
	
	public void ligar() {
		this.ativo = true;
		System.out.println("Turn ONNNN <<");
		System.out.println("Seja bem vinde ao sistema operacional da Barbara37GEN! <<");
	}
	
	public void desligar() {
		this.ativo = false;
		System.out.println("Nos despedimos por aqui, até logo! te espero mais tarde!");
		System.out.println("Turn OFFFFF <<");
		
	}
	
	public void configuracoesIniciais() {
		if(this.modelo == "37GENPOWER") {
			System.out.println("SORTUDO! você acaba de entrar em contato com A MELHOR EXPERIÊNCIA DA SUA VIDA!");
			System.out.println("Bem vindo ao mundo dev da generation Brasil!!!");
			
		}
		
	}
	
	
}
