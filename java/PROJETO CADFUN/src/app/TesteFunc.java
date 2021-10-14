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
		
		System.out.println("Funcion�rix " + func1.getNome() + " de matr�cula " + func1.getMatricula() + " vai receber um sal�rio de R$ " + func1.calculoSalario()+ " reais.");
		System.out.println("Funcion�rix " + terc1.getNome() + " de matr�cula " + terc1.getMatricula() + " vai receber um sal�rio de R$ " + terc1.calculoSalario()+ " reais.");

	}

}
