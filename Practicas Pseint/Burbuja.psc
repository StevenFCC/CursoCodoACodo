Algoritmo burbuja
	Definir xuno, xdos, lista, cont, memoria Como Entero;
	Definir boolean Como Logico;
	
	xuno = 0;
	xdos = 0;
	cont = 0;
	boolean = Falso;
	
	Dimension lista[10];
	
	Para cont = 0 Hasta 9 Hacer
		lista(cont) = azar(1000);
		Escribir lista(cont);
	FinPara
	
	Escribir "";
	
	Mientras !boolean Hacer
		boolean = Verdadero;
		
		Para xdos = 0 Hasta 8 Hacer
			Si lista(xdos) > lista(xdos + 1) Entonces
				memoria = lista(xdos);
				lista(xdos) = lista(xdos + 1);
				lista(xdos + 1) = memoria;
				boolean = Falso;
			FinSi
		FinPara
	FinMientras
	
	Para cont = 0 Hasta 9 Hacer
		Escribir lista(cont);
	FinPara
	
FinAlgoritmo
