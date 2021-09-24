programa
{
	
	funcao inicio()
	{

		inteiro tempoDuracaoSegundo = 0
		inteiro tempoDuracaoMinutos = 0
		inteiro tempoDuracaoHoras = 0

		
		escreva("  __________________________________________________\n")
		escreva(" |                                                  |\n")
		escreva(" |  CALCULANDO O TEMPO DA SUA FESTA EM HR/MIN/SEG   |\n")
		escreva(" |__________________________________________________|\n")
		escreva(" |__INFORME O TEMPO DE DURAÇÃO DO SEU EVENTO ABAIXO_|\n")
		escreva("  \n")
		escreva(" |TEMPO EM HORAS: ")
		leia(tempoDuracaoHoras)
		tempoDuracaoMinutos = tempoDuracaoHoras * 60
		tempoDuracaoSegundo = 60 * tempoDuracaoMinutos
		escreva(" |TEMPO EM MINUTOS: ", tempoDuracaoMinutos, " minutos\n")
		escreva(" |TEMPO EM SEGUNDOS: ", tempoDuracaoSegundo, " segundos\n")
		escreva("\n")
		escreva(" >>>> V O L T E  S E M P R E <<<<")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 859; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */