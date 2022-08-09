Algoritmo Guia2ejercicio18
	
	//18. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el 
	//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de 
	//todos ellos.
	
	Definir Num, Num2, NumMax, NumMin, Vueltas Como Entero // Num suma de números
	Definir Prom Como Real
	
	Escribir "Ingrese un número: "
	Leer Num
	
	Vueltas=0
	
	NumMax=Num
	
	NumMin=Num
	
	
	Hacer // o Repetir
		
		Escribir "Ingrese otro número: "
		Leer Num2
		
		Vueltas=Vueltas+1
		
		Num= Num+Num2
		
		Si Num2<>0 Entonces
			
			Si Num2 > NumMax Entonces
				NumMax = Num2
				
				Si Num2 < NumMin  Entonces
					NumMin = Num2
				FinSi
				
			FinSi
			
		FinSi
		
	Mientras Que Num2<>0
	
	Prom=Num/Vueltas
	
	Escribir "La suma de los ", Vueltas, " números ingresados es de ", Num, " con un promedio de ", Prom
	
	Escribir "Numero Maximo: ", NumMax
	Escribir "Numero Minimo: ", NumMin
	
FinAlgoritmo
