Algoritmo Guia3Ejercicios15
	
	//15. Realizar una funci�n que calcule la suma de los d�gitos de un numero.
	//Ejemplo: 25 = 2 + 5 = 7
	//Nota: Para obtener el �ltimo numero de un digito de 2 cifras o m�s debemos pensar en 
	//el resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.
	
	Definir Num Como Entero
	Escribir "Ingrese un n�mero:"
	Leer Num
	Escribir "La suma de los d�gitos de ", Num, " es: ", SumaDeDigitos(Num)
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

	