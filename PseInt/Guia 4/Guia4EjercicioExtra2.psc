Algoritmo Guia4EjercicioExtra2
	//2. Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el 
	//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados. 
	Definir Vector, Tamanio, Sumatoria, i Como Entero
	Definir Promedio Como Real
	Escribir "Ingrese el tamaño del vector: "
	Leer Tamanio
	Dimension Vector[Tamanio]
	Sumatoria=0
	Escribir "Ingrese los valores deseados para cada elemento del vector"
	Para i=0 Hasta Tamanio-1 Con Paso 1 Hacer
		Leer Vector[i]
		Sumatoria=Sumatoria+Vector[i]
	FinPara
	Promedio=Sumatoria/Tamanio
	Escribir "El promedio de los valores ingresados dentro del vector es: ", Promedio
FinAlgoritmo
