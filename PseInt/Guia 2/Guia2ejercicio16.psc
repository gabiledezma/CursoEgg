Algoritmo Guia2ejercicio16
	
	//16. Dada una secuencia de números ingresados por teclado que finaliza con un ?1, por 
	//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,??,-1; realizar un programa que calcule el promedio de los 
	//números ingresados. Suponemos que el usuario no insertará número negativos.
	
	
	Definir Num, Vueltas Como Entero
	Definir Num2, Prom Como Real
	
	Escribir "Ingrese un número:"
	Leer Num
	
	Escribir "Ingrese otro número: "
	Leer Num2
	
	Num=Num+Num2
	
	Vueltas=1
	
	Mientras Num2<>-1 Hacer
		
		Escribir "Ingrese otro número: "
		Leer Num2
		
		Num=Num+Num2
		
		Vueltas=Vueltas+1
	Fin Mientras
	
	Num=Num+1
	
	Prom=Num/Vueltas
	
	Escribir "La suma de los ", Vueltas, " números ingresados es de ", Num, " con un promedio de ", Prom
	
	
FinAlgoritmo
