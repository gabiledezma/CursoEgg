Algoritmo Guia2ejercicio15
	
	//15. Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n 
	//solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el 
	//l�mite inicial
	
	Definir LimPos Como Entero
	Definir Num, Num2 Como Entero
	
	Escribir "Ingrese un N�mero para que sea el Valor M�ximo: "
	Leer LimPos
	
	Escribir "Ingrese un n�mero:"
	Leer Num
	
	Mientras LimPos>Num Hacer
		
		Escribir "Ingrese otro n�mero: "
		Leer Num2
		Num=Num+Num2
		
	Fin Mientras
	
	Escribir "Ha superado el l�mite previamente impuesto, Felicitaciones."
	
FinAlgoritmo
