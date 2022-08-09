Algoritmo Guia2ejercicio17
	
	//17. Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar 
	//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá 
	//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la 
	//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema 
	//correctamente.
	
	Definir Clave Como Caracter
	Definir Intento Como Entero
	
	///Clave="eureka"
	
	Intento=0
	
	Hacer 
		Escribir "Ingrese la clave: "
		Leer Clave
		
		Intento=Intento+1
		
	Mientras Que Clave<>"eureka" y Intento<>3
	Si Clave=="eureka"
		Escribir "Haz ingresado correctamente al sistema."
	SiNo
		Escribir "Haz agotado tus 3 intentos."
	FinSi
	

	
	
	
	
FinAlgoritmo
