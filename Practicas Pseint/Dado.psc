Algoritmo dado
	Definir numObtenido Como Entero;
	Definir listaNumeros Como Caracter;
	Definir listaNumeros2 Como Entero;
	Definir cont Como Entero;
	
	Dimension listaNumeros[6];
	listaNumeros[0] = "Uno";
	listaNumeros[1] = "Dos";
	listaNumeros[2] = "Tres";
	listaNumeros[3] = "Cuatro";
	listaNumeros[4] = "Cinco";
	listaNumeros[5] = "Seis";
	
	Dimension listaNumeros2[6];
	listaNumeros2[0] = 1;
	listaNumeros2[1] = 2;
	listaNumeros2[2] = 3;
	listaNumeros2[3] = 4;
	listaNumeros2[4] = 5;
	listaNumeros2[5] = 6;
	
	Escribir "Ingrese numero obtenido";
	Leer numObtenido;
	
	
	Si numObtenido > 0 & numObtenido < 7 Entonces
		Para cont = 0 Hasta 5 Con Paso 1 Hacer			
			Si (numObtenido + listaNumeros2[cont]) == 7 Entonces
				Escribir listaNumeros[cont];
			FinSi
		FinPara
	Sino
		Escribir "Numero incorrecto";
	FinSi
FinAlgoritmo
