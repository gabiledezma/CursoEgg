 Algoritmo Guia2Ejercicio5
	
	//5. Realizar un programa que pida un numero y determine si ese numero es par o impar.
	//Mostrar en pantalla un mensaje que indique si el numero es par o impar. (para que un
	//n�mero sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
	//la funci�n mod de Pseint. 
	
	Definir Num Como Entero
	
	Escribir "Ingrese un N�mero"
	Leer Num
	
	Si (Num==0) Entonces
		Escribir "El n�mero NO es par ni impar."
	SiNo
		Si (Num MOD 2) == 0
			Escribir "El n�mero es Par."
		SiNo
			Escribir "El n�mero es Impar."
		FinSi
		
	FinSi

FinAlgoritmo
