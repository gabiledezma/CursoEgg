Algoritmo Guia4EjercicioExtra5
	//5. Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserci�n del car�cter, 
	//facilitando un potencial reordenamiento del vector. Digamos que se pide ingresar el 
	//car�cter en la posici�n X y la misma est� ocupada, entonces de existir un espacio en 
	//cualquier posici�n X-n o X+n, desplazar los caracteres hacia la izq o hacia la derecha para 
	//poder ingresar el car�cter en cuesti�n en el lugar deseado. El procedimiento de 
	//reordenamiento debe ubicar el espacio m�s cercano.
	//	Por ejemplo, suponiendo la siguiente frase y los sub�ndices del vector:
	//		H o l a   m u n d o     c  r  u  e  l  !
	//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
	//	Si se desea ingresar el car�cter "%" en la posici�n 8, entonces el resultado con 
	//	desplazamiento ser�a:
	//		h o l a    m u n % d  o     c  r  u  e  l  !
	//		0 1 2 3 4  5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
	//Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posici�n 
	//10 estaba m�s cerca de la posici�n 8 que el espacio de la posici�n 4.
	Definir i, Contador, Vacio, SubindicesVacios, ContadorVacios, ContadorDiferencias, Diferencias Como Entero
	Definir Vector, Frase, karacter Como Caracter
	Definir Desplazamiento Como Logico
	Dimension Vector[20]
	Dimension SubindicesVacios[20]
	Escribir "Ingrese una frase: "
	Leer Frase
	Para i=0 Hasta 19 Con Paso 1 Hacer
		Vector[i]=Subcadena(Frase,i,i)
	FinPara
	Contador=0
	ContadorVacios=0
	ContadorDiferencias=20
	Para i=0 Hasta 19 Con Paso 1 Hacer
		Si Vector[i]==" " o Vector[i]=="" Entonces
			SubindicesVacios[ContadorVacios]=i
			Escribir "La posici�n de un caracter vac�o es sub�ndice: " i
			ContadorVacios=ContadorVacios+1
		SiNo
			Contador=Contador+1
			Si Contador==20 Entonces
				Escribir "No hay espacios vac�os o en Blanco"
			FinSi
		FinSi
	FinPara
	Si Contador<20 Entonces
		Escribir "Ingrese un caracter: "
		Leer karacter
		Escribir "Ingrese la posici�n del sub�ndice donde desea reemplazar el espacio vac�o o en blanco:"
		Leer Vacio
		Si Vector[Vacio]=="" o Vector[Vacio]==" " Entonces
			Vector[Vacio]=karacter
			Para i=0 Hasta 19 Con Paso 1 Hacer
				Escribir Sin Saltar Vector[i]
			FinPara
		SiNo
			Para i=0 Hasta 4 Con Paso 1 Hacer
				Diferencias=Vacio-SubindicesVacios[i]
				Si Diferencias<0 Entonces
					Diferencias=Diferencias*(-1)
					Desplazamiento=Falso
				SiNo
					Desplazamiento=Verdadero
				FinSi
				Si Diferencias<ContadorDiferencias Entonces
					ContadorDiferencias=Diferencias
				FinSi
			Fin Para
			Si Desplazamiento Entonces
				Para i=0 Hasta Vacio Con Paso 1 Hacer
					Escribir Sin Saltar Vector[i]
				FinPara
				Escribir Sin Saltar karacter
				Para i=Vacio+1 Hasta 19 Con Paso 1 Hacer
					Escribir Sin Saltar Vector[i]
				FinPara
			SiNo
				Para i=0 Hasta Vacio-1 Con Paso 1 Hacer
					Escribir Sin Saltar Vector[i]
				FinPara
				Escribir Sin Saltar karacter
				Para i=Vacio Hasta 19 Con Paso 1 Hacer
					Escribir Sin Saltar Vector[i]
				FinPara
			FinSi
		FinSi
	FinSi	
FinAlgoritmo
