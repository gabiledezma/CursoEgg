Algoritmo Guia2ejercicio11
//Construir un programa que simule un menú de opciones para realizar las cuatro
//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//o ?m? para la multiplicación y ?D? o ?d? para la división

Definir num1 , num2  Como Entero
Definir R, S, M, D Como Caracter
Definir ope Como Caracter

Escribir "Ingrese primer número: "
Leer num1
Escribir "Ingrese segundo número (Diferente de 0): "
Leer num2


Escribir "Ingrese operacion deseada ( s para Suma, r para Resta, m para Multiplicación o d para División):"
Leer ope
Segun ope Hacer
	"s", "S":
		escribir num1 + num2 
	"r", "R":
		escribir num1 - num2 
	"m", "M":
		escribir num1 * num2 
	"d", "D":	
		Escribir num1 / num2
	De Otro Modo:
		Escribir "No pertence a una operación posible."
Fin Segun



FinAlgoritmo

