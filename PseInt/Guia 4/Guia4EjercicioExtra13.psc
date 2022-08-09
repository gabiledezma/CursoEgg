Algoritmo Guia4EjercicioExtra13
	//13. Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. 
	//Inicialice las matrices para evitar el ingreso de datos por teclado.
	Definir Matriz1, Matriz2, i, j, Sumatoria Como Entero
	Dimension Matriz1[3,3], Matriz2[3,3]
	Sumatoria=0
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Matriz1[i,j]=Aleatorio(1,5)
			Matriz2[i,j]=Aleatorio(1,5)
			Sumatoria=Sumatoria+Matriz1[i,j]+Matriz2[i,j]
		Fin Para
	FinPara
	Escribir "La sumatoria total de los elementos de ambas matrices es: ", Sumatoria
FinAlgoritmo
