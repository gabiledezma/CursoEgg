Algoritmo Guia2EjerciciosExtra5
	
	//5. Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por 
	//pantalla un mensaje que indique a qué día de la semana corresponde. Considere que el 
	//número 1 corresponde al día "Lunes", y así sucesivamente.
	
	Definir Dia Como Entero
		
	Escribir "Ingrese un número del 1 al 7: "
	Leer Dia
	
	Segun Dia Hacer
		1:
			Escribir "Día Lunes."
		2:
			Escribir "Día Martes."
		3:
			Escribir "Día Miércoles."
		4:
			Escribir "Día Jueves."
		5:
			Escribir "Día Viernes."
		6:
			Escribir "Día Sábado."
		7:
			Escribir "Día Domingo."
		De Otro Modo:
			Escribir "No es válido el número ingresado."
	Fin Segun
	
	
FinAlgoritmo
