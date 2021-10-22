package entities;

public class Ffuncionario extends Ppessoa {
	private String setor;
	private boolean trabalhando;
	
	/*public Ffuncionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = trabalhando;
	}*/

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public void mudarTrabalho() {
		if(this.trabalhando == false) {
			System.out.println("Você não pode mudar de emprego se não está trabalhando ?????");
		}
		else if(this.isTrabalhando()) {
			System.out.println("Mudando de trabalho....");
		}
	}
	

}
