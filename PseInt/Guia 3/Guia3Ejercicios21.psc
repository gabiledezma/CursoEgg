Algoritmo Guia3Ejercicios21
	//21. Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros 
	//comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al 
	//usuario al comenzar. Ejemplo: si se ingresa el n�mero 3: 
		///1
		///12
		///123
	Definir Num Como Entero
	Escribir "Ingrese un n�mero:"
	Leer Num
	Escalera(Num)
FinAlgoritmo
SubProceso Escalera(Num) 
	Definir i Como Entero
	Definir aux1, aux2 Como Entero	
	aux1=0
	Para i=1 Hasta Num Hacer
		aux2=(aux1*10)+i             
		aux1=aux2
		Escribir aux1
	FinPara
FinSubProceso
	