Algoritmo Guia2EjerciciosExtra3
	
	//3. Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o 
	//impares. Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares" 
	//siempre y cuando cumplan con la condici�n. En caso contrario se deber� imprimir el 
	//siguiente mensaje "Los n�meros no son pares, o uno de ellos no es par".
		///Nota: investigar la funci�n mod de Pseint. 
	
	Definir Num1, Num2 Como Entero
	
	Escribir "Ingrese los 2 n�meros: "
	Leer Num1, Num2
	
	Si (Num1 MOD 2)=0 Y (Num2 MOD 2)=0
		Escribir "Ambos n�meros son pares."
	SiNo
		Escribir "Los n�meros no son pares, o uno de ellos no es par."
	FinSi
	
FinAlgoritmo
