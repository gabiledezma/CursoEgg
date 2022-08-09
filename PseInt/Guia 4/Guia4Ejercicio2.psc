Algoritmo Guia4Ejercicio2
	//2. Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo 
	//y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
	//al arreglo.
	Vectores()
FinAlgoritmo
SubProceso Vectores()
	Definir vector, i, Suma, Resta, Multiplicacion Como Entero
	Dimension Vector[10]
	Suma=0
	Multiplicacion=1
	Resta=0
	Escribir "Ingrese los números: "
	Para i=0 Hasta 9 Con Paso 1 Hacer
		Leer Vector[i]
		Suma=Suma+vector[i]
		Multiplicacion=Multiplicacion*Vector[i]
		Resta=Resta-Vector[i]
	Fin Para
	
	Escribir "La suma de los vectores es: ", Suma, ", La resta de los vectores es: ", Resta, " y la multiplicación de los vectores es: ", Multiplicacion
	
FinSubProceso
