programa
{
	
	funcao inicio()
	{

		inteiro numero = 0
		inteiro resultado = 0
		escreva("   _______________________________________\n")
		escreva("  |                                       |\n")
		escreva("  |              PAR OU IMPAR?            |\n")
		escreva("  |_______________________________________|\n")
		escreva("\n\n")
		escreva("DIGITE UM NÚMERO QUALQUER: ")
		leia(numero)
		resultado = numero % 2 
		se(resultado == 0){
			escreva("\nO NÚMERO ", numero, " É PAR ")
			
		}senao{
			escreva("\nO NÚMERO ", numero, " É IMPAR ")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */