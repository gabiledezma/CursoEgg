Algoritmo Guia4EjercicioExtra3
	//3. Crear dos vectores que tengan el mismo tama�o (el tama�o se pedir� por teclado) y
	//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector 
	//se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la 
	//funci�n Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su 
	//longitud.
	Definir Vector1 Como Caracter
	Definir Vector2, Tamanio, i, Largo Como Entero
	Escribir "Ingrese la cantidad de personas: "
	Leer Tamanio
	Dimension Vector1[Tamanio]
	Dimension Vector2[Tamanio]
	Para i=0 Hasta Tamanio-1 Con Paso 1 Hacer
		Escribir "Ingrese un nombre: "
		Leer Vector1[i]
		Vector2[i]=Longitud(Vector1[i])
	FinPara
	Para i=0 Hasta Tamanio-1 Con Paso 1 Hacer
		Escribir Vector1[i], " tiene un largo de: ", Vector2[i]
	FinPara
FinAlgoritmo
