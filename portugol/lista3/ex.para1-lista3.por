programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
		
		real maiorSalario = 0.0
		real salario = 0.0
		real totalSalarios = 0.0
		real mediaSalarialPopulacao = 0.0
		inteiro totalFilhos = 0
		inteiro quantidadeFilhos = 0
		real mediaNumFilhos = 0.0
		real salariosAte100 = 0.0
		real porcentagemSalariosAte100 = 0.0
		
		
		escreva(" __________________________________________\n")
		escreva("|  $                                  $    |\n")
		escreva("| $  $      PESQUISA SALARIAL        $  $  |\n")
		escreva("|__$__________________________________$____|\n")

		para(inteiro c =1; c <= 3 ; c++){
			
			escreva("Salário atual: \n")
			leia(salario)
			escreva("Quantidade de filhos: \n")
			leia(quantidadeFilhos)

			totalSalarios += salario
			mediaSalarialPopulacao = totalSalarios / 3

			totalFilhos += quantidadeFilhos
			mediaNumFilhos = quantidadeFilhos / 3.0

			se(salario > maiorSalario){
				maiorSalario = salario
				
			}
			se(salario <= 100){
				salariosAte100 ++
				porcentagemSalariosAte100 = (100 * salariosAte100) /3
	
			}
			
		}
		limpa()
		escreva("===============================================")
		escreva("\nMÉDIA SALARIAL DA POPULAÇÃO: R$", m.arredondar(mediaSalarialPopulacao,2), " Reais \n")
		escreva("===============================================")
		escreva("\nNÚMERO MÉDIO DE FILHOS: ", m.arredondar(mediaNumFilhos, 2), "\n")
				escreva("===============================================")
		escreva("\nO MAIOR SALÁRIO REGISTRADO: R$", m.arredondar(maiorSalario, 2), " Reais \n") 
				escreva("===============================================")
		escreva("\nPERCENTUAL DE RENDA ATÉ R$ 100 REAIS: ", m.arredondar(porcentagemSalariosAte100, 2), " %\n")
				escreva("===============================================")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 826; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */