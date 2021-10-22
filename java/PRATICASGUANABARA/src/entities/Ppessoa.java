package entities;

public class Ppessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	/*public Ppessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}*/
	
	
	public Ppessoa() {
		super();
	}


	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void fazerAniver() {
		this.idade = this.idade + 1;
		
	}



	@Override
	public String toString() {
		return "Ppessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	

}
