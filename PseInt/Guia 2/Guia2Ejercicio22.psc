Algoritmo Guia2ejercicio22
	
	//22. Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree 
	//un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del 
	//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
		//* * * * 
		//*	    * 
		//*     * 
		//* * * *
	///Nota: Recordar el uso del escribir sin saltar en Pseint.
	
	Definir i, j, n Como Entero
	
	Escribir "Ingrese el tama�o del cuadrado."
	Leer n
	
	Para i=1 Hasta n Con Paso 1 Hacer
		Para j=1 Hasta n Con Paso 1 Hacer
			si ((i=n o i=1) o (j=1 o j=n)) 
				Escribir Sin Saltar "* "
			SiNo
				Escribir Sin Saltar "  "
			FinSi
		Fin Para
		Escribir ""
	Fin Para
	
FinAlgoritmo
