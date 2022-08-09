Algoritmo Guia4EjercicioExtra1
	//1. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios 
	//y los muestre por pantalla.
	Definir Vector1, Vector2, i Como Entero
	Dimension Vector1[5]
	Dimension Vector2[5]
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Vector1[i]=Aleatorio(1,9)
		Vector2[i]=Aleatorio(1,9)
	FinPara
	Escribir "El Vector 1 está integrado por: "
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Escribir Sin Saltar Vector1[i], " "
	Fin Para
	Escribir ""
	Escribir "El Vector 2 está integrado por: "
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Escribir Sin Saltar Vector2[i], " "
	Fin Para
FinAlgoritmo
