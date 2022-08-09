Algoritmo Guia4EjercicioExtra6
	//6. Crear una función que devuelva la diferencia que hay entre el valor más chico de un 
	//arreglo y su valor más grande
	Definir Arreglo, i, n, VMax, VMin Como Entero
	n=Aleatorio(1,10)
	Dimension Arreglo[n]
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Arreglo[i]=Aleatorio(1,10)
	Fin Para
	Escribir "La diferencia entre el valor máximo y el valor mínimo dentro del arreglo es: " Diferencia(Arreglo,n)
FinAlgoritmo
Funcion Resultado=Diferencia(Arreglo,n)
	Definir Resultado, VMax, VMin, i Como Entero
	VMax=0
	VMin=0
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Si Arreglo[i]>VMax Entonces
			VMax=Arreglo[i]
		FinSi
		Si Arreglo[i]<VMin o VMin==0 Entonces
			VMin=Arreglo[i]
		FinSi
	Fin Para
	Resultado=VMax-VMin
FinFuncion
	