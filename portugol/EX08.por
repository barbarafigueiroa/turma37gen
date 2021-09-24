programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		real custoFabrica = 0.0
		real custoCliente = 0.0
		real porcentagemDistribuidor = 0.0
		real impostos = 0.0
		
		escreva("CALCULE SEU VEÍCULO PELO CUSTO DE FÁBRICA\n")
		escreva("\nINFORME O CUSTO DO VEÍCULO NA FÁBRICA: ")
		leia(custoFabrica)
		escreva("\n")
		escreva("INFORME A PORCENTAGEM DO DISTRIBUIDOR: ")
		leia(porcentagemDistribuidor)
		escreva("\n")
		escreva("INFORME A TAXA DE IMPOSTO: ")
		leia(impostos)
		escreva("\n")
		porcentagemDistribuidor = custoFabrica * porcentagemDistribuidor / 100
		impostos = custoFabrica * impostos / 100
		custoCliente = porcentagemDistribuidor + impostos + custoFabrica
		escreva("O CARRO PARA O CLIENTE, SAIRÁ NO VALOR DE: R$", (m.arredondar(custoCliente,2))," REAIS")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 786; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */