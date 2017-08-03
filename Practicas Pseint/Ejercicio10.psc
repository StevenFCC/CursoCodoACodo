Algoritmo ejercicio
	Definir prome Como Entero;
	Definir acumulador Como Entero;
	Definir cont Como Entero;
	Definir promFinal Como Real;
	acumulador = 0;
	
	Para cont = 1 Hasta 10 Con Paso 1 Hacer
		Escribir "Ingrese el promedio";
		Leer prome;
		acumulador = acumulador + prome;
		promFinal = acumulador / cont;
	FinPara
	
	Escribir promFinal;
FinAlgoritmo
