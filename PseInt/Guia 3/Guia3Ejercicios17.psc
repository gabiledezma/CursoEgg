Algoritmo Guia3Ejercicios17
	
	//17. Realizar una funci�n que permita obtener el t�rmino n de la sucesi�n de Fibonacci. La 
	//sucesi�n de Fibonacci es la sucesi�n de los siguientes n�meros:
	//1, 1, 2, 3, 5, 8, 13, 21, 34, ...
	//Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por 
	//ejemplo:
	//La sucesi�n del n�mero 2 se calcula sumando (1+1)
	//An�logamente, la sucesi�n del n�mero 3 es (1+2),
	//Y la del 5 es (2+3),
	//Y as� sucesivamente?
	//La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula: 
	//Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
	//Fibonacci (n) = 1 para todo n <= 1
	//Por lo tanto, si queremos calcular el t�rmino "n" debemos escribir una funci�n que 
	//reciba como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.
	
	Definir Num, Resuelto Como Entero
	Escribir "Ingrese un n�mero:"
	Leer Num
	Resuelto= Fibonacci(Num)
	Escribir "La sucesi�n de Fibonacci de ", Num, " es: " Resuelto
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
