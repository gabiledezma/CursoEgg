Algoritmo Guia3Ejercicios7
	
	//7. Crear una procedimiento que calcule la temperatura media de un día a partir de la 
	//temperatura máxima y mínima. Crear un programa principal, que utilizando un 
	//procedimiento, vaya pidiendo la temperatura máxima y mínima de n días y vaya 
	//mostrando la media de cada día. El programa pedirá el número de días que se van a 
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
		
		Escribir "Ingrese la Temperatura Máxima del día ", i, ": "
		Leer TempMax
		
		Escribir "Ingrese la Temperatura Mínima del día ", i, ": "
		Leer TempMin
		
		Media=(TempMax+TempMin)/2
		
		Escribir "La temperatura media del día ", i, " es:" Media
		
	FinPara
	
	
	
	
FinSubProceso
	