Algoritmo Guia4Ejercicio13
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
	Repetir
		Escribir "Ingrese el Tamanio de la Matriz:"
		Leer TamanioMatriz
	Hasta Que TamanioMatriz<10 Y TamanioMatriz>=1
	Dimension Matriz[TamanioMatriz,TamanioMatriz]
	LlenarMatriz(Matriz,TamanioMatriz)
	MostrarMatriz(Matriz,TamanioMatriz)
	Si ControlDeElementos(Matriz,TamanioMatriz)==Verdadero Entonces
		Escribir "Se ingresaron correctamente los números en la matriz."
		Si EsMagica(Matriz, TamanioMatriz) == Verdadero Entonces
			Escribir "La matriz es mágica"
		SiNo
			Escribir "La matriz NO es mágica"
		FinSi
	SiNo
		Escribir "NO Se ingresaron correctamente los números en la matriz, los valores deben encontrarse entre 1 y 9. Por lo tanto, no puede ser mágica."
	FinSi
FinAlgoritmo
SubProceso LlenarMatriz(Matriz,TamanioMatriz) //Se le da valores a cada elemento dentro de la matriz
	Definir i, j, NumIngresado Como Entero
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Para j=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
			Escribir "Ingrese el número que ocupara el espacio: ", i, ", ", j
			Leer NumIngresado
			Matriz[i,j]=NumIngresado
		Fin Para
	Fin Para
FinSubProceso
Funcion Resultado<-ControlDeElementos(Matriz,TamanioMatriz) //Corrobora que cada elemento ingresado este entre 1 y 9
	Definir Resultado Como Logico 
	Definir i, j, Contador Como Entero
	Contador=0
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Para j=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
			Si Matriz[i,j] >=1 Y Matriz[i,j]<=9 Entonces
				Contador=Contador+1
			FinSi
		Fin Para
	Fin Para
	Si Contador==(TamanioMatriz*TamanioMatriz) Entonces
		Resultado=Verdadero
	SiNo
		Resultado=Falso
	FinSi
FinFuncion
Funcion Magico<- EsMagica(Matriz, TamanioMatriz)
	Definir i, j, SumatoriaIjcero, SumatoriaJicero, SumatoriaIceroJn, SumatoriaJceroIn, SumatoriaDiagonales, SumatoriaDiagonales2 Como Entero
	Definir Magico Como Logico
	SumatoriaIjcero=0
	SumatoriaJicero=0
	SumatoriaIceroJn=0
	SumatoriaJceroIn=0
	SumatoriaDiagonales=0
	SumatoriaDiagonales2=0
	Para i=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
		Para j=0 Hasta TamanioMatriz-1 Con Paso 1 Hacer
			Si j==0 Entonces
				SumatoriaIjcero=SumatoriaIjcero+Matriz[i,j] // sumatoria fila 0
			FinSi
			Si i==0 Entonces
				SumatoriaJicero=SumatoriaJicero+Matriz[i,j] // sumatoria columna 0
			FinSi
			Si j==TamanioMatriz-1 Entonces
				SumatoriaIceroJn=SumatoriaIceroJn+Matriz[i,j] // sumatoria ultima fila
			FinSi
			Si i==TamanioMatriz-1 Entonces
				SumatoriaJceroIn=SumatoriaJceroIn+Matriz[i,j] // sumatoria ultima columna
			FinSi
			Si i==j Entonces
				SumatoriaDiagonales=SumatoriaDiagonales+Matriz[i,j] // sumatoria diagonal izq-der
			FinSi
			Si j==(TamanioMatriz-1)-i Entonces
				SumatoriaDiagonales2=SumatoriaDiagonales2+Matriz[i,j] // sumatoria diagonal der-izq
			FinSi
		FinPara
	Fin Para
	Si (SumatoriaIjcero==SumatoriaIceroJn) Y (SumatoriaJicero==SumatoriaJceroIn) Y (SumatoriaDiagonales==SumatoriaDiagonales2) Y (SumatoriaIjcero==SumatoriaJicero) Y (SumatoriaIjcero==SumatoriaDiagonales) Entonces
		Magico=Verdadero
	SiNo
		Magico=Falso
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
	