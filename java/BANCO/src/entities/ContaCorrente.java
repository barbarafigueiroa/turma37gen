package entities;

public class ContaCorrente extends Conta {
	protected double saldoCorrigido;

	public ContaCorrente(int numero, String cpf, double saldoCorrigido) {
		super(numero, cpf);
		this.saldoCorrigido = saldoCorrigido;
	}

	public double getSaldoCorrigido() {
		return saldoCorrigido;
	}

	public void setSaldoCorrigido(double saldoCorrigido) {
		this.saldoCorrigido = saldoCorrigido;
	}
	
	public void talao(int contadorTalao) {
		if (contadorTalao >= 1 && contadorTalao <= 3) {
			double saldoCorrigido = super.getSaldo() + (contadorTalao * 30);
			System.out.println(saldoCorrigido);

		}

		else {
			System.out.println("Valor incorreto!");

		}
	}

}