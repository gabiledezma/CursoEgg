Algoritmo Guia2Ejercicio8
	
	//8. Escriba un programa que pida 3 notas y valide si esas notas están entre 1 
	//y 10. Si están entre esos parámetros se debe poner en verdadero una variable 
	//de tipo lógico y si no ponerla en falso. Al final el programa debe decir si 
	//las 3 notas son correctas usando la variable de tipo lógico
	
	Definir Nota1, Nota2, Nota3 Como Entero
	Definir VarLog Como Logico
	
	
	Escribir "Ingrese las 3 Notas:"
	Leer Nota1, Nota2, Nota3
	
	Si (Nota1>=1) Y (Nota1<=10) Y (Nota2>=1) Y (Nota2<=10) Y (Nota3>=1) Y (Nota3<=10) Entonces
		
		VarLog=Verdadero
		Escribir "Las 3 Notas son Correctas."
	SiNo
		VarLog=Falso
		Escribir "Alguna nota es Incorrecta."
	FinSi

	
FinAlgoritmo
