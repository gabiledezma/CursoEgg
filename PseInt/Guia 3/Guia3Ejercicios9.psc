Algoritmo Guia3Ejercicios9
	
	//9. Escribir un programa que procese una secuencia de caracteres ingresada por teclado y 
	//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente 
	//manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de 
	//los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
	///a e i o u
	///@ # $ % *
	//Realice un subprograma que reciba una secuencia de caracteres y retorne la 
	//codificación correspondiente. Utilice la estructura "según" para la transformación.
	//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
	//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
	///NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
	
	Definir frase Como Caracter
	
	Escribir "Ingrese una frase o palabra: "
	Leer frase
	
	CambioDeCaracteres(frase)
	
FinAlgoritmo

SubProceso CambioDeCaracteres(fra)
	
	Definir Largo, i Como Entero
	Definir FraseMay, Letra, FinalFrase, frasefinal Como Caracter
	
	FraseMay=Mayusculas(fra)
	FinalFrase="."
	Largo=Longitud(FraseMay)
	i=0
	frasefinal=""
	Hacer 
		Letra=Subcadena(FraseMay, i, i)
		i=i+1
		Segun Letra Hacer
			"A":
				Letra="@"
			"E":
				Letra="#"
			"I":
				Letra="$"
			"O":
				Letra="%"
			"U":	
				Letra="*"
			De Otro Modo:
				Letra=Minusculas(Letra)
		Fin Segun
		
		frasefinal=Concatenar(frasefinal,letra)
		
	Hasta Que Subcadena(FraseMay, i, i) = FinalFrase o i=Largo
	
	Escribir frasefinal
	
FinSubProceso
	