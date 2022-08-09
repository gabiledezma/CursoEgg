Algoritmo Guia4Ejercicio11
	//11. Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la 
	//diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe 
	//generar otro subproceso para imprimir la matriz.
	CompletarConCeros()
FinAlgoritmo
SubProceso CompletarConCeros()
	Definir Matriz, M, N, i, j, ValorMin, ValorMax, TamanioMatriz Como Entero
	ValorMin=1
	ValorMax=5
	TamanioMatriz=Aleatorio(ValorMin,ValorMax)
	M=TamanioMatriz
	N=TamanioMatriz
	Dimension Matriz[M,N]
	Para i=0 Hasta M-1 Con Paso 1 Hacer
		Para j=0 Hasta N-1 Con Paso 1 Hacer
			Si i==j Entonces
				Matriz[i,j]=0
			SiNo
				Matriz[i,j]=Aleatorio(ValorMin,ValorMax)
			FinSi
		Fin Para
	Fin Para
	MuestraDeElementos(Matriz,M,N)
FinSubProceso 
SubProceso MuestraDeElementos(Matriz,M,N)
	Definir i, j Como Entero
	Para i=0 Hasta M-1 Con Paso 1 Hacer
		Para j=0 Hasta N-1 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j]
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso
	