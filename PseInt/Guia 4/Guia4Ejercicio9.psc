Algoritmo Guia4Ejercicio9
	//9. Escribir un programa que realice la búsqueda lineal de un número entero ingresado por 
	//el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las 
	//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. 
	//En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	Definir Matriz, i, j, ValorMin, ValorMax, Buscado, Contador Como Entero
	Dimension Matriz[5,5]
	ValorMin=1
	ValorMax=5
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Matriz[i,j]=Aleatorio(ValorMin,ValorMax)
		Fin Para
	Fin Para
	Escribir "Ingrese el número a buscar: "
	Leer Buscado
	Contador=0
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Si Matriz[i,j]==Buscado Entonces
				Escribir "El número buscado se encuentra en las coordenadas: ", i, ", ", j
			SiNo 
				Contador=Contador+1
			FinSi
		Fin Para
	Fin Para
	Si Contador==25 Entonces
		Escribir "El número buscado no se encuentra entre los elementos guardados."
	FinSi
FinAlgoritmo
