Algoritmo Guia2ejercicio14
	
	//14. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la 
	//nota se pedirá de nuevo hasta que la nota sea correcta.
	
	Definir Nota1 Como Entero
	
	Escribir "Ingrese la nota correspondiente: "
	Leer Nota1
	
	Mientras Nota1<0 o Nota1>10 Hacer
		Escribir "Ingrese la nota correspondiente: "
		Leer Nota1
	Fin Mientras
	
	Escribir "Se ingreso correctamente la nota: ", Nota1 
	
FinAlgoritmo
