#função para validar a entrada

def valida (pergunta,min,max):
    y = int(input(pergunta))
    while ((y < min) or (y > max)):
        print("Dado inválido. Tente novamente.")
        y = int(input(pergunta))
    return y 

#função para calcular a fatoração

def fatorial (num):
    #help da função logo abaixo do cabeçalho
    """
    Função para calcular fatoração do número oferecido na entrada

    """

    fat = 1
    if (num == 0):
        return fat
    for x in range (1, num+1, 1):
        fat *= x
    
    return fat
    

#aplicação das funções, i.e, o código em si. Esse código puxa a validaçao primeiro,
#depois manda o retorno da função de validação (y) para a segunda função, que retorna o resultado.

y = valida ("Digite um valor para fatoração: ", 0, 99)
print (f"{y}! = {fatorial (y)}")


