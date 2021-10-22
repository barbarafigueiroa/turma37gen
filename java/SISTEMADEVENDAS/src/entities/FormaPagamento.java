package entities;

public class FormaPagamento {

	public double imposto(double valor) {
		
		return valor * 0.09;
	}

	public double pagamentoAvista(double valor) {
		
		return valor * 0.90;
	}

	public double pagamentoCartao(double valor) {
	
		return valor * 1.10;
	}

	public double pagamentoCartaoParcelado(double valor) {
	
		return (valor * 1.15) / 2;
	}

}