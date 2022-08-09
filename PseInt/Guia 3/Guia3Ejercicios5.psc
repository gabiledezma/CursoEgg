Algoritmo Guia3Ejercicios5
	//5. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el 
	//numero es primo o no. Un número es primo cuando es divisible sólo por 1 y por sí 
	//mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD
	Definir Num1 Como Entero
	Escribir "Ingrese un número: "
	Leer Num1
	Si EsPrimo(Num1)==Verdadero Entonces
		Escribir "El número es Primo."
	SiNo
		Escribir "El número NO es Primo."
	FinSi
FinAlgoritmo
Funcion Resultado <- EsPrimo (a)
	Definir Resultado Como Logico
	Definir Contador, i Como Entero
	Contador=0
	Para i=1 Hasta a Con Paso 1 Hacer
		Si a MOD i == 0 Entonces
			Contador=Contador+1
		FinSi
	FinPara
	Si (Contador==2) Entonces
		Resultado=Verdadero
	SiNo
		Resultado=Falso
	FinSi
FinFuncion
	

