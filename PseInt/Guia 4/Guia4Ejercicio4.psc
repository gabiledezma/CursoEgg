Algoritmo Guia4Ejercicio4
	//4. Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el 
	//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el 
	//valor más grande del vector.
	Definir vector , i, tamanio, mayor  Como Entero
	Escribir "ingrese el tamaño del vector: "
	Leer tamanio
	Dimension Vector[tamanio] 
	mayor=0
	Para i=0 Hasta tamanio-1 Hacer
		Escribir "ingrese el valor del vector: "
		Leer Vector[i]
		Si Vector[i] > mayor Entonces
			mayor=Vector[i]
		FinSi
	FinPara
	Escribir "el valor mas grande del vector es: ", mayor
FinAlgoritmo
