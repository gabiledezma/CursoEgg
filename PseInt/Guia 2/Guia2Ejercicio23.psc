Algoritmo Guia2Ejercicio23
	
	//23. Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza 
	//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor 
	//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la 
	//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada 
	//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto 
	//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada 
	//vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por 
	//cada venta.
	
	Definir Vendedores, VentasSemanales, SueldoBase, i Como Entero
	Definir Comisiones, SueldoTotal, ComisionPorCadaVenta Como Real
	Definir NombreVendedor Como Caracter
	
	Escribir "Ingrese la cantidad total de vendedores de la compañía: "
	Leer Vendedores
	
Para i=1 Hasta Vendedores Con Paso 1 Hacer
		
	
	
	Escribir "Ingrese el nombre del vendedor: "
	Leer NombreVendedor
	
	Escribir "Ingrese su sueldo base: "
	Leer SueldoBase
	
	Escribir "Ingrese la cantidad de ventas semanales: "
	Leer VentasSemanales
	
	Comisiones=SueldoBase*(VentasSemanales*0.1)
	
	ComisionPorCadaVenta=SueldoBase*0.1
	
	SueldoTotal=SueldoBase+Comisiones
	
	Escribir NombreVendedor " realizó la suma de ", VentasSemanales, " Ventas, esta semana, además cobró por cada una de éstas: $", ComisionPorCadaVenta, " con un sueldo base de: $", SueldoBase, " y la suma total de: $", SueldoTotal
	
	
Fin Para
	
	
FinAlgoritmo
