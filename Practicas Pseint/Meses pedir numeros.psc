Algoritmo mesesPedirNumero
		Definir cont Como Entero;
		Definir mes Como Entero;
		Definir meses Como Caracter;
		
		Dimension meses[12];
		
		meses[0] = "Enero";
		meses[1] = "Febrero";
		meses[2] = "Marzo";
		meses[3] = "Abril";
		meses[4] = "Mayo";
		meses[5] = "Junio";
		meses[6] = "Julio";
		meses[7] = "Agosto";
		meses[8] = "Septiembre";
		meses[9] = "Octubre";
		meses[10] = "Noviembre";
		meses[11] = "Diciembre";
		
		Escribir "Ingrese numero del mes";
		Leer mes;
		
		Escribir meses[mes-1];
FinAlgoritmo
