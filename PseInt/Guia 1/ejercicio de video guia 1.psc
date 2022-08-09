//Dadas las edades de 3 hermanos, calcular el promedio de edad e imprimir cuales son menores al promedio
//Adem�s calcular si los 3 hermanos tienen la misma edad y si al menos uno es mayor de edad
Algoritmo EstadisticaEdades
	
	Definir edad1, edad2, edad3 Como Entero
	Definir promedio Como Real
	Definir apellido Como Caracter
	Definir iguales, MayorDeEdad Como Logico
	
	Escribir "Ingrese el apellido de la familia y luego las 3 edades de los hermanos"
	Leer apellido
	Leer edad1, edad2, edad3
	
	///Operaciones matem�ticas: permiten realizar c�lculos
	///ej. suma (+), resta (-), multiplicaci�n (*), divisi�n (/), etc.
	///operandos de tipo num�rico y retornan valores num�ricos
	
	promedio = (edad1 + edad2 + edad3) / 3 
	Escribir "El promedio de la familia ", apellido, " es " promedio
	
	///Operaciones relacionales: permiten comparar valores
	///ej. igualdad (=), distinto (<>), mayor que/menor que(>/<), etc.
	///operandos de casi todos los tipos de datos y retornan tipo l�gico
	
	Escribir "Edad 1 (", edad1 ," a�os) menor al promedio? ", edad1 < promedio
	Escribir "Edad 2 (", edad2 ," a�os) menor al promedio? ", edad2 < promedio
	Escribir "Edad 3 (", edad3 ," a�os) menor al promedio? ", edad3 < promedio
	
	///Operaciones L�gicas: nos permiten evaluar decisiones en funci�n de valores de verdad
	///ej. negaci�n (!), conjunci�n o Y l�gica (Y), disyunci�n u O l�gica (O)
	///operandos de tipo l�gico y retornan valores de tipo l�gico
	
	iguales = (edad1 = edad2) Y (edad2 = edad3)
	
	Escribir "Tienen la misma edad? ", iguales
	
	MayorDeEdad = (edad1 >= 18) O (edad2 >= 18) O (edad3 >= 18)
	
	Escribir "Al menos uno es mayor de edad? ", MayorDeEdad	
	
FinAlgoritmo
	