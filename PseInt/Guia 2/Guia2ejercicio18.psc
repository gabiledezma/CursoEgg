Algoritmo Guia2ejercicio18
	
	//18. Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el 
	//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de 
	//todos ellos.
	
	Definir Num, Num2, NumMax, NumMin, Vueltas Como Entero // Num suma de n�meros
	Definir Prom Como Real
	
	Escribir "Ingrese un n�mero: "
	Leer Num
	
	Vueltas=0
	
	NumMax=Num
	
	NumMin=Num
	
	
	Hacer // o Repetir
		
		Escribir "Ingrese otro n�mero: "
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
	
	Escribir "La suma de los ", Vueltas, " n�meros ingresados es de ", Num, " con un promedio de ", Prom
	
	Escribir "Numero Maximo: ", NumMax
	Escribir "Numero Minimo: ", NumMin
	
FinAlgoritmo
