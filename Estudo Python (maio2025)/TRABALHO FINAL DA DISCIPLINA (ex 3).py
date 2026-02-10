#Enunciado: Você foi contratado para desenvolver um sistema de cobrança de serviços de uma copiadora. Você ficou com a parte de desenvolver a interface com o funcionário.
#A copiadora opera da seguinte maneira:
#Serviço de Digitalização (DIG) o custo por página é de um real e dez centavos;
#Serviço de Impressão Colorida (ICO) o custo por página é de um real; 
#Serviço de Impressão Preto e Branco (IPB) o custo por página é de quarenta centavos; 
#Serviço de Fotocópia (FOT) o custo por página é de vinte centavos; 

#Se número de páginas for menor que 20 retornar o número de página sem desconto;
#Se número de páginas for igual ou maior que 20 e menor que 200 retornar o número de páginas com o desconto é de 15%;
#Se número de páginas for igual ou maior que 200 e menor que 2000 retornar o número de páginas com o desconto é de 20%;
#Se número de páginas for igual ou maior que 2000 e menor que 20000 retornar o número de páginas com o desconto é de 25%;
#Se número de páginas for maior ou igual à 20000 não é aceito pedidos nessa quantidade de páginas;

#Para o adicional de encadernação simples (1) é cobrado um valor extra de 15 reais;
#Para o adicional de encadernação de capa dura (2) é cobrado um valor extra de 40 reais;
#Para o adicional de não querer mais nada (0) é cobrado um valor extra de 0 reais;

#O valor final da conta é calculado da seguinte maneira:

#total = (servico * num_pagina) + extra

#Elabore um programa em Python que: 
#Deve-se implementar o print com uma mensagem de boas-vindas que apareça o seu nome [EXIGÊNCIA DE CÓDIGO 1 de 7];
#Deve-se implementar a função escolha_servico() em que: [EXIGÊNCIA DE CÓDIGO 2 de 7];
#Pergunta o servico desejado;
#Retorna o valor servico com base na escolha do usuário;
#Repete a pergunta do item B.a se digitar uma opção diferente de: dig/ico/ipb/fot;
#Deve-se implementar a função num_pagina() em que: [EXIGÊNCIA DE CÓDIGO 3 de 7];
#Pergunta o número de páginas;
#Retorna o número de páginas com desconto seguindo a regra do enunciado (desconto calculado em cima do número de páginas);
#Repete a pergunta do item C.a se digitar um valor acima de 20000 ou valor não numérico (use try/except para não numérico)
#Deve-se implementar a função servico_extra() em que: [EXIGÊNCIA DE CÓDIGO 4 de 7];
#Pergunta pelo serviço adicional;
#Retornar o valor de apenas uma das opções de adicional 
#Repetir a pergunta item D.a se digitar uma opção diferente de: 1/2/0;
#Deve-se implementar o total a pagar no código principal (main), ou seja, não pode estar dentro de função, conforme o enunciado [EXIGÊNCIA DE CÓDIGO 5 de 7];
#Deve-se implementar try/except [EXIGÊNCIA DE CÓDIGO 6 de 7];
#Deve-se inserir comentários relevantes no código [EXIGÊNCIA DE CÓDIGO 7 de 7];
#Deve-se apresentar na saída de console uma mensagem de boas-vindas com o seu nome [EXIGÊNCIA DE SAÍDA DE CONSOLE 1 de 4];
#Deve-se apresentar na saída de console um pedido no qual o usuário errou a opção de serviço [EXIGÊNCIA DE SAÍDA DE CONSOLE 2 de 4];
#Deve-se apresentar na saída de console um pedido no qual o usuário digitou ultrapassou no número de páginas [EXIGÊNCIA DE SAÍDA DE CONSOLE 3 de 4];
#Deve-se apresentar na saída de console um pedido com opção de serviço, número de páginas e serviço extra válidos [EXIGÊNCIA DE SAÍDA DE CONSOLE 4 de 4];

print ("Seja muito bem-vinda, Mariana Varandas\n")

print ("**CATALOGO DE SERVIÇOS**\n")
print ("DIGITALIZAÇÃO (DIG) - R$1.10 por página")
print ("IMPRESSÃO COLORIDA (ICO) - R$1.00 por página")
print ("IMPRESSÃO PRETO E BRANCO (IPB) - R$0.40 por página")
print ("FOTOCÓPIA (FOT) - R$0.20 por página\n")

def escolha_serviço(): #primeira função para escolher serviço e retornar o valor dele
    while (True):
        servico = input("Digite a sigla do serviço (DIG/ICO/IPB/FOT):")

        if (servico != "DIG"and servico != "ICO" and servico != "IPB" and servico != "FOT"):
            print ("Escolha inválida. Tente novamente.\n")
            continue
        else:
            if (servico == "DIG"):
                valor_ser = 1.10

            if (servico == "ICO"):
                valor_ser = 1

            if (servico == "IPB"):
                valor_ser = 0.40
            
            if (servico == "FOT"):
                valor_ser = 0.20
        
        return valor_ser
            
        
def num_pagina (valor_ser): #segunda função para calcular a quantidade com o valor do serviço
    while (True):
        try: #função para validar a entrada apenas de números
            qtd = int(input("Digite o número de páginas:"))
            total = qtd * valor_ser  

            if (qtd > 19999):
                print ("Não aceitamos essa quantidade de páginas. Tente Novamente\n")
                continue

            elif (qtd >= 20 and qtd <= 199):
                valor_desc = total - (total*15/100) #15% desconto
        
            elif (qtd >= 200 and qtd <= 1999):
                valor_desc = total - (total*20/100) #20% desconto

            elif (qtd >= 2000 and qtd <= 19999):
                valor_desc = total - (total*25/100) #25% desconto

            elif (qtd < 20):
                valor_desc = total
    
            return valor_desc
        
        except ValueError:
            print ("Valor inválido. Certifique-se de ter digitado um número.")

def servico_extra (): #terceira função para adicionar encadernação
    print ("\n**OPÇOES DE ENCADERNAÇÃO**\n")
    print ("NÃO (0) - R$ 0.00")
    print ("ENCADERNAÇÃO SIMPLES (1) - R$15.00")
    print ("ENCADERNAÇÃO COM CAPA DURA (2) - R$40.00")
    
    while (True):
        enc = input("Deseja encadernar?")

        if (enc != "0" and enc != "1" and enc != "2"):
            print ("Valor inválido. Tente novamente.\n")
            continue

        elif (enc == "0" ):
            valor_enc = 0
        
        elif (enc == "1"):
            valor_enc = 15
        
        elif (enc == "2"):
            valor_enc = 40

        return valor_enc 

valor_ser = escolha_serviço()
valor_desc = num_pagina(valor_ser) #utilizando o return da escolha_servico como parâmetro para num_pagina
valor_enc = servico_extra()
total = valor_desc + valor_enc
print (f"O valor total deste pedido é: {total:.2f}")