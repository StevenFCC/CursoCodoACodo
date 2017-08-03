Algoritmo suma10
	Definir numIngre Como Entero;
	Definir sumaDeNum Como Entero;
	Definir cont Como Entero;
	Definir listaNum Como Entero;
	
	Dimension listaNum[10];
	sumaDeNum = 0;
	
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese numero ", cont + 1;
		Leer numIngre;
		listaNum[cont] = numIngre;
		sumaDeNum = sumaDeNum + numIngre;
	FinPara
	
	Escribir sumaDeNum;
	Escribir "Los numeros de la lista son:";
	Para cont = 0 Hasta 9 Con Paso 1 Hacer
		Escribir listaNum[cont];
	FinPara
FinAlgoritmo
