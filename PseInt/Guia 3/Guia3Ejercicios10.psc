Algoritmo Guia3Ejercicios10
	
	//10. Escribir una funci�n recursiva que devuelva la suma de los primeros N enteros
	
	Definir Num Como Entero
	Escribir "Ingrese un n�mero: "
	Leer Num
	Escribir "La suma de los primeros ", Num, " n�meros es igual a: " Sumatoria(Num)
FinAlgoritmo

Funcion Suma <- Sumatoria(Num)
	Definir Suma Como Entero
	Si Num = 1 Entonces
		Suma = Num
	SiNo
		Suma = Num + Sumatoria (Num - 1)
	FinSi
FinFuncion
	
	