programa
{
	
	funcao inicio()
	{
		inteiro horasTrabalhadas = 0.0
		real salario = 0.0
		inteiro horaExcedente = 0
		real remuneracaoHoraExtra = 0.0

		
		escreva("INFORME A QUANTIDADE DE HORAS TRABALHADAS: ")
		leia(horasTrabalhadas)
		
		salario = horasTrabalhadas * 10
		horaExcedente = horasTrabalhadas - 50 
		remuneracaoHoraExtra = horasTrabalhadas * 20

		se (horasTrabalhadas > 50 ){
			salario = salario + remuneracaoHoraExtra
			escreva("\n-------------------------------------------------------------------------------------------------------------------------------")
			escreva("\nO seu salário é R$ ",salario, " mas você trabalhou, ", horaExcedente, " horas a mais, então o seu pagamento total será R$ ", salario + remuneracaoHoraExtra, " reais")
		}

		senao se (horasTrabalhadas <= 50 ){
			escreva("------------------------------------------------------------------")
			escreva( "\n Você não fez horas- extras, seu pagamento será de R$ ", salario)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 42; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */