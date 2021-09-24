programa
{
	
	funcao inicio()
	{
		inteiro horasTrabalhadas = 0
		real salario = 0.0
		inteiro horaExcedente = 0
		real remuneracaoHoraExtra = 0.0

		
		escreva("INFORME A QUANTIDADE DE HORAS TRABALHADAS: ")
		leia(horasTrabalhadas)
		
		se (horasTrabalhadas > 50 ){
			salario = 50 * 10
			horaExcedente = horasTrabalhadas - 50 
			remuneracaoHoraExtra = horaExcedente * 20
			
			escreva("\n----------------------------------------------------------------------------------------------------------------")
			escreva("\nO seu salário é R$ ",salario, " mas você trabalhou ", horaExcedente, " horas a mais, então o seu pagamento total será R$ ", salario + remuneracaoHoraExtra, " reais")
			escreva("\n----------------------------------------------------------------------------------------------------------------")
		}

		senao se (horasTrabalhadas < 50 ){
			salario = horasTrabalhadas * 10
			escreva("------------------------------------------------------------------")
			escreva( "\nVocê não fez horas - extras, seu pagamento será de R$ ", salario)
			escreva("\n------------------------------------------------------------------")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */