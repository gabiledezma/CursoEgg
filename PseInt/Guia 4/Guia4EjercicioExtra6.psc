Algoritmo Guia4EjercicioExtra6
	//6. Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un 
	//arreglo y su valor m�s grande
	Definir Arreglo, i, n, VMax, VMin Como Entero
	n=Aleatorio(1,10)
	Dimension Arreglo[n]
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Arreglo[i]=Aleatorio(1,10)
	Fin Para
	Escribir "La diferencia entre el valor m�ximo y el valor m�nimo dentro del arreglo es: " Diferencia(Arreglo,n)
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
	