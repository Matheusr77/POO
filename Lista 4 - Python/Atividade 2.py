peso = float(input("Digite seu peso: "))
altura = float(input("Digite sua altura: "))

imc = peso / (pow(altura, 2))

print("Seu IMC é: %.2f" % imc)