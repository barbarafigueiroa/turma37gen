programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{

		real x1 = 0.0
		real x2 = 0.0
		real y1 = 0.0
		real y2 = 0.0
		real d = 0.0
		
		escreva("DIGITE O VALOR DO PRIMEIRO PONTO: ")
		leia(x1)
		escreva("DIGITE O VALOR DO SEGUNDO PONTO: ")
		leia(x2)
		escreva("DIGITE O VALOR DO TERCEIRO PONTO: ")
		leia(y1)
		escreva("DIGITE O VALOR DO QUARTO PONTO: ")
		leia(y2)
		d = Matematica.arredondar ((Matematica.raiz ((Matematica.potencia ((x2-x1), 2) + Matematica.potencia ((y2-y1), 2)), 2)), 2)
		escreva("O RESULTADO DA OPERAÇÃO FOI: ", d)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */