package entities;

public class Funcionario1exemplo extends Pessoa1exemplo {
	private String departamento;
	
	
	public Funcionario1exemplo(String nome, int matricula, String departamento) {
		super(nome, matricula);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	

}
