Algoritmo listaInversa
	Definir cont, list Como Entero;
	
	Dimension list[10];
	
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese valor del numero ", cont + 1;
		//Leer list[cont];
		list[cont] = Azar(100);
		Escribir list[cont];
	FinPara
	
	Para cont = 9 Hasta 0 Con Paso -1 Hacer
		Escribir list[cont];
	FinPara
FinAlgoritmo
