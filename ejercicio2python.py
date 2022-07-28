numero_inicial = 0
numero_final = 0
print("Este programa muestra los numeros impares que hay entre los rangos de valores que indique.")
print("Inserte valor 1:")
numero_inicial = int(input())
print("Inserte valor 2:")
numero_final =  int(input())
print("Los numeros impares son:")

while (numero_final != numero_inicial):
    if (numero_inicial%2 != 0):
            print(numero_inicial)
    numero_inicial += 1
