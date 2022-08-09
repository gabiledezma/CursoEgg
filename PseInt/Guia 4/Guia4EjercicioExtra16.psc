Algoritmo Guia4EjercicioExtra16
	//16. Una empresa de venta de productos por correo desea realizar una estadística de las 
	//ventas realizadas de cada uno de sus productos a lo largo de una semana. Distribuya 
	//luego 5 productos en los 5 días hábiles de la semana. Se desea conocer:
	//	a.	 Total de ventas por cada día de la semana.
	//	b.	 Total de ventas de cada producto a lo largo de la semana.
	//	c.	 El producto más vendido en cada semana.
	//	d.	 El nombre, el día de la semana y la cantidad del producto más vendido.
	//El informe final tendrá un formato como el que se muestra a continuación:
	///					Lunes Martes Miércoles Jueves Viernes Total producto
	///Producto 1
	///Producto 2
	///Producto 3
	///Producto 4
	///Producto 5
	///Total semana
	///Producto más vendido
	Definir TablaFinal, ProdMasVend, Producto Como Caracter
	Definir MatrizNumeros, i, j Como Entero
	Dimension MatrizNumeros[7,6], TablaFinal[8,7], Producto[5]
	CargaDeVentas(MatrizNumeros)
	Borrar Pantalla
	VentasDelDia(MatrizNumeros)
	VentasSemanales(MatrizNumeros)
	ProductoMasVendidoSemanal(MatrizNumeros)
	ProductoMasVendido(MatrizNumeros,Producto)
	//MostrarMatriz(MatrizNumeros)
	ConvertirATablaGeneral(MatrizNumeros,TablaFinal,Producto)
	MostrarTabla(TablaFinal)
FinAlgoritmo
SubProceso CargaDeVentas(MatrizNumeros)
	Definir i, j Como Entero
	Definir Dia Como Caracter
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Segun i Hacer
			0:
				Dia="Lunes"
			1:
				Dia="Martes"
			2:
				Dia="Miercoles"
			3:
				Dia="Jueves"
			4:
				Dia="Viernes"
		Fin Segun
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Escribir "Cuantas ventas se hizo del producto ", j+1, ", el dia ", Dia, ": "
			Leer MatrizNumeros[j,i]	
			//MatrizNumeros[j,i]=Aleatorio(100,999)
		Fin Para
	FinPara
FinSubProceso
SubProceso VentasSemanales(MatrizNumeros)
	Definir i, j, Acumulador Como Entero
	Acumulador=0
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Acumulador=Acumulador+MatrizNumeros[i,j]
			MatrizNumeros[i,5]=Acumulador
		Fin Para
		Acumulador=0
	Fin Para
FinSubProceso
SubProceso VentasDelDia(MatrizNumeros)
	Definir i, j, Acumulador Como Entero
	Acumulador=0
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Acumulador=Acumulador+MatrizNumeros[j,i]
			MatrizNumeros[5,i]=Acumulador
		Fin Para
		Acumulador=0
	Fin Para
FinSubProceso
SubProceso ProductoMasVendidoSemanal(MatrizNumeros)
	Definir i, j, MasVendidoSemanal Como Entero
	MasVendidoSemanal=0
	Para j=5 Hasta 5 Con Paso 1 Hacer
		Para i=0 Hasta 4 Con Paso 1 Hacer
			Si MatrizNumeros[i,j]>MasVendidoSemanal Entonces
				MasVendidoSemanal=MatrizNumeros[i,j]
			FinSi
		Fin Para
	Fin Para
	Para j=5 Hasta 5 Con Paso 1 Hacer
		Para i=0 Hasta 4 Con Paso 1 Hacer
			Si MasVendidoSemanal==MatrizNumeros[i,j] Entonces
				//Escribir "El más vendido de toda la semana es el producto ", i+1, "."
			FinSi
		Fin Para
	Fin Para
