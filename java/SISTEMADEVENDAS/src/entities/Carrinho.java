package entities;

public class Carrinho extends Produto {

	private int estoqueCarrinho;
	private double valorCarrinho;

	public Carrinho(String produto, String codigo, double valor, int estoque, int estoqueCarrinho,
			double valorCarrinho) {
		super(produto, codigo, valor, estoque);
		this.estoqueCarrinho = estoqueCarrinho;
		this.valorCarrinho = valorCarrinho;
	}

	public int getEstoqueCarrinho() {
		return estoqueCarrinho;
	}

	public void setEstoqueCarrinho(int estoqueCarrinho) {
		this.estoqueCarrinho = estoqueCarrinho;
	}

	public double getValorCarrinho() {
		return valorCarrinho;
	}

	public void setValorCarrinho(double valorCarrinho) {
		this.valorCarrinho = valorCarrinho;
	}

	public void compra(int quantidade, double valor, int estoque) {

		System.out.println(" >> ITEM ADCIONADO AO CARRINHO! <<");			 	
		estoqueCarrinho = estoqueCarrinho + quantidade;
		valorCarrinho = valorCarrinho + (quantidade * valor);

		//System.out.println(" Carrinho: " + estoqueCarrinho + " " + " " + valorCarrinho);
		
	}

}