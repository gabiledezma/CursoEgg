Algoritmo Guia2Ejercicio9
	
	//9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
	//es una ?A?. Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla 
	//que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". Nota: 
	//investigar la función Subcadena de Pseint. 
	
	Definir frase Como Caracter
	
	Escribir "Ingrese frase o palabra."
	Leer frase
	
	Si Subcadena(frase, 0, 0)=="A" o Subcadena(frase,0, 0)=="a" Entonces
		Escribir "CORRECTO."
		
	SiNo
		Escribir "INCORRECTO."
	FinSi
	
FinAlgoritmo
