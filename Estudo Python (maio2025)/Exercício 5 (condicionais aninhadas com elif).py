print ("Olá! Essa é nossa calculadora de livros. Com ela, você pode ter, em segundos, o valor final da sua compra.\nPor enquanto, essa ferramenta calcula apenas um título por vez, combinado?")
print ("Veja abaixo nosso catálogo:\n")
print ("1 - Memórias Póstumas de Brás Cubas")
print ("2 - Dom Casmurro")
print ("3 - Quincas Borba\n")

livro= int(input("Digite o número do livro escolhido"))
qtd= int(input("Qual a quantidade desejada?"))

if (livro==1):
    preco= qtd*25
    saida=f"\nO custo de {qtd} unidades de 'Memórias Póstumas de Brás Cubas' é de R${preco:.2f}"
    print(saida)

elif (livro==2):
    preco=qtd*30
    saida=f"\nO custo de {qtd} unidades de 'Dom Casmurro' é de R${preco:.2f}"
    print(saida)

elif (livro==3):
    preco=qtd*55.3
    saida=f"\nO custo de {qtd} unidades de 'Quincas Borba' é de R${preco:.2f}"
    print(saida)

else:
     print ("\nLivro não catalogado! \nCertifique-se de ter digitado corretamente e faça uma nova tentativa!")



