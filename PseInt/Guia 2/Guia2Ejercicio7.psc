Algoritmo Guia2Ejercicio7
	
	//7. Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
	//caracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
	//es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
	//programa mostrar� despu�s la frase final. Nota: investigar la funci�n Longitud() y
	//Concatenar() de Pseint.
	
	Definir frase, Exc, Int Como Caracter
	
	Escribir "Ingrese una frase o palabra de 6 caracteres."
	Leer frase
	
	Exc="!"
	
	Int="?"
	
	Si Longitud(frase)==4 Entonces
		Escribir Concatenar(frase,Exc)
	SiNo
		Escribir Concatenar(frase,Int)
	FinSi
	
FinAlgoritmo
