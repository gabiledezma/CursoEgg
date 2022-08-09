Algoritmo Guia3Ejercicios8
	
	//8. Realizar un procedimiento que permita realizar la división entre dos números y muestre
	//el cociente y el resto utilizando el método de restas sucesivas.
	//El método de división por restas sucesivas consiste en restar el dividendo con el divisor 
	//hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el 
	//número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
		///50 - 13 = 37 una resta realizada
		///37 - 13 = 24 dos restas realizadas
		///24 - 13 = 11 tres restas realizadas
	//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
	
	Division()
	
FinAlgoritmo

SubProceso Division()
	
	Definir A, B, i, Contador Como Entero
	Definir Resultado Como Entero
	
	Escribir "Ingrese 2 números; "
	Leer A, B
	
	Contador=0
		
	Hacer 
		
		Resultado=A-B 
		
		Contador=Contador+1
		
		Escribir A, " - ", B, " = ", Resultado, " Con " Contador, " restas realizadas."
		
		A=Resultado
		
	Mientras que B<=A y Resultado>=0
		
FinSubProceso
	