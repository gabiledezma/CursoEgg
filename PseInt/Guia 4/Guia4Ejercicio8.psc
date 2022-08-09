Algoritmo Guia4Ejercicio8
	//8. Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el 
	//usuario y los muestre por pantalla.
	Definir Matriz, i, j Como Entero
	Dimension Matriz[3,3]
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir "Ingrese un valor para ", i, ", ", j
			Leer Matriz[i,j]
		Fin Para
	Fin Para
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir "El valor para ", i, ", ", j, " es: " Matriz[i,j]
		Fin Para
	Fin Para
FinAlgoritmo
