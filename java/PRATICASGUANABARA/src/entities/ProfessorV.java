package entities;

public class ProfessorV extends PessoaV{
	private String especialidade;
	private double salario;
	
	public void receberSalario() {
		this.setSalario(this.getSalario() + this.getSalario());
		System.out.println("Salário na conta!");
	}
	
	
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
	
	

}