FinSubProceso
SubProceso ProductoMasVendido (MatrizNumeros,Producto)
	Definir i, j, MasVendido, MasVendido2, Aux2, ValorMax Como Entero
	Definir Dia, Aux, Aux3 Como Caracter
	Dimension MasVendido[5], MasVendido2[5]
	Para i=0 Hasta 4 Con Paso 1 Hacer
		MasVendido[i]=0
	Fin Para
	Para i=0 Hasta 4 Con Paso 1 Hacer
		MasVendido2[i]=0
	Fin Para
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Producto[i]=" "
	Fin Para
	MatrizNumeros[5,5]=0
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Si MatrizNumeros[i,j]>=MasVendido[i] Entonces
				MasVendido[i]=MatrizNumeros[i,j]
			FinSi
		Fin Para
	Fin Para
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Si MatrizNumeros[j,i]>=MasVendido2[i] Entonces
				MasVendido2[i]=MatrizNumeros[j,i]
			FinSi
		Fin Para
	Fin Para
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Si MatrizNumeros[j,i]==MasVendido2[i] Entonces
				Aux2=(j+1)
				Aux=ConvertirATexto(aux2)
				Aux3=Concatenar("Producto",Aux)
				Producto[i]=Aux3
			Fin Si
		Fin Para
	Fin Para
	ValorMax=0
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Si MasVendido[i]>ValorMax Entonces
			ValorMax=MasVendido[i]
		FinSi 
	Fin Para
	Para i=0 Hasta 4 Con Paso 1 Hacer
		Para j=0 Hasta 4 Con Paso 1 Hacer
			Si ValorMax==MatrizNumeros[i,j] Entonces
				Segun j Hacer
					0:
						Dia="Lunes"
					1:
						Dia="Martes"
					2:
						Dia="Miercoles"
					3:
						Dia="Jueves"
					4:
						Dia="Viernes"
				Fin Segun
				Escribir "El más vendido es el producto ", i+1, ", el dia ", Dia, " con un total de ", MatrizNumeros[i,j], " ventas."
			FinSi
		Fin Para
	Fin Para
FinSubProceso
SubProceso MostrarMatriz(MatrizNumeros)
	Definir i, j Como Entero
	Para i=0 Hasta 5 Con Paso 1 Hacer
		Para j=0 Hasta 5 Con Paso 1 Hacer
			Escribir Sin Saltar MatrizNumeros[i,j], " "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso
SubProceso ConvertirATablaGeneral(MatrizNumeros, TablaFinal, Producto)
	Definir i, j Como Entero
	TablaFinal[0,0]=" "
	TablaFinal[1,0]="/Producto 1/"
	TablaFinal[2,0]="/Producto 2/"
	TablaFinal[3,0]="/Producto 3/"
	TablaFinal[4,0]="/Producto 4/"
	TablaFinal[5,0]="/Producto 5/"
	TablaFinal[6,0]="/Total Semana/"
	TablaFinal[7,0]="/Producto Más Vendido/"
	TablaFinal[0,1]="/Lunes/"
	TablaFinal[0,2]="/Martes/"
	TablaFinal[0,3]="/Miercoles/"
	TablaFinal[0,4]="/Jueves/"
	TablaFinal[0,5]="/Viernes/"
	TablaFinal[0,6]="/Total Producto/"
	Para i=0 Hasta 5 Con Paso 1 Hacer
		Para j=0 Hasta 5 Con Paso 1 Hacer
			TablaFinal[i+1,j+1]=ConvertirATexto(MatrizNumeros[i,j])
		Fin Para
	Fin Para
	Para i=7 Hasta 7 Con Paso 1 Hacer
		Para j=1 Hasta 5 Con Paso 1 Hacer
			TablaFinal[i,j]=Producto[j-1]
		FinPara
	FinPara
	TablaFinal[7,6]=" "
FinSubProceso
SubProceso MostrarTabla(TablaFinal)
	Definir i, j Como Entero
	Para i=0 Hasta 7 Con Paso 1 Hacer
		Para j=0 Hasta 6 Con Paso 1 Hacer
			Escribir Sin Saltar TablaFinal[i,j], " "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso