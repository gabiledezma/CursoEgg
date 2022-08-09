Algoritmo Guia3Ejercicios14
	
	//14. Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea 
	//calcular el jornal diario de acuerdo con las siguientes reglas:
		///a) La tarifa de las horas diurnas es de $ 90
		///b) La tarifa de las horas nocturnas es de $ 125
		///c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y 
		///en un 15% si el turno es nocturno.
	//El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, 
	//el día de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. 
	//Además, debemos preguntarle al usuario si el día de la semana (lunes, martes, 
	//miércoles, etc.) era festivo o no, para poder calcular el jornal diario. Utilice una función 
	//para realizar el cálculo.
	
	Definir NombreTrabajador, NombreMayus, Dia, DiaMayus, Festivo, FestivoMayus, InicialFestivo, Turno, TurnoMayus, InicialTurno Como Caracter
	Definir Horastrabajadas Como Real
	Definir DiaEnNumero Como Entero
	Definir DiaLog, FestivoLog, TurnoLog Como Logico
	Escribir "Ingrese el nombre del trabajador:"
	Leer NombreTrabajador
	NombreMayus=Mayusculas(NombreTrabajador)
Hacer
	Escribir "Ingrese el dia de la semana, y luego ingrese si era festivo o no:"
	Leer Dia, Festivo
	DiaMayus=Mayusculas(Dia)
	Segun DiaMayus Hacer
		"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO":
			DiaLog=Verdadero
		De Otro Modo:
			DiaLog=Falso
			Escribir "El dato ingresado NO corresponde a un día."
	Fin Segun
	FestivoMayus=Mayusculas(Festivo)
	InicialFestivo=Subcadena(FestivoMayus,0,0)
	Segun InicialFestivo Hacer
		"S","N":
			FestivoLog=Verdadero
		De Otro Modo:
			FestivoLog=Falso
			Escribir "NO se indicó correctamente si el día era festivo o no lo era. (SI o NO)"
	Fin Segun
Hasta Que DiaLog=Verdadero Y FestivoLog=Verdadero
Hacer	
	Escribir "Ingrese el Turno:"
	Leer Turno
	TurnoMayus=Mayusculas(Turno)
	InicialTurno=Subcadena(TurnoMayus,0,0)
	Segun InicialTurno Hacer
		"D","N":
			TurnoLog=Verdadero
		De Otro Modo:
			TurnoLog=Falso
			Escribir "NO se indicó correctamente si era turno DIURNO o NOCTURNO."
	Fin Segun
Hasta Que TurnoLog=Verdadero
	Escribir "Ingrese la cantidad de Horas trabajadas:"
	Leer Horastrabajadas
	Escribir "El Jornal diario de ", NombreMayus, " es: $", JornalDiario(InicialTurno,InicialFestivo,Horastrabajadas)
FinAlgoritmo
Funcion Resultado<-JornalDiario(InicialTurno,InicialFestivo,Horastrabajadas)
	Definir Resultado, TarifaHoras, TarifaHorasFestivo Como Real
	Si InicialTurno=="N" Entonces
		TarifaHorasFestivo=125*0.15
		TarifaHoras=125
	SiNo
		TarifaHorasFestivo=90*0.1
		TarifaHoras=90
	FinSi
	Si InicialFestivo=="S" Entonces
		Resultado=(TarifaHoras+TarifaHorasFestivo)*Horastrabajadas
	SiNo
		Resultado=TarifaHoras*Horastrabajadas
	FinSi
FinFuncion
	