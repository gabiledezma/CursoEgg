Algoritmo Guia4EjercicioExtra17
	//17. Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina 
	//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco 
	//zonas: Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene 
	//distintas estadísticas sobre el comportamiento de sus representantes en cada zona. Se 
	//desea hacer un programa que lea el monto de las ventas de los representantes en cada 
	//zona y calcule luego: 
	//	a)	el total de ventas de una zona introducida por teclado
	//	b) 	el total de ventas de un vendedor introducido por teclado en cada una de las zonas 
	//	c) 	el total de ventas de todos los representantes
	
	Definir Zonas, VerZona, VentasLog Como Caracter
	Definir VentasN, VentasS, VentasE, VentasO, VentasC, TotalVentas Como Entero
	Definir ZonasLog, VerZonasLog Como Logico
	VentasN=0
	VentasS=0
	VentasE=0
	VentasO=0
	VentasC=0
	Repetir
		Escribir "Ingrese su Zona (presione Z para salir): "
		Leer Zonas
		Zonas=Mayusculas(Zonas)
		Zonas=Subcadena(Zonas,0,0)
		Segun Zonas Hacer
			"N":
				VentasN=VentasNorte()
				ZonasLog=Verdadero
			"S":
				VentasS=VentasSur()
				ZonasLog=Verdadero
			"E":
				VentasE=VentasEste()
				ZonasLog=Verdadero
			"O":
				VentasO=VentasOeste()
				ZonasLog=Verdadero
			"C":
				VentasC=VentasCentro()
				ZonasLog=Verdadero
			"Z":
				ZonasLog=Falso
			De Otro Modo:
				Escribir "La zona ingresada es incorrecta."
		Fin Segun
	Mientras Que ZonasLog<>Falso
	TotalVentas=VentasN+VentasS+VentasO+VentasE+VentasC
	Repetir
		Escribir "Ingrese la zona que desea supervisar (presione Z para salir): "
		Leer VerZona
		VerZona=Mayusculas(VerZona)
		VerZona=Subcadena(VerZona,0,0)
		Segun VerZona Hacer
			"N":
				Escribir "Zona Norte: ", VentasN
				ZonasLog=Verdadero
			"S":
				Escribir "Zona Sur: ", VentasS
				ZonasLog=Verdadero
			"E":
				Escribir "Zona Este: ", VentasE
				ZonasLog=Verdadero
			"O":
				Escribir "Zona Oeste: ", VentasO
				ZonasLog=Verdadero
			"C":
				Escribir "Zona Centro: ", VentasC
				ZonasLog=Verdadero
			"Z": 
				ZonasLog=Falso
			De Otro Modo:
				Escribir "La zona ingresada es incorrecta."
		Fin Segun
	Mientras Que ZonasLog<>Falso
	Escribir "¿Desea ver el total total de las ventas?(En caso afirmativo presione S) "
	Leer VentasLog
	VentasLog=Mayusculas(VentasLog)
	VentasLog=Subcadena(VentasLog,0,0)
	Si VentasLog=="S" Entonces
		Escribir "El total es: " TotalVentas
		Escribir "Gracias, Hasta Pronto!"
	SiNo
		Escribir "Gracias, Hasta Pronto!"
	FinSi
FinAlgoritmo
Funcion Total<-VentasNorte()
	Definir Total, Acumulado, Ventas Como Entero
	Escribir "Ingrese las ventas de Zona Norte: (presione 0 para finalizar) "
	Leer Ventas
	Acumulado=0
	Acumulado=Acumulado+Ventas
	Si Ventas<>0 Entonces
		Total=Acumulado+VentasNorte()
	FinSi
FinFuncion
Funcion Total<-VentasSur()
	Definir Total, Acumulado, Ventas Como Entero
	Escribir "Ingrese las ventas de Zona Sur: (presione 0 para finalizar) "
	Leer Ventas
	Acumulado=0
	Acumulado=Acumulado+Ventas
	Si Ventas<>0 Entonces
		Total=Acumulado+VentasSur()
	FinSi
FinFuncion
Funcion Total<-VentasEste()
	Definir Total, Acumulado, Ventas Como Entero
	Escribir "Ingrese las ventas de Zona Este: (presione 0 para finalizar) "
	Leer Ventas
	Acumulado=0
	Acumulado=Acumulado+Ventas
	Si Ventas<>0 Entonces
		Total=Acumulado+VentasEste()
	FinSi
FinFuncion
Funcion Total<-VentasOeste()
	Definir Total, Acumulado, Ventas Como Entero
	Escribir "Ingrese las ventas de Zona Oeste: (presione 0 para finalizar) "
	Leer Ventas
	Acumulado=0
	Acumulado=Acumulado+Ventas
	Si Ventas<>0 Entonces
		Total=Acumulado+VentasOeste()
	FinSi
FinFuncion
Funcion Total<-VentasCentro()
	Definir Total, Acumulado, Ventas Como Entero
	Escribir "Ingrese las ventas de Zona Centro: (presione 0 para finalizar) "
	Leer Ventas
	Acumulado=0
	Acumulado=Acumulado+Ventas
	Si Ventas<>0 Entonces
		Total=Acumulado+VentasCentro()
	FinSi
FinFuncion