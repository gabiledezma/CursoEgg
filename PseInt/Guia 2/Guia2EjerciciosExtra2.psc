Algoritmo Guia2EjerciciosExtra2
	
	//2. Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del 
	//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un 
	//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se 
	//debe cobrar al cliente e imprimirlo por pantalla. 
	
	Definir Mes, Inicial, InMay Como Caracter
	Definir MontoTotal, Importe  Como Real
		
	Escribir "Ingrese el mes en el cual hizo su compra: "
	Leer Mes
	
	Inicial=subcadena(Mes,0,0)
	
	InMay=Mayusculas(Inicial)
	
	Escribir "Ingrese el Importe de su compra: "
	Leer Importe
	
	Si InMay="S" o InMay="O" o InMay="N"  Entonces
		
		MontoTotal=Importe*0.9
		
	SiNo
		
		MontoTotal=Importe
		
	FinSi
	
	Escribir "El monto a abonar es de: " MontoTotal
	
FinAlgoritmo
