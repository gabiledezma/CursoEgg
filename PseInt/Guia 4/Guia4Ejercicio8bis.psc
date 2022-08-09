Algoritmo Guia4Ejercicio8bis
	//8. Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el 
	//usuario y los muestre por pantalla.
	Definir Matriz, i, j Como Entero
	Dimension Matriz[3,3]
	Escribir "Ingrese un valor para llenar la matriz:"
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Leer Matriz[i,j]
		Fin Para
	Fin Para
	Escribir "Los valores de la matriz son: "
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j]
			Escribir Sin Saltar " "
		 Fin Para
		 Escribir " "
	Fin Para
FinAlgoritmo