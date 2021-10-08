package entities;

public class Cliente {
	
	//atributos
	private String nome;
	private String endereco;
	private String cpf;
	private int anoNascimento;
	
	
	
	//construtor
	public Cliente(String nome, String endereco, String cpf, int anoNascimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
	}


	
	//encapsulamento
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public int getAnoNascimento() {
		return anoNascimento;
	}



	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}



	//metodos
	public void seApresentar(int idade) {
		idade = 2021 - anoNascimento;
		System.out.println("Olá! Eu me chamo " + this.nome + ". Eu tenho" + idade + " anos.");
		
	}
	
	public void seDespedir() {
		System.out.println("Até logo!");
	}
	

	
	

	
}


