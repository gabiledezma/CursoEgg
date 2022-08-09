Algoritmo Guia4Ejercicio7
	//7. Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios.
	//Después, hacer una función que reciba los dos arreglos y diga si todos sus valores son 
	//iguales o no. La función debe devolver el resultado de está validación, para mostrar el 
	//mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo lógico.
	Vectores()
FinAlgoritmo
SubProceso Vectores()
	Definir Vector1, Vector2, i, j, ValorMinVectores, ValorMaxVectores, Num, ValorMin, ValorMax Como Entero
	ValorMinVectores=1
	ValorMaxVectores=5
	Num=Aleatorio(ValorMinVectores,ValorMaxVectores)
	ValorMin=1
	ValorMax=5
	Escribir "El valor del tamaño de los vectores es ", Num
	Dimension Vector1[Num]
	Dimension Vector2[Num]
	Para i=0 Hasta Num-1 Hacer
		Vector1[i]= Aleatorio(ValorMin,ValorMax)
		Vector2[i]= Aleatorio(ValorMin,ValorMax)
		Escribir Vector1[i], " ", Vector2[i]
	FinPara
	Si ValoresIguales(Vector1,Vector2,Num)== Verdadero Entonces
		Escribir "Todos sus elementos son iguales." 
	SiNo
		Escribir "Algunos de sus elementos son diferentes." 
	FinSi
FinSubProceso
Funcion Resultado <- ValoresIguales(Vector1,Vector2,Num)
	Definir Resultado Como Logico
	Definir i, Contador Como Entero
	Contador=0
	Para i=0 Hasta Num-1 Con Paso 1 Hacer
		Si Vector1[i]==Vector2[i] Entonces
			Contador=Contador+1
		FinSi
	FinPara
	Si Contador==Num Entonces
		Resultado=Verdadero
	SiNo
		Resultado=Falso
	FinSi
FinFuncion
