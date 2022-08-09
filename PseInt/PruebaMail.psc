Algoritmo PruebaMail
	Definir Registro  Como Logico
	Definir UsuarioReal, ContraReal Como Caracter
	Escribir "Ingrese su Usuario: "
	Leer UsuarioReal
	Escribir "Ingrese la contraseña: "
	Leer ContraReal
	Registro=Login(UsuarioReal,ContraReal)
	Escribir Registro
FinAlgoritmo
Funcion Resultado<-Login(UsuarioReal,ContraReal)
	Definir Resultado Como Logico
	Definir Usuario, Contrasenia Como Caracter
	Definir Intentos Como Entero
	Intentos=0
	Hacer
		Escribir "Ingrese su Usuario: "
		Leer Usuario
		Escribir "Ingrese la contraseña: "
		Leer Contrasenia
		Si Usuario==UsuarioReal Y Contrasenia==ContraReal Entonces
			Resultado=Verdadero
		SiNo
			Resultado=Falso
			Intentos=Intentos+1
			Escribir "Usuario o Contraseña Incorrectos, Inténtelo Nuevamente." 
			Escribir "Recuerde que el sistema diferencia entre Mayúsculas y Minúsculas."
		FinSi
	Hasta Que Resultado=Verdadero o Intentos=3
FinFuncion
	