Algoritmo Guia3Ejercicios12
	
	//12. Diseñar una función que reciba un numero en forma de cadena y lo devuelva como 
	//numero entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner 
	//números con decimales
	
	Definir NumCadena Como Caracter
	
	Escribir "Ingrese un número de hasta 3 dígitos:"
	Leer NumCadena
	
	Escribir Convertidor(NumCadena)
	
FinAlgoritmo

Funcion Cambiado<-Convertidor(NumCadena)
	
	Definir Cambiado Como Entero
	Definir digitos Como Caracter
	
	digitos=Subcadena(NumCadena,0,2)
	
	Cambiado=ConvertirANumero(digitos)
	
FinFuncion
	