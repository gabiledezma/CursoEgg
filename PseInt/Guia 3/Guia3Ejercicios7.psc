Algoritmo Guia3Ejercicios7
	
	//7. Crear una procedimiento que calcule la temperatura media de un d�a a partir de la 
	//temperatura m�xima y m�nima. Crear un programa principal, que utilizando un 
	//procedimiento, vaya pidiendo la temperatura m�xima y m�nima de n d�as y vaya 
	//mostrando la media de cada d�a. El programa pedir� el n�mero de d�as que se van a 
	//introducir.
	
	Definir Dias Como Entero
	
	Escribir "Ingrese la cantidad de dias de los cuales se quiere saber la temperatura media: "
	Leer Dias
	
	TemperaturaMedia(Dias)
	
FinAlgoritmo

SubProceso TemperaturaMedia(CantDias)
	
	Definir i Como Entero
	Definir TempMax, TempMin, Media Como Real
	
	Para i=1 hasta CantDias Con Paso 1 Hacer
		
		Escribir "Ingrese la Temperatura M�xima del d�a ", i, ": "
		Leer TempMax
		
		Escribir "Ingrese la Temperatura M�nima del d�a ", i, ": "
		Leer TempMin
		
		Media=(TempMax+TempMin)/2
		
		Escribir "La temperatura media del d�a ", i, " es:" Media
		
	FinPara
	
	
	
	
FinSubProceso
	