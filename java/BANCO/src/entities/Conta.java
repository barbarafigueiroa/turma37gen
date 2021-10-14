package entities;

public abstract class Conta {
	private int numero;
	private String cpf;
	protected double saldo;
	private boolean ativo;
	//private int diaAtual;
	
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		//this.diaAtual = diaAtual;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

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
	
	public double debitoEmConta(int valorDebitado) {
		double novoSaldo = (valorDebitado - this.saldo);
		return novoSaldo;
	}
	
	public double creditoEmConta(int valorCreditado) {
		double novoSaldo = (valorCreditado + this.saldo);
		return novoSaldo;
	}
	
	
	
	
}