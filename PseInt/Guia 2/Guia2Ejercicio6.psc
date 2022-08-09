Algoritmo Guia2Ejercicio6
	
	//6. Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
	//usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje
	//por pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir
	//"INCORRECTO". Nota: investigar la función Longitud() de Pseint. 
	
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase o palabra de 6 caracteres."
	Leer frase
	
	Si Longitud(frase)==6 Entonces
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
