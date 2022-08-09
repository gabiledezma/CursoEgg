Algoritmo Guia2ejercicio13
	
	//13. Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica 
	//de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un 
	//per�odo de prueba:
	
	/// Producir menos de 200 tornillos defectuosos.
	/// Producir m�s de 10000 tornillos sin defectos.
	/// El grado de eficiencia se determina de la siguiente manera:
		/// Si no cumple ninguna de las condiciones, grado 5.
		/// Si s�lo cumple la primera condici�n, grado 6.
		/// Si s�lo cumple la segunda condici�n, grado 7.
		/// Si cumple las dos condiciones, grado 8
	
	//Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el 
	//ejercicio. No hacer todos al mismo tiempo y despu�s probar.

	
	Definir TornBien, TornMal Como Entero
	Definir VarLog Como Caracter
	
	Escribir "Cantidad de Tornillos Defectuosos:"
	Leer TornMal
	Escribir "Cantidad de Tornillos SIN defectos:"
	Leer TornBien
	
	Si (TornMal>=200) y (TornBien<=10000) Entonces
		VarLog = "Grado 5."
	SiNo
		Si (TornMal<200) y (TornBien<=10000) Entonces
			Varlog = "Grado 6."
		SiNo
			Si (TornMal>=200) y (TornBien>10000) Entonces
				Varlog = "Grado 7."
			SiNo
				Varlog = "Grado 8."
			FinSi
		FinSi
	FinSi
	
	Escribir "El grado de eficiencia es: " Varlog
	
	
	
	
	
	
	
FinAlgoritmo
