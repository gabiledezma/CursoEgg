 Algoritmo Guia2Ejercicio5
	
	//5. Realizar un programa que pida un numero y determine si ese numero es par o impar.
	//Mostrar en pantalla un mensaje que indique si el numero es par o impar. (para que un
	//número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
	//la función mod de Pseint. 
	
	Definir Num Como Entero
	
	Escribir "Ingrese un Número"
	Leer Num
	
	Si (Num==0) Entonces
		Escribir "El número NO es par ni impar."
	SiNo
		Si (Num MOD 2) == 0
			Escribir "El número es Par."
		SiNo
			Escribir "El número es Impar."
		FinSi
		
	FinSi

FinAlgoritmo
