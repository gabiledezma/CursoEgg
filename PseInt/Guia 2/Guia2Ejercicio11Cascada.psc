Algoritmo Guia2Ejercicio11Cascada
	
	//11. Construir un programa que simule un men� de opciones para realizar las cuatro
	//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
	//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
	//car�cter de la operaci�n que desea realizar: S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
	//o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.
	
	Definir num1, num2 Como real
	Definir S, R, M, D Como Caracter
	Definir aux Como caracter
		
	Escribir "Ingrese primer n�mero:"
	Leer num1
	Escribir "Ingrese segundo n�mero (Diferente de 0):"
	Leer num2
	Escribir "Ingrese operacion deseada ( s para Suma, r para Resta, m para Multiplicaci�n o d para Divisi�n):"
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
					Escribir "No pertence a una operaci�n posible."
				FinSi
			FinSi
		Fin Si
	FinSi
	
FinAlgoritmo
