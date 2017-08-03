Algoritmo vocal
	Definir letra Como Caracter;
	Definir abecedario Como Caracter;
	Definir vocall Como Caracter;
	Definir cont Como Entero;
	Definir acu Como Logico;
	Definir acu1 Como Logico;
	
	Dimension vocall[10];
	
	vocall[0] = "a";
	vocall[1] = "e";
	vocall[2] = "i";
	vocall[3] = "o";
	vocall[4] = "u";
	vocall[5] = "A";
	vocall[6] = "E";
	vocall[7] = "I";
	vocall[8] = "O";
	vocall[9] = "U";
	
	Escribir "Ingrese letra";
	Leer letra;
	
	acu = Falso;
	acu1 = Falso;
	
	Para cont = 0 Hasta 4 Con Paso 1 Hacer
		Si vocall[cont] == letra Entonces
			acu = Verdadero;
		Sino
			Para cont = 5 Hasta 9 Con Paso 1 Hacer
				Si vocall[cont] == letra Entonces
					acu1= Verdadero;
				FinSi
			FinPara
		FinSi
	FinPara
	
	Si acu Entonces
		Escribir "Es vocal";
	Sino
		Si acu1 Entonces
			Escribir "Es una vocal en mayuscula";
		Sino
			Escribir "No es vocal";
		FinSi
	FinSi
FinAlgoritmo
