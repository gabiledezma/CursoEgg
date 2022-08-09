Algoritmo Guia2EjerciciosExtra8
	
	//8. Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran 
	//entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener 
	//la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que 
	//compra, y el monto total que tiene que pagar por el total de la compra
	
	Definir Llantas Como Entero
	Definir Precio, MontoTotal Como Real
	
	Escribir "Ingrese la cantidad de Llantas compradas: "
	Leer Llantas
	
	Si Llantas<5 Entonces
		Precio=3000
	SiNo
		Si Llantas>=5 y Llantas<=10 Entonces
			Precio=2500
		SiNo
			Si LLantas>10 Entonces
				Precio=2000
			SiNo
				Escribir "El número ingresado NO es válido."
			FinSi
		FinSi
	FinSi
	
	MontoTotal=LLantas*Precio
	
	Escribir "El cliente debe pagar por cada Llanta: $", Precio,".", "El monto total a abonar es: $", MontoTotal 
	
	
FinAlgoritmo
