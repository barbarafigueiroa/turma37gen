package entities;

public class ContaBanco {
	public int numeroConta;
	protected String tipoConta;
	private String nomeTitular;
	private double saldo;
	private boolean status;

	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("CONTA: " + this.getNumeroConta());
		System.out.println("TITULAR: " + this.getNomeTitular());
		System.out.println("TIPO DA CONTA: " + this.getTipoConta());
		System.out.println("SALDO: " + this.getSaldo());
		System.out.println("STATUS DA CONTA: " + this.isStatus());
	}

	public ContaBanco() {

		saldo = 0;
		status = false;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String tipoConta) {

		this.setTipoConta(tipoConta);
		this.setStatus(true);
		if (tipoConta == "cc") {
			this.setSaldo(50);
			System.out.println("Parabéns Conta Corrente aberta com sucesso!");

		} else if (tipoConta == "cp") {
			this.setSaldo(150);
			System.out.println("Parabéns Conta Poupança aberta com sucesso!");

		}

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro. Realize a retirada de todo seu saldo!");

		} else if (this.getSaldo() < 0) {
			System.out.println("Conta com saldo negativo");

		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}

	}

	public void depositar(double valor) {
		if (this.isStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito realizado com sucesso!");
		} else {
			System.out.println("Impossível depositar. Conta fechada.");

		}

	}

	public void sacar(double valor) {
		if (this.isStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getNomeTitular());
			} else {
				System.out.println("Saldo Insuficiente para saque");

			}
		} else {

			System.out.println("Impossível sacar de Conta fechada.");
		}

	}

	public void pagarMensal() {
		double valorMensalidade = 0;

		if (this.getTipoConta() == "cc") {
			valorMensalidade = 12;

		} else if (this.getTipoConta() == "cp") {
			valorMensalidade = 20;
		}

		if (this.isStatus()) {
			if (this.getSaldo() > valorMensalidade) {
				setSaldo(getSaldo() - valorMensalidade);
				System.out.println("Mensalidade paga com sucesso!");
			} else {
				System.out.println("Saldo Insuficiente para pagamento de mensalidade");
			}

		} else {
			System.out.println("Impossível pagar uma conta fechada");
		}

	}

}
