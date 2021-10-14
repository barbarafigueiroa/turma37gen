package app;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFunc {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("001","Barbara");
		Terceiro terc1 = new Terceiro("002","Junior",12.00);
		
		func1.setHorasTrabalhadas(40);
		func1.setValorHoras(10.00);
		
		terc1.setHorasTrabalhadas(40);
		terc1.setValorHoras(20);
		
		System.out.println("Funcionárix " + func1.getNome() + " de matrícula " + func1.getMatricula() + " vai receber um salário de R$ " + func1.calculoSalario()+ " reais.");
		System.out.println("Funcionárix " + terc1.getNome() + " de matrícula " + terc1.getMatricula() + " vai receber um salário de R$ " + terc1.calculoSalario()+ " reais.");

	}

}
