Algoritmo calendario2
	Definir numDeDia Como Entero;
	Definir numDeMes Como Entero;
	Definir numDelDiaTotal Como Entero;
	Definir textoDelMes Como Caracter;
	Definir acumulador Como Logico;
	Definir nombreDelMes Como Caracter;
	
	acumulador = falso;
	
	Escribir "Escriba el Dia";
	Leer numDeDia;
		
	Escribir "Escribir el numero del mes";
	Leer numDeMes;
	
	Si numDeMes == 2 && numDeDia<=29 && numDeDia >= 1 Entonces
		acumulador = verdadero;
	FinSi
	
	Si numDeMes == 1 || numDeMes == 3 || numDeMes == 5 || numDeMes == 7 || numDeMes == 8 || numDeMes == 10 || numDeMes == 12 Entonces
		Si numDeDia <= 31 && numDeDia >= 1  Entonces
			acumulador = verdadero;
		FinSi
	FinSi
		
	Si numDeMes == 4 || numDeMes == 6 || numDeMes == 9 || numDeMes == 11 Entonces
		Si numDeDia <= 30 && numDeDia >= 1 Entonces
			acumulador = verdadero;
		FinSi
	FinSi
		
	Segun numDeMes Hacer
	
		1:
			numDelDiaTotal = numDeDia + 0;
			nombreDelMes = "enero";
		2:
			numDelDiaTotal = numDeDia + 29;
			nombreDelMes = "febrero";
		3:
			numDelDiaTotal = numDeDia + 58;
			nombreDelMes = "marzo";
		4:
			numDelDiaTotal = numDeDia + 88;
			nombreDelMes = "abril";
		5:
			numDelDiaTotal = numDeDia + 119;
			nombreDelMes = "mayo";
		6:
			numDelDiaTotal = numDeDia + 149;
			nombreDelMes = "junio";
		7:
			numDelDiaTotal = numDeDia + 180;
			nombreDelMes = "julio";
		8:
			numDelDiaTotal = numDeDia + 211;
			nombreDelMes = "agosto";
		9:
			numDelDiaTotal = numDeDia + 241;
			nombreDelMes = "septiembre";
		10:
			numDelDiaTotal = numDeDia + 272;
			nombreDelMes = "octubre";
		11:
			numDelDiaTotal = numDeDia + 302;
			nombreDelMes = "noviembre";
		12:
			numDelDiaTotal = numDeDia + 334;
			nombreDelMes = "diciembre";				
			
		De Otro Modo:
			Escribir "El mes ingresado es incorrecto";
	FinSegun
	
	Si acumulador Entonces
		Escribir "Es el dia ", numDelDiaTotal, " y el dia esta en el mes de ", nombreDelMes; 
	Sino
		Escribir "Dia Incorrecto";
	FinSi
	
FinAlgoritmo
