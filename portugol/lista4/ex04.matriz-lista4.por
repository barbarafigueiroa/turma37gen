programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro soma = 0
		inteiro somaDiagonalPrincipal = 0
		
		para(inteiro linha=0;linha<3;linha++){
			para(inteiro coluna=0;coluna<3;coluna++){
				escreva("INFORME UM VALOR PARA LINHA E OUTRO PARA COLUNA: ")
				leia(matriz[linha][coluna])
				soma+= matriz[linha][coluna]
				se(linha == coluna){
					somaDiagonalPrincipal+= matriz[linha][coluna]
				}
			}
		}
		escreva("\nSOMA DOS VALORES DA DIAGONAL: ", somaDiagonalPrincipal, "\n")
		escreva("\nSOMA DE TODOS OS VALORES DA MATRIZ: ", soma, "\n")
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */