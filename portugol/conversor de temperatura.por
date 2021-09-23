programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		cadeia nomeTurista = "alguém"
		real temperaturaFahrenheit = 0.0
		real temperaturaCelsius = 0.0
		escreva("  __________________________________________________\n")
		escreva(" |                                                  |\n")
		escreva(" |       >>>> QUAL É A SUA TEMPERATURA <<<<<        |\n")
		escreva(" |__________________________________________________|\n")
		escreva(" INFORME SEU NOME:")
		leia(nomeTurista)
		escreva(" INFORME A TEMPERATURA EM CELSIUS: ")
		leia(temperaturaCelsius)
		temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32
		escreva(" TEMPERATURA EM FAHRENHEIT: ", (m.arredondar(temperaturaFahrenheit,2)), " F\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 726; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */