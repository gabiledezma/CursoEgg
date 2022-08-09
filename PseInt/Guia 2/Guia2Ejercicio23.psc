Algoritmo Guia2Ejercicio23
	
	//23. Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza 
	//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor 
	//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la 
	//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada 
	//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto 
	//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada 
	//vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por 
	//cada venta.
	
	Definir Vendedores, VentasSemanales, SueldoBase, i Como Entero
	Definir Comisiones, SueldoTotal, ComisionPorCadaVenta Como Real
	Definir NombreVendedor Como Caracter
	
	Escribir "Ingrese la cantidad total de vendedores de la compa��a: "
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
	
	Escribir NombreVendedor " realiz� la suma de ", VentasSemanales, " Ventas, esta semana, adem�s cobr� por cada una de �stas: $", ComisionPorCadaVenta, " con un sueldo base de: $", SueldoBase, " y la suma total de: $", SueldoTotal
	
	
Fin Para
	
	
FinAlgoritmo
