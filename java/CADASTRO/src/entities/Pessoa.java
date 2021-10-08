package entities;

public class Pessoa {
	
	public String nome;
	public int anoNascimento;
	public boolean viva;
	public String email;
	public char pronome; 
	
	
    public int calcularIdade() {
        return 2021 - anoNascimento;
    }

    public int calcularIdade(int ano) {
        return ano - anoNascimento;
    }

    //@Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", anoNascimento=" + anoNascimento + "]";
    }
	
}
