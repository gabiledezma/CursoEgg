Algoritmo Guia3Ejercicios3
	
	//3. Crea una función EsMultiplo que reciba los dos números pasados por el usuario,
	//validando que el primer numero múltiplo del segundo y devuelva verdadero si el primer 
	//numero es múltiplo del segundo, sino es múltiplo que devuelva falso.
	
	Definir Num1, Num2 Como Entero
	
	Escribir "Ingrese un número: "
	Leer Num1
	
	Escribir "Ingrese otro número: "
	Leer Num2
	
	Si EsMultiplo(Num1,Num2)==Verdadero Entonces
		Escribir "El  primer número es Múltiplo del segundo."
	SiNo
		Escribir "El  primer número NO es Múltiplo del segundo."
	FinSi
	
FinAlgoritmo

Funcion Resultado <- EsMultiplo (a,b)
	Definir Resultado Como Logico
	Si (a MOD b) == 0
		Resultado=Verdadero
	SiNo
		Resultado=Falso
	FinSi
FinFuncion
	