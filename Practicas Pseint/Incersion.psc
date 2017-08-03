Algoritmo incersion
	Definir lista, x, cont, contDos Como Entero;
	
	Dimension lista(10);
	
	Para cont = 0 Hasta 9 Hacer
		//Leer lista(cont);
		lista(cont) = Azar(1000);
		Escribir lista(cont);
	FinPara
	
	Escribir "";
	
	Para cont = 0 Hasta 8 Hacer
		Si (lista(cont) > lista(cont + 1)) & (cont = 0 || cont = 1) Entonces
			x = lista(cont + 1);
			lista(cont + 1) = lista(cont);
			lista(cont) = x;
			
		Sino
			Para contDos = cont + 1 Hasta 1 Con Paso -1 Hacer
				Si lista(contDos) < lista(contDos - 1) Entonces
					x = lista(contDos - 1);
					lista(contDos - 1) = lista(contDos);
					lista(contDos) = x;
				FinSi
			FinPara
		FinSi
	FinPara
	
	Para cont = 0 Hasta 9 Hacer
		Escribir lista(cont);
	FinPara
		
	
FinAlgoritmo
