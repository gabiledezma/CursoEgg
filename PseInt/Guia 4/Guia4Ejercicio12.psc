Algoritmo Guia4Ejercicio12
	//12. Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
	//encontrando la manera de que la frase se muestre de manera continua en la matriz. 
	//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
		//	H A B 
		//	I L I 
		//	D A D 
	//Nota: recordar el uso de la función Subcadena().
	Definir Matriz, Frase como caracter
	Definir i, j Como Entero
	Dimension Matriz[3,3]
	Escribir "Ingrese frase o palabra de hasta 9 caracteres:"
	Leer Frase
	Frase=Mayusculas(Frase)
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Segun i Hacer
			0:
				Para j=0 Hasta 2 Con Paso 1 Hacer
					Matriz[i,j]=Subcadena(Frase,j,j)
				Fin Para
			1: 	
				Para j=0 Hasta 2 Con Paso 1 Hacer
					Matriz[i,j]=Subcadena(Frase,j+3,j+3)
				Fin Para
			2:
				Para j=0 Hasta 2 Con Paso 1 Hacer
					Matriz[i,j]=Subcadena(Frase,j+6,j+6)
				Fin Para
		FinSegun
	Fin Para
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j], " "
		Fin Para
		Escribir ""
	Fin Para
FinAlgoritmo

