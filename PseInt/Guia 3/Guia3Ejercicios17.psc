Algoritmo Guia3Ejercicios17
	
	//17. Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La 
	//sucesión de Fibonacci es la sucesión de los siguientes números:
	//1, 1, 2, 3, 5, 8, 13, 21, 34, ...
	//Donde cada uno de los números se calcula sumando los dos anteriores a él. Por 
	//ejemplo:
	//La sucesión del número 2 se calcula sumando (1+1)
	//Análogamente, la sucesión del número 3 es (1+2),
	//Y la del 5 es (2+3),
	//Y así sucesivamente?
	//La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: 
	//Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
	//Fibonacci (n) = 1 para todo n <= 1
	//Por lo tanto, si queremos calcular el término "n" debemos escribir una función que 
	//reciba como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.
	
	Definir Num, Resuelto Como Entero
	Escribir "Ingrese un número:"
	Leer Num
	Resuelto= Fibonacci(Num)
	Escribir "La sucesión de Fibonacci de ", Num, " es: " Resuelto
FinAlgoritmo
Funcion aux1<- Fibonacci(Num)
	Definir aux1, aux2, aux3, i Como Entero	
	aux1=0
	aux2=1
	Para i=1 Hasta Num Hacer
		aux3=aux1+aux2
		aux1=aux2
		aux2=aux3
		Escribir aux1
	FinPara
FinFuncion
