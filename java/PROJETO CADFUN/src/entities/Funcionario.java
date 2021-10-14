package entities;

public class Funcionario {

	private String matricula;
	private String nome;
	protected double horasTrabalhadas;
	protected double valorHoras;

	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}

	
	public double calculoSalario() {

		return (this.horasTrabalhadas * this.valorHoras);
	}

	public double calcularSalarioFerias() {
		return (calculoSalario() * 1.3);
	}

}
