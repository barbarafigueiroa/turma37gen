package entities;

public class Caneta {
	private String modelo;
	private double ponta;
	private String cor;
	private boolean tampada;
	
	

	public Caneta(String modelo, double ponta, String cor, boolean tampada) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampada = tampada;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public double getPonta() {
		return ponta;
	}



	public void setPonta(double ponta) {
		this.ponta = ponta;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public boolean isTampada() {
		return tampada;
	}



	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}



	public void status() {
		System.out.println("SOBRE A CANETA");
		System.out.println("MODELO: " + this.getModelo());
		System.out.println("PONTA: " + this.getPonta());
		System.out.println("COR: " + this.getCor());
		System.out.println("TAMPADA?  " + this.tampada);
		
	}
	
	public void tampar() {
		this.tampada = true;
		
	}
	
	public void destampar() {
		this.tampada = false;
		
	}

}
