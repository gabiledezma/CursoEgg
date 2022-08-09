Algoritmo Guia2Ejercicio11Cascada
	
	//11. Construir un programa que simule un menú de opciones para realizar las cuatro
	//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
	//numéricos enteros. El usuario, además, debe especificar la operación con el primer
	//carácter de la operación que desea realizar: S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
	//o ?m? para la multiplicación y ?D? o ?d? para la división.
	
	Definir num1, num2 Como real
	Definir S, R, M, D Como Caracter
	Definir aux Como caracter
		
	Escribir "Ingrese primer número:"
	Leer num1
	Escribir "Ingrese segundo número (Diferente de 0):"
	Leer num2
	Escribir "Ingrese operacion deseada ( s para Suma, r para Resta, m para Multiplicación o d para División):"
	Leer aux
	
	Si (aux == "s") o (aux == "S") Entonces
		Escribir num1+num2
	SiNo
		Si(aux == "r") o (aux == "R") Entonces
			Escribir  num1-num2
		SiNo
			Si (aux == "m") o (aux == "M") Entonces
				Escribir num1*num2
			SiNo
				Si (aux == "d") o (aux == "D") Entonces
					Escribir num1/num2
				SiNo
					Escribir "No pertence a una operación posible."
				FinSi
			FinSi
		Fin Si
	FinSi
	
FinAlgoritmo
