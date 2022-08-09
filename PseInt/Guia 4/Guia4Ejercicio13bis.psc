Algoritmo Guia4Ejercicio13bis
	//13. Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) 
	//que tiene como propiedad especial que la suma de las filas, las columnas y las 
	//diagonales es igual. Por ejemplo: 
	//	2 7 6 
	//	9 5 1 
	//	4 3 8 
	//En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir 
	//un algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso 
	//de que sea mágica escribir la suma. Además, el programa deberá comprobar que los 
	//números introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el 
	//tamaño de la matriz que no debe superar orden igual a 10.
	Definir Matriz, TamanioMatriz Como Entero
	Definir Filas, Columnas, Diagonales Como Entero
	Repetir
		Escribir "Ingrese el Tamanio de la Matriz:"
		Leer TamanioMatriz
	Mientras Que TamanioMatriz>10 O TamanioMatriz<1
	Dimension Matriz[TamanioMatriz,TamanioMatriz]
	LlenarMatriz(Matriz,TamanioMatriz)
	Filas=SumarFilas(Matriz,TamanioMatriz)
	Columnas=SumarColumnas(Matriz,TamanioMatriz)
	Diagonales=SumarDiagonales(Matriz,TamanioMatriz)
	Si Filas==Columnas Y Filas == Diagonales Entonces
		Escribir "Es una matriz mágica."
	SiNo
		Escribir "NO es una matriz mágica."
	FinSi
	MostrarMatriz(Matriz,TamanioMatriz)
FinAlgoritmo
SubProceso LlenarMatriz(Matriz,TamanioMatriz) //Se le da valores a cada elemento dentro de la matriz
	Definir i, j, NumIngresado Como Entero
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Para j=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
			Repetir
				Escribir "Ingrese el número que ocupara el espacio: ", i, ", ", j
				Leer NumIngresado
				Si (NumIngresado<1 o NumIngresado>9) Entonces
					Escribir "No es posible ingresar un número con este valor."
				FinSi
			Mientras Que (NumIngresado<1 o NumIngresado>9)
			Matriz[i,j]=NumIngresado
		Fin Para
	Fin Para
FinSubProceso
Funcion Sumatoria<-SumarFilas(Matriz,TamanioMatriz)
	Definir Sumatoria Como Entero
	Definir i, j, Suma, Aux, Contador Como Entero
	Aux=0
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Aux=Aux+Matriz[0,i]
	Fin Para
	Suma=0
	Contador=0
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Para j=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
			Suma=Suma+Matriz[i,j]
		Fin Para
		Si (Aux==Suma) Entonces
			Contador=Contador+1
		FinSi
		Suma=0
	Fin Para
	Si Contador==TamanioMatriz Entonces
		Sumatoria=Aux
	SiNo
		Sumatoria=-1
	FinSi
FinFuncion
Funcion Sumatoria<-SumarColumnas(Matriz,TamanioMatriz)
	Definir Sumatoria Como Entero
	Definir i, j, Suma, Aux, Contador Como Entero
	Aux=0
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Aux=Aux+Matriz[i,0]
	Fin Para
	Suma=0
	Contador=0
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Para j=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
			Suma=Suma+Matriz[j,i]
		Fin Para
		Si (Aux==Suma) Entonces
			Contador=Contador+1
		FinSi
		Suma=0
	Fin Para
	Si Contador==TamanioMatriz Entonces
		Sumatoria=Aux
	SiNo
		Sumatoria=-2
	FinSi
FinFuncion
Funcion Sumatoria<- SumarDiagonales(Matriz, TamanioMatriz)
	Definir i, j, SumatoriaDiagonales, SumatoriaDiagonales2 Como Entero
	Definir Sumatoria Como Entero
	SumatoriaDiagonales=0
	SumatoriaDiagonales2=0
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Para j=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
			Si i==j Entonces
				SumatoriaDiagonales=SumatoriaDiagonales+Matriz[i,j] // sumatoria diagonal izq-der
			FinSi
			Si (i+j)==(TamanioMatriz-1) Entonces
				SumatoriaDiagonales2=SumatoriaDiagonales2+Matriz[i,j] // sumatoria diagonal der-izq
			FinSi
		FinPara
	Fin Para
	Si SumatoriaDiagonales==SumatoriaDiagonales2 Entonces
		Sumatoria=SumatoriaDiagonales
	SiNo
		Sumatoria=0
	FinSi
FinFuncion
SubProceso MostrarMatriz(Matriz,TamanioMatriz)
	Definir i, j  Como Entero
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Para j=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j], " "
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso
	