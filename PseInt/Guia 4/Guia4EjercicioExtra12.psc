Algoritmo Guia4EjercicioExtra12
	//12. Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos 
	//y ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna 
	//de ceros.
	//Por ejemplo, nuestro matriz final debería verse así:
	///		111111111111111 
	///		100000000000001
	///		100000000000001
	///		100000000000001
	///		111111111111111 
	Definir Matriz Como Entero
	Dimension Matriz[5,15]
	LlenarMatriz(Matriz)
	MostrarMatriz(Matriz)
FinAlgoritmo
SubProceso LlenarMatriz(Matriz) //Se le da valores a cada elemento dentro de la matriz
	Definir i, j Como Entero
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 14 Con Paso 1 Hacer
			Si i==0 o i==4 Entonces
				Matriz[i,j]=1
			SiNo
				Si j==0 o j==14 Entonces
					Matriz[i,j]=1
				SiNo
					Matriz[i,j]=0
				FinSi
			FinSi
		Fin Para
	Fin Para
FinSubProceso
SubProceso MostrarMatriz(Matriz)
	Definir i, j  Como Entero
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 14 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j], " "
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso
	