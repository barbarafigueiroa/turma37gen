programa
{
	
	funcao inicio()
	{
		real tempoDuracaoSegundo = 0.0
		real tempoDuracaoMinutos = 0.0
		real tempoDuracaoHoras = 0.0 
		
		escreva("  __________________________________________________\n")
		escreva(" |                                                  |\n")
		escreva(" |  CALCULANDO O TEMPO DA SUA FESTA EM HR/MIN/SEG   |\n")
		escreva(" |__________________________________________________|\n")
		escreva(" |__INFORME O TEMPO DE DURAÇÃO DO SEU EVENTO ABAIXO_|\n")
		escreva("  \n")
		escreva(" |TEMPO EM SEGUNDOS: ")
		leia(tempoDuracaoSegundo)
		tempoDuracaoHoras = 3600 * tempoDuracaoSegundo
		tempoDuracaoMinutos = tempoDuracaoHoras * 60
		escreva(" |TEMPO EM HORAS: ", tempoDuracaoHoras, " horas\n")
		escreva(" |TEMPO EM MINUTOS: ", tempoDuracaoMinutos, " minutos\n")
		escreva("\n")
		escreva(" >>>> V O L T E  S E M P R E <<<<")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 39; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */