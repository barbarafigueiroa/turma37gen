package entities;

public class Produto {
	
	public String nome;
	public String codigo;
	public int estoque = 0;
	public double valor = 0.00;
	public int quantidade = 0;
	
	
    public int removeEstoque() {
        return estoque - quantidade;
    }

    public int adcionaEstoque() {
        return quantidade + estoque;
    }

}

