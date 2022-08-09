Algoritmo Guia3Ejercicios1
	
	//1. Realizar una función que calcule la suma de dos números. En el algoritmo principal le 
	//pediremos al usuario los dos números para pasárselos a la función. Después la función 
	//calculará la suma y lo devolverá para imprimirlo en el algoritmo.
	
	Definir Num1, Num2 Como Entero
	
	Escribir "Ingrese un número: "
	Leer Num1
	
	Escribir "Ingrese otro número: "
	Leer Num2
	
	Escribir "El resultado de la suma es: ", Suma(Num1, Num2)
	
FinAlgoritmo

Funcion Resultado <- Suma ( a, b )
	
	Definir Resultado Como Entero
	
	Resultado = a + b
	
FinFuncion
	