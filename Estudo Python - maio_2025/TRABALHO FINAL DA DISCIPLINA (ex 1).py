#Enunciado: Imagina-se que você é um dos programadores responsáveis pela construção de um app de vendas para uma determinada empresa X que vende em atacado. Uma das estratégias de vendas dessa empresa X é dar desconto maior conforme o valor da compra, conforme a listagem abaixo:
#Se valor for menor que 2500 o desconto será de 0%;
#Se valor for igual ou maior que 2500 e menor que 6000 o desconto será de 4%;
#Se valor for igual ou maior que 6000 e menor que 10000 o desconto será de 7%;
#Se valor for igual ou maior que 10000 o desconto será de 11%;

#Elabore um programa em Python que:
#Deve-se implementar o print com uma mensagem de boas-vindas que apareça o seu nome e sobrenome [EXIGÊNCIA DE CÓDIGO 1 de 6];
#Deve-se implementar o input do valor unitário e da quantidade do produto [EXIGÊNCIA DE CÓDIGO 2 de 6];
#Deve-se implementar o desconto conforme a enunciado acima (obs.: atente-se as condições de menor, igual e maior) [EXIGÊNCIA DE CÓDIGO 3 de 6];
#Deve-se implementar o valor total sem desconto e o valor total com desconto [EXIGÊNCIA DE CÓDIGO 4 de 6];
#Deve-se implementar as estruturas if, elif e else (todas elas) [EXIGÊNCIA DE CÓDIGO 5 de 6];  
#Deve-se inserir comentários relevantes no código [EXIGÊNCIA DE CÓDIGO 6 de 6];
#Deve-se apresentar na saída de console uma mensagem de boas-vindas com seu nome [EXIGÊNCIA DE SAÍDA DE CONSOLE 1 de 2];
#Deve-se apresentar na saída de console um pedido recebendo desconto (valor total sem desconto maior ou igual a 2500) [EXIGÊNCIA DE SAÍDA DE CONSOLE 2 de 2];  


print ("Seja bem-vinda, Mariana Varandas!")
preco = float(input("Digite o valor por unidade do produto vendido: R$"))
#ponto flutuante para suportar valores quebrados
qtd = int(input("Digite a quantidade de ítens vendidos: "))
total = preco * qtd

if (total >= 2500 and total<6000):
    print(f"O valor sem desconto é de R${total}")
    print(f"O valor com desconto é de R${total - total*4/100}") #4% desconto

elif (total >= 6000 and total < 10000):
    print(f"O valor sem desconto é de R${total}")
    print(f"O valor com desconto é de R${total - total*7/100}") #7% de desconto
    
elif (total >= 10000):
    print(f"O valor sem desconto é de R${total}")
    print(f"O valor cem desconto é de R${total - total*11/100}") #11% de desconto

else:
    print (f"Não há desconto neste caso. O valor final é de R${total}")