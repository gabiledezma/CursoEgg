Algoritmo Guia3Ejercicios2
	
	//2. Realizar una función que valide si un numero es impar o no. Si es impar la función debe 
	//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe 
	//tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo
	
	Definir Num Como Entero
	
	Escribir "Ingrese un Número"
	Leer Num
	
	Si ParONo(Num)==Verdadero Entonces
		Escribir "El número es impar."
	SiNo
		Escribir "El número NO es impar."
	FinSi
	
FinAlgoritmo

Funcion Log <- ParONo (a)
	Definir Log Como Logico
	
	Si (a==0) Entonces
		Log=Falso
	SiNo
		Si (a MOD 2) == 0
			Log=Falso
		SiNo
			Log=Verdadero
		FinSi
	FinSi
	
FinFuncion
