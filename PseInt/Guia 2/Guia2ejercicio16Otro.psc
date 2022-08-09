Algoritmo Guia2ejercicio16Otro
	
	//16. Dada una secuencia de números ingresados por teclado que finaliza con un ?1, por 
	//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,??,-1; realizar un programa que calcule el promedio de los 
	//números ingresados. Suponemos que el usuario no insertará número negativos.
	
	
	Definir Num, Suma, Contador Como Entero
	Definir Prom Como Real
	Definir Log Como Logico
	
	Log=Verdadero
	
	Contador=0
	
	Suma=0
	
	
	
	
	
	Mientras Log=Verdadero Hacer
		
		Escribir "Ingrese un número: "
		Leer Num
		Si (Num=-1)Entonces
			
			Log=falso
		SiNo
			Contador=Contador+1
			suma=suma+num
			
			
		FinSi
	Fin Mientras
	
	
	
	Prom=Suma/Contador
	
	Escribir "La suma de los ", Contador, " números ingresados es de ", Suma, " con un promedio de ", Prom
	
	
FinAlgoritmo
