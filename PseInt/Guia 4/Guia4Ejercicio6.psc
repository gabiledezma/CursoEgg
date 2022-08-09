Algoritmo Guia4Ejercicio6
	//6. Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide 
	//desarrollar un programa que:
		//a. Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por 
	//letra. Ayuda: utilizar la función Subcadena de PSeInt.
		//b. Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una 
	//posición dentro del arreglo, y el programa debe intentar ingresar el carácter 
	//en la posición indicada, si es que hay lugar (es decir la posición está vacía o 
	//es un espacio en blanco). De ser posible debe mostrar el vector con la frase y 
	//el carácter ingresado, de lo contrario debe darle un mensaje al usuario de que 
	//esa posición estaba ocupada. 
		//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
			//H o l a   m u n d o     c  r  u  e  l  !
			//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
		//Si se desea ingresar el carácter "%" en la posición 10, entonces el resultado sería:
			//H o l a   m u n d o  %  c  r  u  e  l  !
			//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
	Definir i, Contador, Vacio Como Entero
	Definir Vector, Frase, karacter Como Caracter
	Dimension Vector[20]
	Escribir "Ingrese una frase: "
	Leer Frase
	Para i=0 Hasta 19 Con Paso 1 Hacer
		Vector[i]=Subcadena(Frase,i,i)
	FinPara
	Contador=0
	Para i=0 Hasta 19 Con Paso 1 Hacer
		Si Vector[i]==" " o Vector[i]=="" Entonces
			Escribir "La posición de un caracter vacío es subíndice: " i
		SiNo
			Contador=Contador+1
			Si Contador==20 Entonces
				Escribir "No hay espacios vacíos o en Blanco"
			FinSi
		FinSi
	FinPara
	Si Contador<20 Entonces
		Escribir "Ingrese un caracter: "
		Leer karacter
		Escribir "Ingrese la posición del subíndice donde desea reemplazar el espacio vacío o en blanco:"
		Leer Vacio
		Si Vector[Vacio]=="" o Vector[Vacio]==" " Entonces
			Vector[Vacio]=karacter
		SiNo
			Escribir "La posición del subíndice donde desea ingresar el caracter está ocupada."
		FinSi
	FinSi
	Para i=0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar Vector[i]
	FinPara
FinAlgoritmo
