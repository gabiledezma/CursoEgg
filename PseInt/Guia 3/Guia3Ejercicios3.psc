Algoritmo Guia3Ejercicios3
	
	//3. Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario,
	//validando que el primer numero m�ltiplo del segundo y devuelva verdadero si el primer 
	//numero es m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.
	
	Definir Num1, Num2 Como Entero
	
	Escribir "Ingrese un n�mero: "
	Leer Num1
	
	Escribir "Ingrese otro n�mero: "
	Leer Num2
	
	Si EsMultiplo(Num1,Num2)==Verdadero Entonces
		Escribir "El  primer n�mero es M�ltiplo del segundo."
	SiNo
		Escribir "El  primer n�mero NO es M�ltiplo del segundo."
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
	