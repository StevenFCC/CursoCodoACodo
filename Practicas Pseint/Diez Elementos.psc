Algoritmo diezElementos
	Definir listaElementos Como Entero;
	Definir cont, contador, numMayor, posicion, acumulador, numDeLista, posicion2 Como Entero;
	
	cont = 0;
	contador = 0;
	numMayor = 0;
	posicion = 0;
	
	Dimension listaElementos[10];
	
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		listaElementos[cont] = azar(100);
		Escribir listaElementos[cont];
	FinPara
	
	numMayor = listaElementos[0];
	
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		Si numMayor < listaElementos[cont] Entonces
			numMayor = listaElementos[cont];
			posicion = cont;
		FinSi
	FinPara
	
	Escribir "El valor del elemento mas grande es ", numMayor;
	Escribir "Su posicion en la lista es la numero ", posicion + 1;
	
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		Si numMayor == listaElementos[cont] Entonces
			acumulador = listaElementos[cont];
			numDeLista = cont;
			listaElementos[cont] = 0;
			numMayor = 0;
		FinSi
	FinPara
	
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		Si numMayor < listaElementos[cont] Entonces
			numMayor = listaElementos[cont];
			posicion2 = cont;
		FinSi
	FinPara
	
	listaElementos[numDeLista] = acumulador;
	
	Escribir "El valor del segundo elemento mas grande es ", numMayor;
	Escribir "Su posicion en la lista es la numero ", posicion2 + 1;
FinAlgoritmo