Algoritmo Guia3Ejercicios15
	
	//15. Realizar una función que calcule la suma de los dígitos de un numero.
	//Ejemplo: 25 = 2 + 5 = 7
	//Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en 
	//el resto de una división entre 10. Recordar el uso de la función Mod y Trunc.
	
	Definir Num Como Entero
	Escribir "Ingrese un número:"
	Leer Num
	Escribir "La suma de los dígitos de ", Num, " es: ", SumaDeDigitos(Num)
FinAlgoritmo
Funcion Resultado<-SumaDeDigitos(Num)
	Definir Resultado, i, Largo, Cambiador Como Entero
	Definir NumCadena, NumGuardado Como Caracter
	NumCadena = ConvertirAtexto(Num)
	Largo=Longitud(NumCadena)
	Resultado=0
	Para i=0 Hasta Largo Con Paso 1 Hacer
		NumGuardado=subcadena(NumCadena,i,i)
		Cambiador=ConvertirANumero(NumGuardado)
		Resultado=Resultado+Cambiador
	FinPara
FinFuncion

	