Algoritmo Guia4Ejercicio2
	//2. Realizar un programa que lea 10 n�meros reales por teclado, los almacene en un arreglo 
	//y muestre por pantalla la suma, resta y multiplicaci�n de todos los n�meros ingresados
	//al arreglo.
	Vectores()
FinAlgoritmo
SubProceso Vectores()
	Definir vector, i, Suma, Resta, Multiplicacion Como Entero
	Dimension Vector[10]
	Suma=0
	Multiplicacion=1
	Resta=0
	Escribir "Ingrese los n�meros: "
	Para i=0 Hasta 9 Con Paso 1 Hacer
		Leer Vector[i]
		Suma=Suma+vector[i]
		Multiplicacion=Multiplicacion*Vector[i]
		Resta=Resta-Vector[i]
	Fin Para
	
	Escribir "La suma de los vectores es: ", Suma, ", La resta de los vectores es: ", Resta, " y la multiplicaci�n de los vectores es: ", Multiplicacion
	
FinSubProceso
