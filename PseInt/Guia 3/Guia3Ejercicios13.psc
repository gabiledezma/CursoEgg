//13. Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y 
//que devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es 
//"asdasd". Adem�s la funci�n calculara el n�mero de intentos que se ha usado para 
//loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la funci�n devolver� 
//Falso.

Algoritmo Guia3Ejercicios13
	Definir Registro Como Logico
	Registro=Login()
	Escribir Registro
FinAlgoritmo
Funcion Resultado<-Login()
	Definir Resultado Como Logico
	Definir Usuario, Contrasenia Como Caracter
	Definir Intentos Como Entero
	Intentos=0
	Hacer
		Escribir "Ingrese su Usuario: "
		Leer Usuario
		Escribir "Ingrese la contrase�a: "
		Leer Contrasenia
		Si Usuario=="Usuario1" Y Contrasenia=="asdasd" Entonces
			Resultado=Verdadero
		SiNo
			Resultado=Falso
			Intentos=Intentos+1
			Escribir "Usuario o Contrase�a Incorrectos, Int�ntelo Nuevamente." 
			Escribir "Recuerde que el sistema diferencia entre May�sculas y Min�sculas."
		FinSi
	Hasta Que Resultado=Verdadero o Intentos=3
FinFuncion
	