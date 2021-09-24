programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		real tomatePeso = 0.0
		real kiloExcedido = 0.0
		real multa = 0.0
		
		escreva("  __________________________________________________\n")
		escreva(" |                                                  |\n")
		escreva(" |  >> SISTEMA DE PRODUÇÃO DIÁRIA E REGULAMENTO <<  |\n")
		escreva(" |__________________________________________________|\n")
		escreva(" \nQUANTOS QUILOGRAMAS TEVE SUA PRODUÇÃO DIÁRIA: ")
		leia(tomatePeso)
		kiloExcedido = tomatePeso - 50
		multa = kiloExcedido * 4
		se (tomatePeso < 50){
			multa = 0.0
			kiloExcedido = 0.0
			escreva("\nSua produção diária está dentro do regulamento. Você não possue multas a pagar.\n")
		}
			senao se (tomatePeso > 50){
				escreva("\nSua produção excedeu ", (m.arredondar(kiloExcedido,2)), " Kg. Valor da multa aplicada por Kg excedido é de: R$", (m.arredondar(multa,2)), " reais.\n")
			}
	
	}
		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 933; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */