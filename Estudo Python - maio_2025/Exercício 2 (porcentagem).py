valor_1 = float(input("Adicione o valor do produto a receber desconto: "))
percent = float(input ("Adicionei o percentual a ser descontado: "))

res = valor_1 * percent / 100
valor_final = valor_1 - res

print (f"O valor do desconto foi de R${res:.2f} e o preço final do produto, após o desconto, é de R${valor_final:.2f}")
