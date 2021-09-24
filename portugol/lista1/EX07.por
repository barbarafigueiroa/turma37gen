programa
{
	
	funcao inicio()
	{
		inteiro coeficienteA = 0
		inteiro coeficienteB = 0
		inteiro coeficienteC = 0
		inteiro coeficienteD = 0
		inteiro coeficienteE = 0
		inteiro coeficienteF = 0
		inteiro resultadoX = 0
		inteiro resultadoY = 0
		
		escreva("INFORME O VALOR DO COEFICIENTE A: ")
		leia(coeficienteA)
		escreva("INFORME O VALOR DO COEFICIENTE B: ")
		leia(coeficienteB)
		escreva("INFORME O VALOR DO COEFICIENTE C: ")
		leia(coeficienteC)
		escreva("INFORME O VALOR DO COEFICIENTE D: ")
		leia(coeficienteD)
		escreva("INFORME O VALOR DO COEFICIENTE E: ")
		leia(coeficienteE)
		escreva("INFORME O VALOR DO COEFICIENTE F: ")
		leia(coeficienteF)
		escreva("\nA OPERAÇÃO A SER RESOLVIDA É: \n")
		escreva(" ___________________________\n")
		escreva("|_ax + by = c_|_dx + ey = f_|\n")
		escreva("\n")
		resultadoX = coeficienteC * coeficienteE - coeficienteB * coeficienteF / coeficienteA * coeficienteE - coeficienteB * coeficienteD
		resultadoY = coeficienteA * coeficienteF - coeficienteC * coeficienteD / coeficienteA * coeficienteE - coeficienteB * coeficienteD
		escreva("O RESULTADO DE X É: ", resultadoX, "\n")
		escreva("O RESULTADO DE Y É: ", resultadoY)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */