Algoritmo Guia4Ejercicio10
	//10. Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) 
	//realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos 
	//otro subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar 
	//la matriz y los resultados por pantalla. 
	Definir N, M, Matriz Como Entero
	Escribir "Ingrese la cantidad de filas de la matriz: "
	Leer N
	Escribir "Ingrese la cantidad de columnas de la matriz: "
	Leer M
	Dimension Matriz[N,M]
	RellenarMatriz(Matriz,N,M)
FinAlgoritmo
SubProceso RellenarMatriz(Matriz,N,M)
	Definir i, j, ValorMin, ValorMax Como Entero
	ValorMin=1
	ValorMax=5
	Para i=0 Hasta N-1 Con Paso 1 Hacer
		Para j=0 Hasta M-1 Con Paso 1 Hacer
			Matriz[i,j]=Aleatorio(ValorMin,ValorMax)
		Fin Para
	Fin Para
	SumaDeElementos(Matriz,N,M)
FinSubProceso
SubProceso SumaDeElementos(Matriz,N,M)
	Definir Sumatoria, i, j Como Entero
	Sumatoria=0
	Para i=0 Hasta N-1 Con Paso 1 Hacer
		Para j=0 Hasta M-1 Con Paso 1 Hacer
			Sumatoria=Sumatoria+Matriz[i,j]
			Escribir "El Valor almacenada en: ", i, ", ", j, " es: " Matriz[i,j]
		Fin Para
	Fin Para
	Escribir "La sumatoria de todos los elementos almacenados en la matriz es: ", Sumatoria
FinSubProceso
	