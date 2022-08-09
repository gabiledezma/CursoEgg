Algoritmo Guia3Ejercicios20
	//20. Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta 
	//entre las letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a 
	//través del Código Ascii, lo que nos deja usar operadores relacionales con letras y 
	//cadenas.
	Definir Letra, LetraMay Como Caracter
	Escribir "Ingrese una letra:"
	Leer Letra
	LetraMay=Mayusculas(Letra)
	Corresponde(LetraMay)
FinAlgoritmo
SubProceso Corresponde(LetraMay)
	Definir i, Contador Como Entero
	Definir Letras Como Texto
	Dimension Letras[9]
	Letras[0] = "M"
	Letras[1] = "N"
	Letras[2] = "Ñ"
	Letras[3] = "O"
	Letras[4] = "P"
	Letras[5] = "Q"
	Letras[6] = "R"
	Letras[7] = "S"
	Letras[8] = "T"
	Contador=0
	Para i=0 Hasta 8 Con Paso 1 Hacer
		Si Letras[i]==LetraMay Entonces
			Contador=Contador+1
		FinSi
	FinPara
	Si Contador==1 Entonces
		Escribir "La letra ingresada está entre M y T."
	SiNo
		Escribir "La letra NO ingresada está entre M y T."
	FinSi
FinSubProceso
	