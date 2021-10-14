package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionario;
import entities.Terceiro;


public class Programa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		int numeroFuncionarios;
		
		System.out.println("Quantos Funcion�rios gostaria de calcular?");
		numeroFuncionarios = leia.nextInt();
		
		for(int i = 1; i<= numeroFuncionarios; i++);
		System.out.println(numeroFuncionarios + ". DADOS DO FUNCION�RIO");
		System.out.println("NOME");
		String nome = leia.next();
		System.out.println("MATR�CULA: ");
		String matricula = leia.next();
		System.out.println("HORAS TRABALHADAS: ");
		double horasTrabalhadas = leia.nextDouble();
		System.out.println("VALOR DAS HORAS TRABALHADAS: ");
		double valorHoras = leia.nextDouble();
		System.out.println("FUNCION�RIO EFETIVO-1/ TERCEIRIZADO-2: ");
		int respostaTipoFuncionario = leia.nextInt();
		
		if(respostaTipoFuncionario == 1) {
			Funcionario funcionario1 = new Funcionario(matricula, nome);
			list.add(funcionario1);
			
			
		}else {
			System.out.println("INFORME O VALOR ADICIONAL DO TERCEIRIZADO: ");
			double adicional = leia.nextDouble();
			Funcionario terceirizado1 = new Terceiro(matricula, nome, adicional);
			
			
		}
		
		for(Funcionario func1 : list) {
			System.out.println(" nome do funcion�rio: "
								+ func1.getNome () + " matr�cula: "
								+ func1.getMatricula ()
								+ " valor a receber: "
								+ func1.calculoSalario());
		}
		
		
		

	}

}
