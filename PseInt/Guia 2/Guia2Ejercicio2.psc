Algoritmo Guia2Ejercicio2
	
	//2. Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá
	//al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
	//mostrar un mensaje por pantalla indicándolo.
	
	Definir sueldo, sueldomin Como Entero
	
	Escribir "Ingresar su Sueldo actual:"
	Leer sueldo
	
	Escribir "Indicar el sueldo mínimo: "
	Leer sueldomin
	
	si (sueldo > sueldomin) Entonces
		Escribir "Su sueldo es mayor al sueldo mínimo ", sueldo
	FinSi
	
	
FinAlgoritmo
