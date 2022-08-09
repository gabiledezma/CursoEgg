Algoritmo Guia2Ejercicio4
	
	//4. Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. Si el usuario
	//ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
	//que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO". 
	
	Definir Opc Como Caracter
	
	Escribir "Escriba S para Verdadero; o N para Falso:"
	Leer Opc
	
	Si Opc == "S" o Opc == "s" Entonces
				Escribir "Correcto"
			SiNo
				Si Opc =="N" o Opc == "n"
					Escribir "Incorrecto"
				SiNo
					Escribir "Error, NO escribió ni S ni N"
				FinSi
				
				
	FinSi
	
FinAlgoritmo
