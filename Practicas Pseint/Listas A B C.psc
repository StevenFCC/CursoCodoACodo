Algoritmo listasABC
	Definir A, B, C, cont Como Entero;
	
	Dimension A[10];
	Dimension B[10];
	Dimension C[10];
	
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese el valor del numero ", cont + 1, " de la lista A";
		//Leer A[cont];
		A[cont] = Azar(100);
		Escribir "Ingrese el valor del numero ", cont + 1, " de la lista B";
		//Leer B[cont];
		B[cont] = Azar(100);
	FinPara
	
	Escribir "Lista A     Lista B     Lista C";
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		C[cont] = A[cont] + B[cont];
		Escribir A[cont], "          ", B[cont], "          ", C[cont];
	FinPara
FinAlgoritmo
