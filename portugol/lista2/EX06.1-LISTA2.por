programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro codigoCategoria=0
		escreva(" ___________________________\n")
		escreva("|    > > > TABELA < < <     |\n")
		escreva("|          > DE <           |\n")
		escreva("|_____>> CATEGORIA <<_______|\n")
		escreva("|  CÓD.CAT |  FAIXA ETÁRIA  |\n")
		escreva("|    1     |   DE 5 A 7 ANOS|\n")
		escreva("|    2     |  DE 8 A 10 ANOS|\n")
		escreva("|    3     | DE 11 A 13 ANOS|\n")
		escreva("|    4     | DE 14 A 17 ANOS|\n")
		escreva("|    5     | DE 18 A 59 ANOS|\n")
		escreva("|    6     |ACIMA DE 60 ANOS|\n")
		escreva("|    7     |ABAIXO DE 4 ANOS|\n")
		escreva("|__________|________________|\n")
		escreva("\nDIGITE SEU NOME: ")
		leia(nome)
		escreva("\nDIGITE O CÓDIGO CONFORME SUA FAIXA ETÁRIA: ")
		leia(codigoCategoria)
		escolha(codigoCategoria){
			caso 1: escreva("CATEGORIA: INFANTIL ")
			pare
			caso 2: escreva("CATEGORIA: CRIANÇA ")
			pare
			caso 3: escreva("CATEGORIA: JUVENIL ")
			pare
			caso 4: escreva("CATEGORIA: ADOLESCENTE")
			pare
			caso 5: escreva("CATEGORIA: ADULTO")
			pare
			caso 6: escreva("CATEGORIA: IDOSO")
			pare
			caso 7: escreva("FORA DE FAIXA")
			pare
			caso contrario: escreva("DIGITE O CÓDIGO REFERENTE A SUA IDADE DE ACORDO COM A TABELA ")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */