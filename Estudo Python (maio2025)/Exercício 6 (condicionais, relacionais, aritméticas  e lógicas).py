lado_a = float(input("Digite, em centímetros, o tamanho do lado A do triângulo:"))
lado_b = float(input("Digite, em centímetros, o tamanho do lado B do triângulo:"))
lado_c = float(input("Digite, em centímetros, o tamanho do lado C do triângulo:"))

if (lado_a > 0 and lado_b > 0 and lado_c > 0):
    
    if (lado_a + lado_b >= lado_c and lado_a + lado_c >= lado_b and lado_b + lado_c >= lado_a):
        if (lado_a == lado_b and lado_b == lado_c):
            print ("Esse é um triângulo equilátero")

        elif (lado_a == lado_b and lado_b != lado_c):
            print ("Esse é um triângulo isósceles")

        elif (lado_a != lado_b and lado_b == lado_c):
            print ("Esse é um triângulo isósceles")

        elif (lado_a == lado_c and lado_c != lado_b):
            print ("Esse é um triângulo isósceles")

        elif (lado_a != lado_b and lado_b != lado_c):
            print ("Esse triângulo é escaleno")
    else:
        print ("Isso não é um triângulo")

else:
    print ("Isso não é um triângulo")
