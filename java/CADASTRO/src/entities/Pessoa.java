package entities;

public class Pessoa {
	
	private String nome;
	private int anoNascimento;
	private boolean viva;
	private String email;
	private char pronome;
	
	
	//construtor
	public Pessoa(String nome, int anoNascimento, boolean viva, String email, char pronome) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.viva = viva;
		this.email = email;
		this.pronome = pronome;
	}

	
	//encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean isViva() {
		return viva;
	}

	public void setViva(boolean viva) {
		this.viva = viva;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getPronome() {
		return pronome;
	}

	public void setPronome(char pronome) {
		this.pronome = pronome;
	} 
	
	//metodos
	
	
	
    
	
}
