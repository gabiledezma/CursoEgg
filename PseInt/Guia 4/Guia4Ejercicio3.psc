Algoritmo Guia4Ejercicio3
	//3. Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el 
	//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a 
	//buscar también debe ser ingresado por el usuario). El programa debe indicar la posición 
	//donde se encuentra el valor. En caso que el número se encuentre repetido dentro del 
	//arreglo se deben imprimir todas las posiciones donde se encuentra ese valor. 
	//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar 
	//un mensaje.
	Definir Vector, TamanioN, i, Buscado, Contador Como Entero
	Escribir "Ingrese el Tamaño del Vector: "
	Leer TamanioN
	Dimension Vector[TamanioN]
	Para i=0 Hasta TamanioN-1 Con Paso 1 Hacer
		Escribir "Ingrese los valores del subindice ", i
		Leer Vector[i]
	FinPara
	Escribir "Ingrese el número a buscar: "
	Leer Buscado
	Contador=0
	Para i=0 Hasta TamanioN-1 Con Paso 1 Hacer
		Si Vector[i]==Buscado Entonces
			Escribir "La posicion del Numero buscado es subindice: " i
		SiNo
			Contador=Contador+1
			Si Contador==TamanioN Entonces
				Escribir "No se encuentra dentro del arreglo"
			FinSi
		FinSi
	FinPara
FinAlgoritmo
