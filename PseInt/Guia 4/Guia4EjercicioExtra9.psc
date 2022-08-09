Algoritmo Guia4EjercicioExtra9
	//9. Programe una función que calcule el producto de un arreglo de números enteros. Para 
	//esto imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los 
	//valores es igual a (V[1]*V[2]*V[3]*V[4])
	Definir Vector, Tamanio, i Como Entero
	Escribir "Ingrese el tamaño del vector:"
	Leer Tamanio
	Dimension Vector[Tamanio]
	Para i=0 Hasta Tamanio-1 Con Paso 1 Hacer
		Vector[i]=Aleatorio(1,10)
	Fin Para
	Escribir "El producto de todos los valores dentro del vector es: ", ProductoDeArreglo(Vector,Tamanio)
FinAlgoritmo
Funcion Resultado<-ProductoDeArreglo(Vector,Tamanio)
	Definir Resultado, i Como Entero
	Resultado=1
	Para i=0 Hasta Tamanio-1 Con Paso 1 Hacer
		Resultado=Resultado*Vector[i]
	Fin Para
FinFuncion
