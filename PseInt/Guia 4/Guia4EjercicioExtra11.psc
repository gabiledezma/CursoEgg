Algoritmo Guia4EjercicioExtra11
	//11. Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), 
	//llenarla con números aleatorios entre 1 y 100 y mostrar su traspuesta. NOTA: si no 
	//conoces lo que es una traspuesta, mirar el siguiente link: Matriz Traspuesta
	Definir Matriz, n , m, i, j Como Entero
	Escribir "Ingrese la cantidad de filas de la matriz: "
	Leer n
	Escribir "Ingrese la cantidad de columnas de la matriz: "
	Leer m
	Dimension Matriz[n,m]
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			Matriz[i,j]=Aleatorio(1,100)
		Fin Para
	Fin Para
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j], " "
		Fin Para
		Escribir ""
	Fin Para
	Para i=0 Hasta m-1 Con Paso 1 Hacer
		Para j=0 Hasta n-1 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[j,i], " "
		Fin Para
		Escribir ""
	Fin Para
FinAlgoritmo
