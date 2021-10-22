package entities;

public abstract class Conta {
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	// private int diaAtual;

	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		// this.diaAtual = diaAtual;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	/*
	 * public void setSaldo(double saldo) { this.saldo = saldo; }
	 */

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void ativarConta() {
		this.ativo = true;
		System.out.println("Conta ativa!");

	}

	public void debitoEmConta(int valor) {
		if (valor <= 0) {
			System.out.println("Impossível realizar");

		} else if (valor > saldo) {
			System.out.println("Saldo indisponível");
		} else if (saldo >= valor) {
			this.saldo = valor - this.saldo;
			System.out.println("Operação de débito realizada com sucesso");
		}

	}

	public void creditoEmConta(double valor) {
		if (valor <= 0) {
			System.out.println("Impossível realizar");

		} else {
			this.saldo = this.saldo + valor;
			System.out.println("Operação de crédito realizada com sucesso");
		}

	}

}