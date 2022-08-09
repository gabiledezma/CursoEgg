Algoritmo Guia4EjercicioExtra14
	//14. Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las 
	//dos primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 
	//columna se deberá almacenar el resultado de sumar el número de la primera y segunda 
	//columna. Mostrar la matriz de la siguiente forma:
	///		3 + 5 = 8
	///		4 + 3 = 7
	///		1 + 4 = 5
	Definir Matriz, i, j, Sumatoria, Filas Como Entero
	Escribir "Ingrese la cantidad de filas: "
	Leer Filas
	Dimension Matriz[Filas,3]
	Sumatoria=0
	Para i=0 Hasta Filas-1 Con Paso 1 Hacer
		Escribir "Ingrese un valor para la primer columna:"
		Leer Matriz[i,0]
		Escribir "Ingrese un valor para la segunda columna:"
		Leer Matriz[i,1]
		Matriz[i,2] = Matriz[i,0]+Matriz[i,1]
	FinPara
	Para i=0 Hasta Filas-1 Con Paso 1 Hacer
		Escribir Matriz[i,0], " + ", Matriz[i,1], " = ", Matriz[i,2]
	FinPara
FinAlgoritmo