Algoritmo Guia2Ejercicio10
	
	//10. Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la 
	//primera letra de la frase es igual a la ultima letra de la frase. Se deberá de imprimir un 
	//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir 
	//"INCORRECTO".
	
	Definir frase Como Caracter
	Definir Larg Como Entero // Longitud de la frase
	
	Escribir "Ingrese frase o palabra."
	Leer frase
	
	Larg = Longitud(frase)
	
	Si (Subcadena(frase, 0, 0)) == (Subcadena(frase, (Larg-1), Larg)) Entonces
		
		Escribir "CORRECTO."
	SiNo
	
		Escribir "INCORRECTO."
	FinSi
	
	
FinAlgoritmo
