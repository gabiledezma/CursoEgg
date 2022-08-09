Algoritmo Guia3Ejercicios16
	
	//16. Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el 
	//n�mero tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener 
	//que separar el numero en partes (si es un numero de m�s de un digito) y ver si cada 
	//numero es par o impar. Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos 
	//pasar el numero a cadena para realizar el ejercicio.
	
	Definir Num Como Entero
	Escribir "Ingrese un n�mero:"
	Leer Num
	Si NumerosImpares(Num)==Verdadero Entonces
		Escribir "El numero ingresado tiene todos sus d�gitos impares"
	SiNo
		Escribir "El numero ingresado NO tiene todos sus d�gitos impares"
	FinSi
FinAlgoritmo
Funcion Resultado<-NumerosImpares(Num)
	Definir Resultado Como Logico
	Definir Aux, ParImpar Como Entero
	Si Num MOD 2 == 0 
		Resultado=Falso
	SiNo
		Si Num>10 Entonces
			Repetir
				Num= Trunc(Num/10)
				ParImpar= Num MOD 2
				Si ParImpar==0
					Resultado=Falso
				SiNo
					Resultado=Verdadero
				FinSi
			Hasta Que Num<10 o Resultado==Falso
		SiNo
			Resultado=Verdadero
		FinSi
	FinSi
FinFuncion