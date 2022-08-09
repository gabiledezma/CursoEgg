Algoritmo Guia4EjercicioExtra15
	//15. Realizar un programa que permita visualizar el resultado del producto de una matriz de 
	//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden 
	//inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de 
	//cómo se realiza la multiplicación entre matrices consultar el siguiente link: 
	//https://es.wikibooks.org/wiki/%C3%81lgebra_Lineal/Matriz_por_vector
	Definir Matriz, Vector, MatrizYVector, i, j Como Entero
	Dimension Matriz[3,3], Vector[3], MatrizYVector[3]
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Matriz[i,j]=Aleatorio(1,5)
		Fin Para
		Vector[i]=Aleatorio(1,5)
	Fin Para
	Para i=0 Hasta 2 Con Paso 1 Hacer
		MatrizYVector[i]=(Matriz[i,0]*Vector[i])+(Matriz[i,1]*Vector[i])+(Matriz[i,2]*Vector[i])
	Fin Para
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar Matriz[i,j], " "
		Fin Para
		Escribir ""
	Fin Para
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Escribir Vector[i]
	Fin Para
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Escribir MatrizYVector[i]
	Fin Para
FinAlgoritmo
