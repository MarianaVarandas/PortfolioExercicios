programa
{
	
	funcao inicio()
	{
		real valor1, valor2, valor3
		
		escreva ("Digite um número: ", "\n")
		leia (valor1)

		escreva ("Digite um segundo número: ", "\n")
		leia (valor2)

		escreva ("Digite um terceiro número: ", "\n")
		leia (valor3)

		se (valor1 > valor2 e valor1 > valor3 ) {
			escreva ("este é o maior número: ", valor1, "\n")
		} senao se (valor2 > valor1 e valor2 > valor3 ) {
			escreva ("este é o maior número: ", valor2, "\n")
		} senao
		escreva ("este é o maior número número: ", valor3, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */