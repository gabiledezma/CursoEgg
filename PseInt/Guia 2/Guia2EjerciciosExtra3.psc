Algoritmo Guia2EjerciciosExtra3
	
	//3. Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o 
	//impares. Mostrar en pantalla un mensaje que indique "Ambos números son pares" 
	//siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el 
	//siguiente mensaje "Los números no son pares, o uno de ellos no es par".
		///Nota: investigar la función mod de Pseint. 
	
	Definir Num1, Num2 Como Entero
	
	Escribir "Ingrese los 2 números: "
	Leer Num1, Num2
	
	Si (Num1 MOD 2)=0 Y (Num2 MOD 2)=0
		Escribir "Ambos números son pares."
	SiNo
		Escribir "Los números no son pares, o uno de ellos no es par."
	FinSi
	
FinAlgoritmo
