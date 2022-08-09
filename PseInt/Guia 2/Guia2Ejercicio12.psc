Algoritmo Guia2Ejercicio12
	//Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
	//En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
	//Nota: investigar la función mod de PSeInt
	
	Definir ent Como Entero
	
	Escribir "Ingrese un número entero:"
	Leer ent
	
	Si ent == 0 Entonces
		Escribir "No es par ni impar. "
	Sino
		Si (ent MOD 2) == 0 Entonces 
			Escribir "Es par."
		Sino
			Escribir "Es impar. "
		Fin Si
	Fin Si
FinAlgoritmo
