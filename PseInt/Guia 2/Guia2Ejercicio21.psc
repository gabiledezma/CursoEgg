Algoritmo Guia2ejercicio21
	
	//21. Un docente de Programación tiene un listado de 3 notas registradas por cada uno de 
	//sus N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una 
	//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves 
	//de sus estudiantes:
		// .Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante 
			//reprueba el curso si tiene una nota final inferior a 6.5
		// .Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
		// .La mayor nota obtenida en las exposiciones.
		// .Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
	//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno 
	//pedirá las 3 notas y calculará todos informes claves que requiere el docente.
	
	///Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el 
	///ejercicio. No hacer todos al mismo tiempo y después probar.
	
	Definir TPInteg, Expos, Parc, NotaProm, PorcInt, NotaMax, ParcDesapr Como Real
	Definir Alumnos, IntAprob, i Como Entero
	Definir Apellido Como Caracter
	
	IntAprob=0
	NotaMax=0
	ParcDesapr=0
	
	Escribir "Ingrese la cantidad de Alumnos: "
	Leer Alumnos
	
	
Para i=1 Hasta Alumnos Con Paso 1 Hacer
		
	Escribir "Ingrese el Apellido del Alumno"
	Leer Apellido
	
	Escribir "Ingrese la nota del Trabajo Práctico Integrador: "
	Leer TPInteg
	
	Escribir "Ingrese la nota de la Exposición: "
	Leer Expos
	
	Escribir "Ingrese la nota del Parcial: "
	Leer Parc
	
	NotaProm = (TPInteg * 0.35) + (Expos * 0.25) + (Parc * 0.4)
	
	Si NotaProm<6.5 Entonces
		Escribir "El alumno/a: ",Apellido, " Reprobó el Curso, con un promedio de: " NotaProm 
	SiNo
		Escribir "El alumno/a: ",Apellido, " Aprobó el Curso, con un promedio de: " NotaProm
	FinSi
	
	Si TPInteg>=7.5 Entonces
		IntAprob=IntAprob+1
	FinSi
	
	Si Expos>NotaMax
		Notamax=Expos
	FinSi
	
	Si Parc>=4.0 y Parc<7.5
		ParcDesapr=ParcDesapr+1
	FinSi
	
FinPara

	PorcInt=(IntAprob/Alumnos)*100
	
	Escribir "El porcentaje de alumnos que tienen una nota superior a 7.5 en el Integrador es: " PorcInt "%."
	
	Escribir "La mayor nota obtenida en las exposiciones es: ", NotaMax
	
	Escribir ParcDesapr " Estudiantes obtuvieron en el parcial entre 4.0 y 7.5."
	
FinAlgoritmo
