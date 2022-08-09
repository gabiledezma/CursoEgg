Algoritmo Guia2EjerciciosExtra4
	
	//4. La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema 
	//de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro 
	//de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de 
	//regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la 
	//cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra 
	//40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total 
	//de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y 
	//el total a pagar por el cliente.
	
	Definir TiempoDeUso, ConsumoDeNafta, TarifaUso, TarifaNafta, TarifaTotal Como Real
	
	
	Escribir "Ingrese el tiempo de uso del vehículo (en Horas): "
	Leer TiempoDeUso
		
	Si TiempoDeUso<=2 Entonces
		
		TarifaTotal=400
		
	SiNo
		
		Si TiempoDeUso>2 Entonces
			
			Escribir "Ingrese la cantidad de combustible utilizado (en Litros): "
			Leer ConsumoDeNafta
			
			TarifaNafta=ConsumoDeNafta*40
			
			TiempoDeUso=TiempoDeUso*60
			
			TarifaUso=TiempoDeUso*5.20
			
			TarifaTotal=TarifaNafta+TarifaUso
			
		FinSi
		
	FinSi
	
	Escribir "El monto a abonar es: $", TarifaTotal
	
FinAlgoritmo
