Algoritmo Guia2EjerciciosExtra6
	
	//6. Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha 
	//válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es 
	//válida se debe imprimir la fecha cambiando el número que representa el mes por su 
	//nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006". 
	
	Definir Dia, NumMes, Anio Como Entero
	Definir Mes Como Caracter
	Definir AnioLog, MesLog, DiaLog Como Logico
	
	Escribir "Ingrese una fecha (primero el dia, después el mes y seguido el año):"
	Leer Dia, NumMes, Anio
	
	Si Anio<=2021 Entonces
		AnioLog=Verdadero
	SiNo
		AnioLog=Falso
		
	FinSi
	Segun NumMes Hacer
		1:
			Mes="Enero"
			MesLog=Verdadero
		2:
			Mes="Febrero"
			MesLog=Verdadero
		3:
			Mes="Marzo"
			MesLog=Verdadero
		4:
			Mes="Abril"
			MesLog=Verdadero
		5:
			Mes="Mayo"
			MesLog=Verdadero
		6:
			Mes="Junio"
			MesLog=Verdadero
		7:
			Mes="Julio"
			MesLog=Verdadero
		8:
			Mes="Agosto"
			MesLog=Verdadero
		9:
			Mes="Septiembre"
			MesLog=Verdadero
		10:
			Mes="Octubre"
			MesLog=Verdadero
		11:
			Mes="Noviembre"
			MesLog=Verdadero
		12:
			Mes="Diciembre"
			MesLog=Verdadero
			
		De Otro Modo:
			MesLog=Falso
	Fin Segun
	Si Mes=="Enero" Y Dia<=31 y Dia>=1 Entonces
		DiaLog=Verdadero
		
	SiNo
		Si Mes=="Febrero" Y Dia<=29 y Dia>=1 Entonces
			DiaLog=Verdadero
		SiNo
			Si Mes=="Marzo" Y Dia<=31 y Dia>=1 Entonces
				DiaLog=Verdadero
			SiNo
				Si Mes=="Abril" Y Dia<=30 y Dia>=1 Entonces
					DiaLog=Verdadero
				SiNo
					Si Mes=="Mayo" Y Dia<=31 y Dia>=1 Entonces
						DiaLog=Verdadero
					SiNo
						Si Mes=="Junio" Y Dia<=30 y Dia>=1 Entonces
							DiaLog=Verdadero
						SiNo
							Si Mes=="Julio" Y Dia<=31 y Dia>=1 Entonces
								DiaLog=Verdadero
							SiNo
								Si Mes=="Agosto" Y Dia<=31 y Dia>=1 Entonces
									DiaLog=Verdadero
								SiNo
									Si Mes=="Septiembre" Y Dia<=30 y Dia>=1 Entonces
										DiaLog=Verdadero
									SiNo
										Si Mes=="Octubre" Y Dia<=31 y Dia>=1 Entonces
											DiaLog=Verdadero
										SiNo
											Si Mes=="Noviembre" Y Dia<=30 y Dia>=1 Entonces
												DiaLog=Verdadero
											SiNo
												Si Mes=="Diciembre" Y Dia<=31 y Dia>=1 Entonces
													DiaLog=Verdadero
												SiNo
													DiaLog=Falso
												FinSi
											FinSi
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
		
	Si DiaLog==Falso o MesLog==Falso o AnioLog==Falso Entonces
		Escribir "La fecha ingresada no es válida."
	SiNo
		Escribir "La fecha ingresada es ", Dia, " de ", Mes, " de ", Anio
	FinSi
	
FinAlgoritmo
