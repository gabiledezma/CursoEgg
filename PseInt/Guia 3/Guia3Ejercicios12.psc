Algoritmo Guia3Ejercicios12
	
	//12. Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como 
	//numero entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner 
	//n�meros con decimales
	
	Definir NumCadena Como Caracter
	
	Escribir "Ingrese un n�mero de hasta 3 d�gitos:"
	Leer NumCadena
	
	Escribir Convertidor(NumCadena)
	
FinAlgoritmo

Funcion Cambiado<-Convertidor(NumCadena)
	
	Definir Cambiado Como Entero
	Definir digitos Como Caracter
	
	digitos=Subcadena(NumCadena,0,2)
	
	Cambiado=ConvertirANumero(digitos)
	
FinFuncion
	