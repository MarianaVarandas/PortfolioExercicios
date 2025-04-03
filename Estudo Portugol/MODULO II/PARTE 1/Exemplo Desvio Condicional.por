programa
{
	
	funcao inicio()
	{
		real MeuDinheiro
		real troco
		real precoPao
		logico comprarchocolate

		comprarchocolate = falso

		MeuDinheiro = 10.0

		escreva ("moço, quanto custa a unidade do pão: ", "\n")

		leia (precoPao)

		troco = MeuDinheiro - (precoPao*10) 

		se (troco > 0) 

		comprarchocolate = verdadeiro

		escreva (comprarchocolate)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */