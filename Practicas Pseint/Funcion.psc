Algoritmo funciones
	Definir cont, numDeCaracteres, numDeLineas Como Entero;
	Definir caracte Como Caracter;
	
	Escribir "Ingrese caracter para subrayar";
	Leer caracte;
	
	Escribir "Ingrese cantidad de caracteres a escribir";
	Leer numDeCaracteres;
	
	Escribir "Ingrese cantidad de lineas";
	Leer numDeLineas;
	
	escribirLineas(caracte, numDeCaracteres, numDeLineas);
FinAlgoritmo

Funcion escribirLineas(caracte, numDeCaracteres, numDeLineas)
	Definir cont Como Entero;
	Definir contador Como Entero;
	
	cont = 0;
	contador = 0;
	
	Para contador = 1 Hasta numDeLineas Con Paso 1 Hacer
		Escribir contador, "° Linea";
		
		Para cont = 1 Hasta numDeCaracteres Con Paso 1 Hacer
			Escribir Sin Saltar caracte;
		FinPara
		
		Escribir "";
	FinPara
FinFuncion
