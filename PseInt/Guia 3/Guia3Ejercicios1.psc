Algoritmo Guia3Ejercicios1
	
	//1. Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le 
	//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n 
	//calcular� la suma y lo devolver� para imprimirlo en el algoritmo.
	
	Definir Num1, Num2 Como Entero
	
	Escribir "Ingrese un n�mero: "
	Leer Num1
	
	Escribir "Ingrese otro n�mero: "
	Leer Num2
	
	Escribir "El resultado de la suma es: ", Suma(Num1, Num2)
	
FinAlgoritmo

Funcion Resultado <- Suma ( a, b )
	
	Definir Resultado Como Entero
	
	Resultado = a + b
	
FinFuncion
	