Algoritmo Guia3Ejercicios6
	
	//6. Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo 
	//entero. La variable A, debe terminar con el valor de la variable B
	

	Definir Num1, Num2 Como Entero
		
	Escribir "Primer Valor: "
	Leer num1
		
	Escribir "Segundo Valor: "
	Leer num2
		
	Intercambio(Num1, Num2)
	
FinAlgoritmo

SubProceso Intercambio(A,B)
	
	Definir Aux Como Entero
	
	Aux=A
	A=B
	B=Aux

	Escribir "Primer Valor: " A
	Escribir "Segundo Valor: " B

FinSubProceso
