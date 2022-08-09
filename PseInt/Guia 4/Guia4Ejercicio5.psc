Algoritmo Guia4Ejercicio5
	//5. Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer 
	//hasta que ingrese la opci�n Salir:
		//a. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera 
	//aleatoria usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
		//b. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera 
	//aleatoria.
		//c. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar 
	//elemento a elemento. Ejemplo: C = A + B
		//d. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar 
	//elemento a elemento. Ejemplo: C = B - A
		//e. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: 
	//Vector A, B, o C.
		//f. Salir.
	///NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. La 
	///longitud para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo 
	///se solicitar� una vez.
Definir vectorA, vectorB, vectorC, valorMin,valorMax Como Entero
Definir op, vc Como Caracter
Definir i, n  Como Entero
Definir ValoresCargados Como Logico
valormin=-100
valorMax=100
n=Aleatorio(1,5)
Dimension vectorA[n]
Dimension vectorB[n]
Dimension vectorC[n]
Escribir "Ingrese una opci�n: "
Escribir "a. Llenar Vector A."
Escribir "b. Llenar Vector B."
Escribir "c. Llenar Vector C con la suma de los vectores A y B."
Escribir "d. Llenar Vector C con la resta de los vectores B y A."
Escribir "e. Mostrar.(Vector A, B, o C)."
Escribir "f. Salir."
ValoresCargados=Falso
Repetir
Leer op
op=Mayusculas(op)
vc=""
Segun op Hacer
	"A":
		Para i=0 Hasta n-1 Hacer
			vectorA[i]= Aleatorio(valorMin,valorMax)
		FinPara
		ValoresCargados=Verdadero
	"B":
		Para i=0 Hasta n-1 Hacer
			vectorB[i]= Aleatorio(valorMin,valorMax)
		FinPara
		ValoresCargados=Verdadero
	"C":
		Para i=0 hasta n-1 Hacer
			vectorC[i]=vectorA[i]+vectorB[i]
		FinPara
		ValoresCargados=Verdadero
	"D":
		Para i=0 hasta n-1 Hacer
			vectorC[i]=vectorB[i]-vectorA[i]
		FinPara
		ValoresCargados=Verdadero
	"E":Si ValoresCargados==Verdadero Entonces
			Repetir
				Escribir "Elija que vector desea mostrar (A, B o C):" 
				Escribir "Escriba F para volver al men� anterior."
				Leer vc
				vc=Mayusculas(vc)
				Segun vc Hacer
					"A" : 
						Para i=0 hasta n-1 Hacer
							Escribir vectorA[i]
						FinPara
					"B" : 
						Para i=0 hasta n-1 Hacer
							Escribir vectorB[i]
						FinPara
					"C" : 
						Para i=0 hasta n-1 Hacer
							Escribir vectorC[i]
						FinPara
					"F":
						Escribir "Ingrese una opci�n: "
						Escribir "a. Llenar Vector A."
						Escribir "b. Llenar Vector B."
						Escribir "c. Llenar Vector C con la suma de los vectores A y B."
						Escribir "d. Llenar Vector C con la resta de los vectores B y A."
						Escribir "e. Mostrar.(Vector A, B, o C)."
						Escribir "f. Salir."
					De Otro Modo:
						Escribir "La opci�n ingresada es inv�lida"
				FinSegun
			Hasta Que vc == "F"
		SiNo
			Escribir "No hay valores para mostrar."
		FinSi
	"F": 
		Escribir "Eligi� Salir. Hasta Pronto!"
	De Otro Modo:
		Escribir "La opci�n ingresada es inv�lida"
FinSegun
Hasta Que op == "F" 
FinAlgoritmo
