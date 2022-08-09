Algoritmo Guia3Ejercicios22
	//22. Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha 
	//anterior. Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba 
	//una fecha representada a través de tres enteros dia, mes y anio, y retorne la fecha 
	//anterior. Puede asumir que dia, mes y anio representan una fecha válida. Realice 
	//pruebas de escritorio para los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, 
	//anio=2004
	Definir DiaNum, MesNum, AnioNum Como Entero
	Escribir "Ingrese fecha(dd/mm/aaaa):"
	Leer DiaNum, MesNum, AnioNum
	DiaAnterior(DiaNum, MesNum, AnioNum)
FinAlgoritmo
SubProceso DiaAnterior(DiaNum, MesNum, AnioNum)
	Definir DiaLog, MesLog, AnioLog Como Logico
	Si AnioNum<=2021 Entonces
		AnioLog=Verdadero
	SiNo
		AnioLog=Falso
	FinSi
	Segun MesNum Hacer
		1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
			MesLog=Verdadero
		De Otro Modo:
			MesLog=Falso
	Fin Segun
	Si MesNum==1 Y DiaNum<=31 y DiaNum>=1 Entonces
		DiaLog=Verdadero
	SiNo
		Si MesNum==2 Y DiaNum<=29 y DiaNum>=1 Entonces
			DiaLog=Verdadero
		SiNo
			Si MesNum==3 Y DiaNum<=31 y DiaNum>=1 Entonces
				DiaLog=Verdadero
			SiNo
				Si MesNum==4 Y DiaNum<=30 y DiaNum>=1 Entonces
					DiaLog=Verdadero
				SiNo
					Si MesNum==5 Y DiaNum<=31 y DiaNum>=1 Entonces
						DiaLog=Verdadero
					SiNo
						Si MesNum==6 Y DiaNum<=30 y DiaNum>=1 Entonces
							DiaLog=Verdadero
						SiNo
							Si MesNum==7 Y DiaNum<=31 y DiaNum>=1 Entonces
								DiaLog=Verdadero
							SiNo
								Si MesNum==8 Y DiaNum<=31 y DiaNum>=1 Entonces
									DiaLog=Verdadero
								SiNo
									Si MesNum==9 Y DiaNum<=30 y DiaNum>=1 Entonces
										DiaLog=Verdadero
									SiNo
										Si MesNum==10 Y DiaNum<=31 y DiaNum>=1 Entonces
											DiaLog=Verdadero
										SiNo
											Si MesNum==11 Y DiaNum<=30 y DiaNum>=1 Entonces
												DiaLog=Verdadero
											SiNo
												Si MesNum==12 Y DiaNum<=31 y DiaNum>=1 Entonces
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
		Escribir "La fecha ingresada es ", DiaNum, " del ", MesNum, " de ", AnioNum
	FinSi
	Si DiaLog == Verdadero Y MesLog == Verdadero Y AnioLog == Verdadero Entonces
		Si DiaNum >= 2 Y MesNum >= 2 Entonces
			DiaNum = DiaNum - 1
		SiNo
			Si DiaNum == 1 Y MesNum >= 2 Entonces
				Si MesNum==1 o MesNum==02 o MesNum==04 o MesNum==06 o MesNum==08 o MesNum==09 o MesNum==11 Entonces
					DiaNum=31
				SiNo
					Si MesNum==3 Entonces
						DiaNum=28
					SiNo
						Si MesNum==05 o MesNum==07 o MesNum==10 o MesNum==12  Entonces
							DiaNum=30
						FinSi
					FinSi
				FinSi
				MesNum=MesNum-1
			SiNo
				Si DiaNum == 01 y MesNum == 01 Entonces
					MesNum=12
					DiaNum=31
					AnioNum=AnioNum-1
				FinSi
			FinSi
		FinSi
	FinSi
	Si DiaLog == Verdadero Y MesLog == Verdadero Y AnioLog == Verdadero Entonces
		Escribir "El Dia anterior al escrito es: " DiaNum, " del ", MesNum, " de ", AnioNum
	FinSi
FinSubProceso
	