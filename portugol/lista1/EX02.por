programa
{
	
	funcao inicio()
	{
		inteiro idadeAno = 0
		inteiro idadeMes = 0
		inteiro idadeDia = 0
		
		
		escreva("  __________________________________________________\n")
		escreva(" |                                                  |\n")
		escreva(" |     SAIBA SUA IDADE EM ANOS, MESES E DIAS        |\n")
		escreva(" |__________________________________________________|\n")
		escreva(" |__________INFORME A SUA IDADE PARA ABAIXO_________|\n")
		escreva("  \n")
		escreva(" |IDADE EM DIAS: ")
		leia(idadeDia)
		idadeAno = idadeDia / 365
		idadeMes = 12 * idadeAno
		escreva(" |IDADE EM MÊSES: ", idadeMes, " mêses\n")
		escreva(" |IDADE EM ANOS: ", idadeAno, " anos\n")
		escreva("\n")
		escreva(" >>>> V O L T E  S E M P R E <<<<")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */