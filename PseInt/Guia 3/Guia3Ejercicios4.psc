Algoritmo Guia3Ejercicios4
	
	//4. Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La 
	//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso 
	//de la función Subcadena()
	
	Definir frase, letra Como Caracter
		
	Escribir "Ingrese una frase: "
	Leer frase
	Escribir "Ingrese una letra: "
	Leer letra
	
	Escribir "La Cantidad total de letras es: " CantidadDeLetras(frase,letra)
	
FinAlgoritmo

Funcion Resultado<-CantidadDeLetras(fra,let)
	
	Definir Resultado, Cantidad, Largo, i Como Entero
	Definir FraseMay, LetraMay Como Caracter
	
	FraseMay=Mayusculas(fra)
	LetraMay=Mayusculas(let)
	
	Largo=Longitud(FraseMay)
	Cantidad=0
	
	Para i=0 Hasta Largo Con Paso 1 Hacer
		Si Subcadena(FraseMay, i, i)==LetraMay Entonces
			Cantidad=Cantidad+1
		FinSi
	FinPara
	
	Resultado=Cantidad
	
FinFuncion

	