print ("Este é um programa pensado para te ajudar a entender os custos do aluguel de um carro em sua próxima viagem. \nPreencha os dados solicitados e receba, em segundos, os valores envolvidos nessa escolha!\n")
dias = float(input("Por quantos dias você pretende ficar com o carro alugado?"))
km = float(input("Quantos quilômetros você acredita que rodará com esse automóvel?"))

valor_aluguel = dias * 60
valor_gas = km * 0.15
total = valor_aluguel + valor_gas

print (f"\nO seu gasto com o aluguel do carro será de R${valor_aluguel:.2f}")
print (f"O seu gasto com gasolina será de R${valor_gas:.2f}")
print (f"O custo total com locomoção nessa viagem será de R${total:.2f}")
