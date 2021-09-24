programa
{
	
	funcao inicio()
	{
		inteiro primeiroNumero = 0
		inteiro segundoNumero = 0
		inteiro terceiroNumero = 0
		inteiro quartoNumero = 0
		inteiro quadrado1 = 0
		inteiro quadrado2 = 0
		inteiro quadrado3 = 0
		inteiro quadrado4 = 0
		
		escreva("DIGITE O PRIMEIRO NUMERO: ")
		leia(primeiroNumero)
		escreva("DIGITE O SEGUNDO NUMERO: ")
		leia(segundoNumero)
		escreva("DIGITE O TERCEIRO NUMERO: ")
		leia(terceiroNumero)
		escreva("DIGITE O QUARTO NUMERO: ")
		leia(quartoNumero)
		escreva("\n")
		quadrado1 = primeiroNumero * primeiroNumero
		quadrado2 = segundoNumero * segundoNumero
		quadrado3 = terceiroNumero * terceiroNumero
		quadrado4 = quartoNumero * quartoNumero
		se (quadrado3 >= 1000){
			escreva("\nValor resultante do quadrado do terceiro: ", quadrado3)
		}
		senao{
			escreva("1.Número: ", primeiroNumero, " seu respectivo quadrado: ", quadrado1)
			escreva("\n2.Número: ", segundoNumero, " seu respectivo quadrado: ", quadrado2)
			escreva("\n3.Número: ", terceiroNumero, " seu respectivo quadrado: ", quadrado3)
			escreva("\n4.Número: ", quartoNumero, " seu respectivo quadrado: ", quadrado4)
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 725; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */