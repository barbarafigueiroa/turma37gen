package lista3;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int i = 0;
		int idade = 0;
		char identidadeGenero ;
		int estadoPsicologico = 0;
		int numeroPessoasCalmas = 0;
		int numeroMulheresNervosas = 0;
		int numeroHomensAgressivos = 0;
		int numeroOutrosCalmos = 0;
		int pessoasNervosasAcima40 = 0;
		int pessoasCalmasAbaixo18 = 0;
		
		while(i < 150) {
			System.out.print("informe sua idade: ");
			idade = leia.nextInt();
			
			System.out.print("informe sua identidade de gênero F/M/O: ");
			identidadeGenero = leia.next().toUpperCase().charAt(0);
			
			System.out.print("Digite 1 para estado emocional 1- calma/ 2- nervosa/ 3- agressiva: ");
			estadoPsicologico = leia.nextInt();
			
			
			if(estadoPsicologico == 1) {
				numeroPessoasCalmas = numeroPessoasCalmas +1;
				
			}
			if(identidadeGenero == 'F' && estadoPsicologico == 2) {
				numeroMulheresNervosas = numeroMulheresNervosas +1;
				
			}
			if(identidadeGenero == 'M' && estadoPsicologico == 3){
				numeroHomensAgressivos = numeroHomensAgressivos +1;
				
			}
			if(identidadeGenero == 'O' && estadoPsicologico == 1) {
				numeroOutrosCalmos = numeroOutrosCalmos +1;
			}
			if(idade > 40 && estadoPsicologico == 2) {
				pessoasNervosasAcima40 = pessoasNervosasAcima40 + 1;
				
			}
			if(idade < 18 && estadoPsicologico == 1) {
				pessoasCalmasAbaixo18 = pessoasCalmasAbaixo18 + 1;
				
			}
			i++;
		}
		
		System.out.println("\nNÚMERO DE PESSOAS CALMAS: " + numeroPessoasCalmas);
		System.out.println("NÚMERO DE MULHERES NERVOSAS: " + numeroMulheresNervosas);
		System.out.println("NÚMERO DE HOMENS AGRESSIVOS: " + numeroHomensAgressivos);
		System.out.println("NÚMERO DE OUTROS CALMOS: " + numeroOutrosCalmos);
		System.out.println("NÚMERO DE PESSOAS NERVOSAS ACIMA DE 40 ANOS: " + pessoasNervosasAcima40);
		System.out.println("NÚMERO DE PESSOAS CALMAS ABAIXO DE 18 ANOS: " + pessoasCalmasAbaixo18);
		
		

	}

}
