programa
{
	
	funcao inicio()
	{
		inteiro valor1
		inteiro valor2
		
		escreva("Digite um número inteiro ", "\n")
		leia (valor1)
		
		escreva ("Digite outro número inteiro ", "\n")
		leia (valor2)
		
		se (valor1 < valor2){
			escreva ("a ordem crescente é: ", valor1, ",", valor2, "\n")
		}senao{
			escreva ("a ordem crescente é: ", valor2, ",", valor1, "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */