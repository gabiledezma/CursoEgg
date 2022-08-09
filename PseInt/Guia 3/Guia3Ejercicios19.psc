Algoritmo Guia3Ejercicios19
	
	//19. El número de combinaciones de m elementos tomados de n es:
	//(m/n)=(m!/n!(m-n)!)
	//Diseñar una función que permita calcular el número combinatorio de (m/n)
	///Nota: n debe ser mayor a 0 y menor que m
	
	Definir Num, Num2, Respuesta Como Entero
	Escribir "Ingrese un número:"
	Leer Num
	Escribir "Ingrese otro número:"
	Leer Num2
	Respuesta=combinaciones(Num,Num2)
	
FinAlgoritmo
Funcion Resultado <- combinaciones(Num,Num2)
	
FinFuncion
	