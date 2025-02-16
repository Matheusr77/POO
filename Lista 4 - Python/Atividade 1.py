import math

a = int(input("Digite o termo A: "))
b = int(input("Digite o termo B: "))
c = int(input("Digite o termo C: "))

delta = pow(b, 2) - 4 * a * c

if delta < 0:
    print("Não exite raízes reais")

else:

    x1 = (-b + math.sqrt(delta)) / (2*a)
    x2 = (-b - math.sqrt(delta)) / (2*a)

    print("A raiz 1 é: ", x1)
    print("A raiz 2 é: ", x2)