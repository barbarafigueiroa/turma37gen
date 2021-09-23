programa
{
	
	funcao inicio()
	{
		inteiro numeroA = 0
		inteiro numeroB = 0
		inteiro numeroC = 0
		inteiro numeroR = 0
		inteiro numeroS = 0
		inteiro numeroD = 0

		escreva("DIGITE O PRIMEIRO NÚMERO A: ")
		leia(numeroA)
		escreva("DIGITE O SEGUNDO NÚMERO B: ")
		leia(numeroB)
		escreva("DIGITE O TERCEIRO NÚMERO C: ")
		leia(numeroC)
		numeroR = numeroA * numeroA + 2 * numeroA * numeroB + numeroB * numeroB
		numeroS = numeroB * numeroB + 2 * numeroB * numeroC + numeroC * numeroC
		numeroD = numeroR + numeroS / 2
		escreva("\n1O resultado da operação D = R + S / 2 É IGUAL: ", numeroD)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */