Algoritmo Guia2ejercicio20
	
	//20. Realizar un programa que pida una frase y el programa deber� mostrar la frase con un 
	//espacio entre cada letra. La frase se mostrar� as�: H o l a. Nota: recordar el 
	//funcionamiento de la funci�n Subcadena().
	///NOTA:. En PSeInt, si queremos escribir sin que haya saltos de l�nea, al final de la 
	///operaci�n "escribir" escribimos "sin saltar". 
		//Por ejemplo:
			///Escribir sin saltar "Hola, "
			///Escribir sin saltar "c�mo est�s?"
			///Imprimir� por pantalla: Hola, c�mo est�s?
	
	
	Definir frase Como Caracter
	Definir Larg, i Como Entero
	
	Escribir "Ingrese una frase o palabra:"
	Leer frase
	
	Larg=Longitud (frase)
	
	Para i=0 Hasta Larg Con Paso 1 Hacer
		Escribir Sin Saltar Subcadena(frase,i,i), " "
	FinPara
	
FinAlgoritmo
