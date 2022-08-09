Algoritmo Guia4EjercicioExtra4
	//4. Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 
	//0 y 20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de 
	//PseInt. Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos 
	//estudiantes son:
	//	a) Deficientes 0-5
	//	b) Regulares 6-10
	//	c) Buenos 11-15
	//	d) Excelentes 16-20
	Definir Vector, i, Deficientes, Regulares, Buenos, Excelentes Como Entero
	Dimension Vector[100]
	Para i=0 Hasta 99 Con Paso 1 Hacer
		Vector[i]=Azar(20)
	FinPara
	Deficientes=0
	Regulares=0
	Buenos=0
	Excelentes=0
	Para i=0 Hasta 99 Con Paso 1 Hacer
		Si Vector[i]>=0 Y Vector[i]<=5 Entonces
			Deficientes=Deficientes+1
		SiNo
			Si Vector[i]>=6 Y Vector[i]<=10 Entonces
				Regulares=Regulares+1
			SiNo
				Si Vector[i]>=11 Y Vector[i]<=15 Entonces
					Buenos=Buenos+1
				SiNo
					Si Vector[i]>=16 Y Vector[i]<=20 Entonces
					Excelentes=Excelentes+1
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "La cantidad de alumnos deficientes es: ", Deficientes
	Escribir "La cantidad de alumnos regulares es: ", Regulares
	Escribir "La cantidad de alumnos buenos es: ", Buenos
	Escribir "La cantidad de alumnos excelentes es: ", Excelentes
FinAlgoritmo