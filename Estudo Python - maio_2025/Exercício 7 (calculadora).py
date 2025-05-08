x = float(input("Digite o primeiro valor a ser utilizado nesta operação: "))
y = float(input("Digite o segundo valor a ser utilizado nesta operação: "))
print ("\nObserve os símbolos das operações possíveis:")
print ("+ adição \n- subtração \n* multiplicação \n/ divisão:")
op = input("Digite o símbolo da operação desejada: ")
ad = x + y
sub = x - y
mult = x * y
div = x / y

if (op == '+'):
    print(f"A soma dos valores é igual a {ad}")
           
elif (op == '-'):
    print(f"A subtração dos valores é igual a {sub}")

elif (op == '*'):
    print(f"A multiplicação dos valores é igual a {mult}")

elif (op == '/'):
    print(f"A divisão dos valores é igual a {div}")

else:
    print("o símbolo escolhido não é suportado por esta calculadora")