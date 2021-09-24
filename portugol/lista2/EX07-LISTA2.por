programa
{
	
	funcao inicio()
	{
		real baseTriangulo = 0.0
		real alturaTriangulo = 0.0
		
		escreva (" >> CALCULANDO TRIANGULOS << \n \n")
		escreva ("INFORME A BASE DO TRIANGULO: ")
		leia (baseTriangulo)
		escreva ("INFORME A ALTURA DO TRIANGULO: ")
		leia (alturaTriangulo)
		
		se(baseTriangulo == 0 e alturaTriangulo ==0){
			escreva("\nZERO não é um valor considerado. Digite outro valor!")
			
		}senao se (baseTriangulo ==0){
			escreva("\nZERO não é um valor considerado. Digite outro valor!")
			
		}senao se (alturaTriangulo ==0){
			escreva("\nZERO não é um valor considerado. Digite outro valor!")
			
		}
		senao se( baseTriangulo > 0 e alturaTriangulo > 0){
			real areaTriangulo = baseTriangulo * alturaTriangulo
			escreva("\nCom base nos dados fornecidos, a área do triangulo é: ", areaTriangulo, " cm")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */