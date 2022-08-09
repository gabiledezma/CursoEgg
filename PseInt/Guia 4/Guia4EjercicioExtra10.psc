Algoritmo Guia4EjercicioExtra10
	//10. Realizar un programa que rellene de números aleatorios una matriz a través de un 
	//subprograma y generar otro subprograma que muestre por pantalla la matriz final
	Definir Matriz, Tamanio Como Entero
	Escribir "Ingrese el tamaño de la matriz:"
	Leer Tamanio
	Dimension Matriz[Tamanio,Tamanio]
	RellenarMatriz(Matriz,Tamanio)
	MostrarMatriz(Matriz,Tamanio)
FinAlgoritmo
SubProceso RellenarMatriz(Matriz,Tamanio)
	Definir i, j Como Entero
	Para i=0 Hasta Tamanio-1 Con Paso 1 Hacer
		Para j=0 Hasta Tamanio-1 Con Paso 1 Hacer
			Matriz[i,j]=Aleatorio(1,10)
		Fin Para
	Fin Para
FinSubProceso
SubProceso MostrarMatriz(Matriz,Tamanio)
	Definir i, j Como Entero
	Para i=0 Hasta Tamanio-1 Con Paso 1 Hacer
		Para j=0 Hasta Tamanio-1 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j], " "
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso
	