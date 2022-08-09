Algoritmo Guia4Ejercicio1
	//1. Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los 
	//muestre por pantalla.
	Vectores()
FinAlgoritmo
SubProceso Vectores()
	Definir vector, i Como Entero
	Dimension Vector[5]
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Escribir "Ingrese un numero para el subindice " i
		Leer Vector[i]
	Fin Para
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Escribir "El número ingresado para el subindice ", i, " es ", vector[i] 
	Fin Para	
FinSubProceso
	