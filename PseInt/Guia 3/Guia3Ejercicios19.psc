Algoritmo Guia3Ejercicios19
	
	//19. El n�mero de combinaciones de m elementos tomados de n es:
	//(m/n)=(m!/n!(m-n)!)
	//Dise�ar una funci�n que permita calcular el n�mero combinatorio de (m/n)
	///Nota: n debe ser mayor a 0 y menor que m
	
	Definir Num, Num2, Respuesta Como Entero
	Escribir "Ingrese un n�mero:"
	Leer Num
	Escribir "Ingrese otro n�mero:"
	Leer Num2
	Respuesta=combinaciones(Num,Num2)
	
FinAlgoritmo
Funcion Resultado <- combinaciones(Num,Num2)
	
FinFuncion
	