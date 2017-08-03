Algoritmo arbol
	Definir cont Como Entero;
	Definir cantidadDeLineas, numeroDeEspacio, numeroDeCaracteres, contDos, contTres Como Entero;
	
	cantidadDeLineas = 0;
	
	Escribir "Ingrese la cantidad de lineas";
	Leer cantidadDeLineas;
	
	numeroDeEspacio = cantidadDeLineas;
	numeroDeCaracteres = 1;
	
	Para cont = 1 Hasta cantidadDeLineas Con Paso 1 Hacer
		Para contDos = numeroDeEspacio Hasta 0 Con Paso -1 Hacer
			espacio(contDos);
			asterisco(numeroDeCaracteres);
			numeroDeCaracteres = numeroDeCaracteres + 2;
		FinPara
		
//		Para contTres = numeroDeCaracteres Hasta cantidadDeLineas * 3 Con Paso 3 Hacer
//			asterisco(contTres);
//		FinPara
		
		Escribir "";
	FinPara
FinAlgoritmo

Funcion espacio(cantEspacios)
	Definir cont Como Entero;
	
	Para cont = cantEspacios Hasta 0 Con Paso -1 Hacer
		Escribir Sin Saltar " ";
	FinPara
FinFuncion

Funcion asterisco(cantDeCaracteres)
	Definir cont Como Entero;
	Para cont = 1 Hasta cantDeCaracteres Con Paso 1 Hacer
		Escribir Sin Saltar "*";
	FinPara
FinFuncion

