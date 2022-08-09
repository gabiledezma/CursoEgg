Algoritmo Guia3Ejercicios11
	
	//11. Realizar una función que calcule y retorne la suma de todos los divisores del número n 
	//distintos de n. El valor de n debe ser ingresado por el usuario
	
	Definir n Como Entero
	Escribir "Ingrese un número: "
	Leer n
	Escribir "La suma de todos los divisores de ", n " es: " Sumatoria(n)
FinAlgoritmo

Funcion Resultado <- Sumatoria (n)
	Definir i, Resultado Como Entero
	Resultado=0
	Para i=1 Hasta n/2 Con Paso 1 Hacer
		Si (n MOD i) == 0  
			Resultado=Resultado+i			
		FinSi
	FinPara
FinFuncion