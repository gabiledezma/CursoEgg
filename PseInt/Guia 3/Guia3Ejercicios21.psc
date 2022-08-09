Algoritmo Guia3Ejercicios21
	//21. Crear un programa que dibuje una escalera de números, donde cada línea de números 
	//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
	//usuario al comenzar. Ejemplo: si se ingresa el número 3: 
		///1
		///12
		///123
	Definir Num Como Entero
	Escribir "Ingrese un número:"
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
	