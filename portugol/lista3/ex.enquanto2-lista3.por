programa
{
	
	funcao inicio ()
	{
		inteiro numero
		inteiro novoValor = 0

		escreva ("DIGITE UM NÚMERO QUALQUER:")
		leia (numero)
		limpa()
		escreva("\n-> ",numero)
		
		enquanto (numero < 100) {
			novoValor = numero * 3
			numero = novoValor
			escreva("\n-> ",novoValor, "\n")
				
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */