programa
{
	
	funcao inicio()
	{
		real pontuacao[5]
		real maiorPontuacao = 0.0

		para(inteiro i = 0; i <5; i++){
			escreva("PONTUAÇÃO: ")
			leia(pontuacao[i])
			se(maiorPontuacao < pontuacao[i]){
				maiorPontuacao = pontuacao[i]
				
			}
			
		}
		limpa()
		para(inteiro i = 0; i<5; i++){
			escreva(i, ".PONTUAÇÃO: ", pontuacao[i])
			escreva("\n--------------------\n")
			
		}
		escreva("\n\nMAIOR PONTUAÇÃO: ", maiorPontuacao,"\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */