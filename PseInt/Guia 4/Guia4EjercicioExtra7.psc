Algoritmo Guia4EjercicioExtra7
	//7. Crear un programa que ordene un vector lleno de números enteros aleatorios, de menor 
	//a mayor. Nota: investigar el ordenamiento burbuja en el siguiente link: Ordenamiento 
	//Burbuja
	Definir VectorBase, i, j, Aux, n Como Entero
	n=Aleatorio(2,10)
	Dimension VectorBase[n]
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		VectorBase[i]=Aleatorio(1,10)
	Fin Para
	Para i=2 Hasta n-1 Con Paso 1 Hacer
		Para j=1 Hasta n-i Con Paso 1 Hacer
			Si VectorBase[j]>VectorBase[j+1] Entonces
				aux=VectorBase[j]
				VectorBase[j]=VectorBase[j+1]
				VectorBase[j+1]=aux
			FinSi
		Fin Para
	Fin Para
	Escribir "Vector ordenado: "
	Para i=1 Hasta n-1 Con Paso 1 Hacer
		Escribir "[", i, "] : ", VectorBase[i]
	Fin Para
FinAlgoritmo
