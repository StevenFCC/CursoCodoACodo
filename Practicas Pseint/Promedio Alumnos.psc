Algoritmo promedioAlumnos
	Definir numAlumnos Como Entero;
	Definir listaEdadAlumnos Como Entero;
	Definir edadAlumno Como Entero;
	Definir acum Como Entero;
	Definir cont Como Entero;
	
	cont = 0;
	acum = 0;
	
	Escribir "Ingrese el numero de alumnos";
	Leer numAlumnos;
	
	Dimension listaEdadAlumnos[numAlumnos];
	
	Para cont = 0 Hasta numAlumnos - 1 Con Paso 1 Hacer
		Escribir "Ingrese edad del alumno";
		Leer listaEdadAlumnos[cont];
	FinPara
	
	Escribir "La cantidad de alumnos ingresados es ", numAlumnos;
	Escribir "Las edades ingresadas son ";
	Para cont = 0 Hasta numAlumnos - 1 Con Paso 1 Hacer
		acum = acum + listaEdadAlumnos[cont];
		Escribir listaEdadAlumnos[cont];
	FinPara
	Escribir "El promedio de edades es ", acum/numAlumnos;
	
FinAlgoritmo