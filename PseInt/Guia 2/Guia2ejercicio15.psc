Algoritmo Guia2ejercicio15
	
	//15. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
	//solicite números al usuario hasta que la suma de los números introducidos supere el 
	//límite inicial
	
	Definir LimPos Como Entero
	Definir Num, Num2 Como Entero
	
	Escribir "Ingrese un Número para que sea el Valor Máximo: "
	Leer LimPos
	
	Escribir "Ingrese un número:"
	Leer Num
	
	Mientras LimPos>Num Hacer
		
		Escribir "Ingrese otro número: "
		Leer Num2
		Num=Num+Num2
		
	Fin Mientras
	
	Escribir "Ha superado el límite previamente impuesto, Felicitaciones."
	
FinAlgoritmo
