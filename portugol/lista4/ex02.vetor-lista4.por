programa
{
	
	funcao inicio()
	{
		inteiro lancamentos[10]
		inteiro soma = 0
		inteiro maiorPontuacao = 0
		inteiro contador = 0

		//preenchendo o vetor
		para(inteiro i = 0; i <10; i++){
			escreva(i,".LANÇAMENTO: ")
			leia(lancamentos[i])
			soma = soma + lancamentos[i]
			se(lancamentos[i] > maiorPontuacao){
				maiorPontuacao = lancamentos[i]
			}
			
			
		}
		limpa()
		para(inteiro i = 0; i < 10; i++){
			escreva(i,".LANÇAMENTO: ", lancamentos[i], "\n")
			se(lancamentos[i] == maiorPontuacao){
				contador ++
			}
			
		}
		escreva("\nMÉDIA DE LANÇAMENTO: ", soma/10, "\n")
		escreva("\nMAIOR PONTUAÇÃO: ", maiorPontuacao, "\n")
		escreva("\nNUMERO DE VEZES QUE A MAIOR PONTUAÇÃO APARECEU: ", contador,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */