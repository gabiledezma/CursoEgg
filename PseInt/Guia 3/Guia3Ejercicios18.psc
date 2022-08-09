Algoritmo Guia3Ejercicios18
	//18. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el 
	//numero es capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. 
	//No podemos transformar el numero a cadena para realizar el ejercicio
	Definir num Como Entero
	Escribir "Ingrese un número:"
	Leer num
	Si esCapicua(num) Entonces
		Escribir "El numero es capicua"
	SiNo
		Escribir "El numero no es capicua"
	FinSi
FinAlgoritmo
Funcion esCapi <- esCapicua(num)
	Definir esCapi Como Logico
	Definir i, numAux, Contador Como Entero
	Definir divisor Como Real
	esCapi = Verdadero
	divisor = 1
	numAux = num
	Mientras (Trunc(numAux/10) > 0) Hacer
		numAux = Trunc(numAux/10)
		divisor = divisor*10
	FinMientras
	Contador=0
	Hacer
		Si Trunc(num/divisor) = num MOD 10 Entonces
			Contador=Contador+1
			Escribir "Los extremos ", Contador, " son iguales."
			divisor = divisor/10
			num = Trunc(num/10)
			num = num MOD divisor
		SiNo
			esCapi = Falso
		FinSi
		divisor = divisor/10
	Mientras Que esCapi = Verdadero Y Trunc(num/10) > 0 
FinFuncion
