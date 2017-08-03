Algoritmo Promedio
	Definir num1 Como Entero;
	Definir Acu Como Entero;
	Definir Cont Como Entero;
	
	Cont = 1;
	Acu = 0;
	
	Mientras Cont < 4 Hacer
		Escribir "Ingrese el numero";
		Leer num1;
		Acu = Acu + num1;
		Cont = Cont + 1;
	FinMientras
	
	//Repetir
		//Escribir "Ingrese el numero";
		//Leer num1;
		//Acu = Acu + num1;
		//Cont = Cont + 1;
	//Hasta Que Cont > 3
	
	Acu = Acu / 3;
	Escribir Acu;
FinAlgoritmo
