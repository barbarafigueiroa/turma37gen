programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		real nota1 = 0.0
		real nota2 = 0.0
		real nota3 = 0.0
		real mediaSemPeso = 0.0
		real mediaComPeso = 0.0
		
		escreva("DIGITE A PRIMEIRA NOTA: ")
		leia(nota1)
		escreva("DIGITE A SEGUNDA NOTA: ")
		leia(nota2)
		escreva("DIGITE A TERCEIRA NOTA: ")
		leia(nota3)
		mediaSemPeso = nota1 + nota2 + nota3 / 3
		escreva("MÉDIA DO ALUNO SEM PESO DE NOTAS: ",(m.arredondar(mediaSemPeso,2)), "\n")
		nota1 = nota1 * 2
		nota2 = nota2 * 3
		nota3 = nota3 * 5
		mediaComPeso = nota1 + nota2 + nota3 / 3
		escreva("MÉDIA DO ALUNO COM SEUS RESPECTIVOS PESOS: ", (m.arredondar(mediaComPeso,2)))
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */