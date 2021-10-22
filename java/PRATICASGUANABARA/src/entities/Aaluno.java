package entities;

public class Aaluno extends Ppessoa {
	private int matricula;
	private boolean curso;

	/*public Aaluno(String nome, int idade, String sexo, int matricula, boolean curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;

	}*/

	
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public boolean getCurso() {
		return curso;
	}

	public void setCurso(boolean curso) {
		this.curso = curso;
	}

	public void cancelarMatricula() {
		if (this.curso == true) {
			System.out.println("Matrícula cancelada!");

		} else {
			System.out.println("Este curso não está ativo. Impossível cancelar matrícula!");
		}

	}

}
