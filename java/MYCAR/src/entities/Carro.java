package entities;

public class Carro {

	//atributos - podem ser adcionados ou removidos
	
	private String placa;
	private String modelo;
	private boolean ligado;
	private int anoFabricacao;
	private String fabricante;
	private int marcha;
	private double velocidade;
	
	//construtor
	//sobrecarga de construtor é quando eu tenho mais de um construtor com nomes iguais e atributos diferentes
	public Carro(String placa, String modelo, String fabricante) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	public Carro() {
		//construtor sem atributos
	}
	
	//encapsulamento de dados
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//metodos
	 public void ligarCarro() {
		 
		 this.ligado = true;
		 System.out.println("Carro ligado!");
	 }
	 
	 
	 public void desligarCarro() {
		 
		 this.ligado = false;
		 System.out.println("Carro desligado!");
	 }
	 
	 
	 public void subirMarcha() {
		 if(this.ligado && this.marcha <= 5) {
			 this.marcha ++;
			 System.out.println("você passou marcha!");
			 
		 }
	 }
	 
	 
	 public void descerMarcha() {
		 if(this.ligado && this.marcha>0) {
			 this.marcha--;
			 
		 }
	 }
	 
	 
	 public void acelerar() {
		 this.velocidade++;
		 System.out.println("você está aumentando a velocidade...");
		 
	 }
	 
	 
	 public void desacelerar() {
		 this.velocidade--;
		 System.out.println("você está diminuindo a velocidade...");
	 }
	 
	 
	 public void andarCarro() {
		 if(this.ligado && this.velocidade == 0 && this.marcha == 0) {
			 subirMarcha();
			 acelerar();
			 System.out.println("você está em movimento...");
			 
			 
		 }
	 }
	
	 

	 public void freio() {
		 if(this.velocidade > 0) {
			 for(int x = 0; x<= this.velocidade; x++) {
				 this.velocidade--;
				 System.out.println("freiando....");
				 this.velocidade = 0;
			 }
		 }
	 }
	 
	 public void pararCarro() {
		 if(this.ligado && this.velocidade == 0 && this.marcha == 0) {
			 freio();
			 desligarCarro();
			 
		 }
		 System.out.println("você parou o carro!");
	 }
	 
	 public void marchaRe() {
		 if(this.marcha == -1) {
			 this.marcha--;
		 }
	 }

	
	
	
	
}
