package entities;

public class ContaPoupanca extends Conta {
	private int diaAniversario;
	protected double saldoCorrigido;

	public ContaPoupanca(int numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
		this.saldoCorrigido = saldoCorrigido;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	public double getSaldoCorrigido() {
		return saldoCorrigido;
	}

	public void setSaldoCorrigido(double saldoCorrigido) {
		this.saldoCorrigido = saldoCorrigido;
	}

	public double correcao(int diaAniversario, int diaAtual, double saldoCorrigido) {

		if (diaAniversario == diaAtual) {
			saldoCorrigido = (super.getSaldo() * 0.05) + super.getSaldo();
			System.out.println("Parabéns, hoje é o seu aniversário! Você ganhou um bônus: " + saldoCorrigido);

			System.out.println(saldo = saldoCorrigido);
			return saldoCorrigido;
		} else {
			System.out.println("Saldo: " + super.getSaldo());
		}
		return saldoCorrigido;

	}

}