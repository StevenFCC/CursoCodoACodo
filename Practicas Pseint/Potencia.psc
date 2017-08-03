Algoritmo potencias
	Definir listaDeNum Como Entero;
	Definir listaDeNum2 Como Entero;
	Definir listaDeNum3 Como Entero;
	Definir cont Como Entero;
	
	Dimension listaDeNum2[10];
	Dimension listaDeNum3[10];
	
	Escribir "Los numeros son";

	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		listaDeNum2[cont] = (cont + 1) ^ 2;
		listaDeNum3[cont] = (cont + 1) ^ 3;
		Escribir cont + 1;
	FinPara
	
	Escribir "Numero   Cuadrado   Cubo";
	
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		Escribir cont + 1, "        ", listaDeNum2[cont], "          ", listaDeNum3[cont];
	FinPara
FinAlgoritmo
