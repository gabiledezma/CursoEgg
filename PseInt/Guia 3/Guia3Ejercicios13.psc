//13. Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y 
//que devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es 
//"asdasd". Además la función calculara el número de intentos que se ha usado para 
//loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la función devolverá 
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
		Escribir "Ingrese la contraseña: "
		Leer Contrasenia
		Si Usuario=="Usuario1" Y Contrasenia=="asdasd" Entonces
			Resultado=Verdadero
		SiNo
			Resultado=Falso
			Intentos=Intentos+1
			Escribir "Usuario o Contraseña Incorrectos, Inténtelo Nuevamente." 
			Escribir "Recuerde que el sistema diferencia entre Mayúsculas y Minúsculas."
		FinSi
	Hasta Que Resultado=Verdadero o Intentos=3
FinFuncion
	