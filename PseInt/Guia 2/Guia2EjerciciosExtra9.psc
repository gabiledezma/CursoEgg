Algoritmo Guia2EjerciciosExtra9
	//9. Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto 
	//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible 
	//por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta 
	//bisiesto. Nota: recuerde la función mod de PSeInt.
	Definir Anio Como Entero
	Definir Bisiesto Como Logico
	Escribir "Ingrese un año: "
	Leer Anio
	Si Anio MOD 100 == 0 Entonces
		Si Anio MOD 400 == 0 Entonces
			Bisiesto=Verdadero
		SiNo
			Bisiesto=Falso
		FinSi
	SiNo
		Si Anio MOD 4==0 Entonces
			Bisiesto=Verdadero
		SiNo
			Bisiesto=Falso
		FinSi
	FinSi
	Si Bisiesto==Verdadero Entonces
		Escribir "El año es bisiesto."
	SiNo
		Escribir "El año NO es bisiesto."
	FinSi
FinAlgoritmo
