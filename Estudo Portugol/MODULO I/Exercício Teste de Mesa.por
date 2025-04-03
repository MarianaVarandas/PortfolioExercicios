programa
{
	
	funcao inicio()
	{
		inteiro a, b, soma, sub, mult, div, resto

		escreva ("aponte um número inteiro", "\n")
		leia (a)
		escreva ("aponte outro número inteiro", "\n")
		leia (b)

		soma = a + b
		sub = a - b
		mult = a * b
		div = a / b
		resto = a % b

		escreva ("a soma dos números é igual a: ", soma, "\n")
		escreva ("a subtração dos números é igual a: ", sub, "\n")
		escreva ("a multiplicação dos números é igual a: ", mult, "\n")
		escreva ("a divisão dos números é igual a ", div, " com resto ", resto, "\n")
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