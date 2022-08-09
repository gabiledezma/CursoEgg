Algoritmo Ejercicios
	Definir Num Como Entero
	Repetir
		Escribir "¿Qué ejercicio desea ver? "
		Leer Num
		Segun Num Hacer
			1: 
				Ejercicio1()
			2:
				Ejercicio2()
			3: 
				Ejercicio3()
			4:
				Ejercicio4()
			5: 
				Ejercicio5()
			6:
				Ejercicio6()
			7: 
				Ejercicio7()
			8:
				Ejercicio8()
			9: 
				Ejercicio9()
			10:
				Ejercicio10()
			De Otro Modo:
				Escribir "Número inválido."
		FinSegun
	Hasta Que Num<=10 Y Num>=1
FinAlgoritmo
SubProceso Ejercicio1()
	Definir Nombre Como Caracter
	Escribir "Ingrese su nombre:"
	Leer Nombre
	Escribir "Hola, ", Nombre
FinSubProceso
SubProceso Ejercicio2()
	Definir Num, Num2 Como Entero
	Escribir "Ingrese un número: "
	Leer Num
	Escribir "Ingrese otro número: "
	Leer Num2
	Escribir "La suma de ambos números es: ", Num+Num2
FinSubProceso
SubProceso Ejercicio3() 
	Definir Num Como Entero
	Escribir "Ingrese un número: "
	Leer Num
	Si Num MOD 2 == 0 Entonces
		Escribir "El número ingresado: ", Num, " es múltiplo de 2."
	SiNo
		Escribir "El número ingresado: ", Num, " NO es múltiplo de 2."
	FinSi
FinSubProceso 
SubProceso Ejercicio4()
	Definir Palabra, Palabrita Como Caracter
	Escribir "Ingrese una palabra: "
	Leer Palabra
	Palabrita=Subcadena(Palabra,0,3)
	Escribir Palabrita
FinSubProceso
SubProceso Ejercicio5()
	Definir Palabra, Palabrita Como Caracter
	Definir Largo Como Entero
	Escribir "Ingrese una palabra: "
	Leer Palabra
	Largo=Longitud(Palabra)
	Palabrita=Subcadena(Palabra,Largo-4,Largo)
	Escribir Palabrita
FinSubProceso
SubProceso Ejercicio6()
	Definir Text Como Caracter
	Definir Largo Como Entero
	Escribir "Ingrese un texto: "
	Leer Text
	Largo=Longitud(Text)
	Escribir "El texto tiene: ", Largo, " caracteres."
FinSubProceso
SubProceso Ejercicio7()
	Definir Text Como Caracter
	Definir Largo, i, Contador Como Entero
	Escribir "Ingrese un texto: "
	Leer Text
	Largo=Longitud(Text)
	Para i=0 Hasta Largo Con Paso 1 Hacer
		Si Subcadena(Text,i,i)==" " Entonces
			Contador=Contador+1
		FinSi
	Fin Para
	Si Subcadena(Text,Largo,Largo)==" " Entonces
		Escribir "El texto tiene: ", Contador, " palabras."
	SiNo
		Escribir "El texto tiene: ", Contador+1, " palabras."
	FinSi
FinSubProceso
SubProceso Ejercicio8()
	Definir Num Como Entero
	Definir Mes Como Caracter
	Repetir
		Escribir "Ingrese un número del 1 al 12: "
		Leer Num
		Segun Num Hacer
			1:
				Mes="Enero"
			2:
				Mes="Febrero"
			3:
				Mes="Marzo"
			4:
				Mes="Abril"
			5:
				Mes="Mayo"
			6:
				Mes="Junio"
			7:
				Mes="Julio"
			8:
				Mes="Agosto"
			9:
				Mes="Septiembre"
			10:
				Mes="Octubre"
			11:
				Mes="Noviembre"
			12:
				Mes="Diciembre"
			De Otro Modo:
				Escribir "El número ingresado es inválido."
		Fin Segun
	Mientras Que Num<1 O Num>12
	Escribir "El número ingresado corresponde a: ", Mes
FinSubProceso
SubProceso Ejercicio9()
	Definir Letra Como Caracter
	Escribir "Ingrese una letra: "
	Leer Letra
	Letra=Mayusculas(Letra)
	Segun Letra Hacer
		"A","E","I","O","U":
			Escribir "La letra ingresada es una vocal."
		"B","C","D","F","G","H","J","K","L","M","N","Ñ","P","Q","R","S","T","V","W","X","Y","Z":
			Escribir "La letra ingresada es una consonante."
		De Otro Modo:
			Escribir "El carcater ingresado NO es una letra."
	Fin Segun
FinSubProceso
SubProceso Ejercicio10()
	Definir Num, i Como Entero
	Escribir "Ingrese un número: "
	Leer Num
	Para i=0 Hasta Num-1 Con Paso 1 Hacer
		Escribir Sin Saltar"X"
	Fin Para
FinSubProceso