Algoritmo Guia3Ejercicios19bis
	//19. Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y 
	//muestra una cadena con un espacio adicional tras cada letra. 
	//Por ejemplo, "Hola, t�" devolver� "H o l a , t � ". Crea un programa principal donde se 
	//use dicho procedimiento.
	Definir frase Como Caracter
	Escribir "Ingrese una frase o palabra:"
	Leer frase
	ConvertirEspaciado(frase)
FinAlgoritmo
SubProceso ConvertirEspaciado(frase)
	Definir Larg, i Como Entero
	Larg=Longitud (frase)
	Para i=0 Hasta Larg Con Paso 1 Hacer
		Si Subcadena(frase,i,i)<>" " Entonces
			Escribir Sin Saltar Subcadena(frase,i,i), " "
		SiNo
			Escribir Sin Saltar Subcadena(frase,i,i), ""
		FinSi
	FinPara
FinSubProceso
