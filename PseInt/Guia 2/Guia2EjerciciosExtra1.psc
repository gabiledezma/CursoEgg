Algoritmo Guia2EjerciciosExtra1
	
	//1. Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba 
	//un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor 
	//o igual a 70; y reprueba en caso contrario. 
	
	Definir Nota1, Nota2, Nota3 Como Entero
	Definir Prom Como Real
	
	Escribir "Ingrese las 3 Notas: "
	Leer Nota1, Nota2, Nota3
	
	Si (Nota1>0 y Nota1<=100) y (Nota2>0 y Nota2<=100) y (Nota3>0 y Nota3<=100) Entonces
		Prom=(Nota1+Nota2+Nota3)/3
		Escribir "El promedio es: ", Prom
		Si Prom>=70 Entonces
			Escribir "Aprobó el curso."
		SiNo
			Escribir "Reprobó el curso." 
		FinSi
	SiNo
		Escribir "Alguna nota NO fue ingresada correctamente. "
	FinSi
	

	
FinAlgoritmo
