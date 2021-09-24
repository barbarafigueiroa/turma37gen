programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade
		escreva(" _____________________________________\n")
		escreva("|                                     |\n")
		escreva("|       > > > CATEGORIAS < < <        |\n")
		escreva("|_____________________________________|\n")
		escreva("|CÓD. CATEG  |     FAIXA ETÁRIA       |\n")
		escreva("|     1      |           DE 5 A 7 ANOS|\n")
		escreva("|     2      |          DE 8 A 10 ANOS|\n")
		escreva("|     3      |         DE 11 A 13 ANOS|\n")
		escreva("|     4      |         DE 14 A 17 ANOS|\n")
		escreva("|     5      |         DE 18 A 59 ANOS|\n")
		escreva("|     6      |        ACIMA DE 60 ANOS|\n")
		escreva("|_____7______|________ABAIXO DE 4 ANOS|\n")
		escreva("\nDIGITE SEU NOME: ")
		leia(nome)
		escreva("\nDIGITE SUA IDADE: ")
		leia(idade)
		se(idade < 5){
			escreva("CATEGORIA: faixa etária não permitida ")	
		}
		senao se(idade >= 5 e idade <=7){
			escreva("CATEGORIA: INFANTIL A ")
		}
		senao se(idade >=8 e idade<=10){
			escreva("CATEGORIA: INFANTIL B ")
		}
		senao se(idade >= 11 e idade<=13){
			escreva("CATEGORIA: JUVENIL A")
		}	
		senao se(idade >=14 e idade <=17){
			escreva("CATEGORIA: JUVENIL B ")	
		}
		senao se(idade >= 18 e idade <=59){
			escreva("CATEGORIA: ADULTO ")
		}
		senao{
			escreva("CATEGORIA: IDOSO")	
		
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */