package entities;

public class Produto {

	private String produto;
	private String codigo;
	private double valor;
	private int estoque;

	// Construtor

	public Produto(String produto, String codigo, double valor, int estoque) {
		super();
		this.produto = produto;
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
	}

	// Encapsulamento
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void comprar(int quantidade) {
		if (quantidade <= estoque && quantidade > 0 && estoque >= 0) {
			estoque = estoque - quantidade;
			

		} else if (quantidade > estoque || quantidade < 0) {
			System.out.println("Desculpe, impossível realizar a operação");
		}

	}

	@Override
	public String toString() {
		
		return "\n"+produto+"\t"+codigo+"\t"+valor+"\t\t"+estoque;
	}

	public Integer getKey() {
		// TODO Auto-generated method stub
		return null;
	}

}