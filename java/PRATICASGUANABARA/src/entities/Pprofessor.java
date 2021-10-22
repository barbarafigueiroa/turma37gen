package entities;

public class Pprofessor extends Ppessoa{
	private String especialidade;
	private double salario;
	
	
	/*public Pprofessor(String nome, int idade, String sexo, String especialidade, double salario) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}*/


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void receberAumento(double valor) {
		this.setSalario(this.salario + valor);
	}

}
