Algoritmo Guia3Ejercicios23
	//23. Diseñar un procedimiento que reciba una frase, y el programa remueva todas las 
	//vocales repetidas. Al final el procedimiento mostrará la frase final.
	Definir Frase Como Caracter
	Escribir "Ingrese una frase:"
	Leer Frase
	VocalesRepetidas(Frase)
FinAlgoritmo
SubProceso VocalesRepetidas(Frase)
	Definir i, Largo, ContadorA, ContadorE, ContadorI, ContadorO, ContadorU Como Entero
	Definir FraseFinal, Letra, LetraSiguiente Como Caracter
	Largo=Longitud(Frase)
	FraseFinal=""
	ContadorA=0
	ContadorE=0
	ContadorI=0
	ContadorO=0
	ContadorU=0
	Para i=0 Hasta Largo Con Paso 1 Hacer
		Letra=Subcadena(Frase,i,i)
		LetraSiguiente=Subcadena(Frase,i+1,i+1)
		Si Letra=="A" o Letra=="a" Entonces
			ContadorA=ContadorA+1
		FinSi
		Si ContadorA<=1 y (Letra=="a" o Letra =="A")
			FraseFinal=Concatenar(FraseFinal,Letra)
		FinSi
		Si Letra=="E" o Letra=="e" Entonces
			ContadorE=ContadorE+1
		FinSi
		Si ContadorE<=1 y (Letra=="e" o Letra =="E")
			FraseFinal=Concatenar(FraseFinal,Letra)
		FinSi
		Si Letra=="I" o Letra=="i" Entonces
			ContadorI=ContadorI+1
		FinSi
		Si ContadorI<=1 y (Letra=="i" o Letra =="I")
			FraseFinal=Concatenar(FraseFinal,Letra)
		FinSi
		Si Letra=="O" o Letra=="o" Entonces
			ContadorO=ContadorO+1
		FinSi
		Si ContadorO<=1 y (Letra=="o" o Letra =="O")
			FraseFinal=Concatenar(FraseFinal,Letra)
		FinSi
		Si Letra=="U" o Letra=="u" Entonces
			ContadorU=ContadorU+1
		FinSi
		Si ContadorU<=1 y (Letra=="u" o Letra =="U")
			FraseFinal=Concatenar(FraseFinal,Letra)
		FinSi
		Si (Letra<>"A" y Letra<>"a") y (Letra<>"E" y Letra<>"e") y (Letra<>"I" y Letra<>"i") y (Letra<>"O" y Letra<>"o") y (Letra<>"U" y Letra<>"u") Entonces
			FraseFinal=Concatenar(FraseFinal,Letra)
		FinSi
	FinPara
	Escribir FraseFinal
FinSubProceso
	