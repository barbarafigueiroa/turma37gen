package entities;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	
	
	

}
