Algoritmo Guia2EjerciciosExtra9
	//9. Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto 
	//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible 
	//por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta 
	//bisiesto. Nota: recuerde la funci�n mod de PSeInt.
	Definir Anio Como Entero
	Definir Bisiesto Como Logico
	Escribir "Ingrese un a�o: "
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
		Escribir "El a�o es bisiesto."
	SiNo
		Escribir "El a�o NO es bisiesto."
	FinSi
FinAlgoritmo
