Algoritmo Guia3Ejercicios2
	
	//2. Realizar una funci�n que valide si un numero es impar o no. Si es impar la funci�n debe 
	//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe 
	//tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo
	
	Definir Num Como Entero
	
	Escribir "Ingrese un N�mero"
	Leer Num
	
	Si ParONo(Num)==Verdadero Entonces
		Escribir "El n�mero es impar."
	SiNo
		Escribir "El n�mero NO es impar."
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
