Algoritmo Guia3Ejercicios10
	
	//10. Escribir una función recursiva que devuelva la suma de los primeros N enteros
	
	Definir Num Como Entero
	Escribir "Ingrese un número: "
	Leer Num
	Escribir "La suma de los primeros ", Num, " números es igual a: " Sumatoria(Num)
FinAlgoritmo

Funcion Suma <- Sumatoria(Num)
	Definir Suma Como Entero
	Si Num = 1 Entonces
		Suma = Num
	SiNo
		Suma = Num + Sumatoria (Num - 1)
	FinSi
FinFuncion
	
	