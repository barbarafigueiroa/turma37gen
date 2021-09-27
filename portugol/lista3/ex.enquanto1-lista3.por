programa
{
	
	funcao inicio()
	{
		inteiro valorDigitado = 0
		real media = 0.0
		inteiro totalSoma = 0
		real totalValoresDigitados =0.0

		enquanto(valorDigitado >= 0){
			
			escreva("INFORME UM NÚMERO: ")
			leia(valorDigitado)
			se(valorDigitado >= 0){
				totalSoma += valorDigitado
				totalValoresDigitados++
				
			}
			 
		}
		
		media =  totalSoma / totalValoresDigitados  
		escreva("\nTOTAL DE NÚMEROS DIGITADOS: ", totalValoresDigitados)
		escreva("\nMÉDIA: ", media)
		escreva("\nTOTAL DE NÚMEROS SOMADOS: ", totalSoma)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */