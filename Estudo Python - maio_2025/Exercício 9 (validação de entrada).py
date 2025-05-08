#opção 1
x = int(input("digite um valor negativo"))
while (x>=0):
    x = int(input("Digite um valor negativo"))
print (f"Você digitou {x}")

#opção 2
while (True):
    x = int(input("digite um valor negativo"))
    if (x >= 0):
      continue
    else:
      print(f"Você digitou {x}")
      break
