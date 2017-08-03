Algoritmo calendario
	Definir numDeDia Como Entero;
	Definir numDeMes Como Entero;
	Definir numDelDiaTotal Como Entero;
	Definir textoDelMes Como Caracter;
	
	Escribir "Escriba el Dia";
	Leer numDeDia;
	
	Si numDeDia >= 1 && numDeDia <= 31 Entonces
		
		Escribir "Escribir el numero del mes";
		Leer numDeMes;
		
		Segun numDeMes Hacer
			
			1:
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 0;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
			2:
				Si numDeDia < 30  Entonces
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 29;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
				Sino
					Escribir "Dia Incorrecto";
				FinSi
			3:
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 58;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
			4:
				Si numDeDia < 31 Entonces
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 88;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
				Sino
					Escribir "Dia Incorrecto";
				FinSi
			5:
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 119;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
			6:
				Si numDeDia < 31 Entonces
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 149;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
				Sino
					Escribir "Dia Incorrecto";
				FinSi
			7:
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 180;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
			8:
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 211;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
			9:
				Si numDeDia < 31 Entonces
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 241;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
				Sino
					Escribir "Dia Incorrecto";
				FinSi
			10:
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 272;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
			11:
				Si numDeDia < 31 Entonces
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 302;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
				Sino
					Escribir "Dia Incorrecto";
				FinSi
			12:
				textoDelMes = "Es el dia ";
				numDelDiaTotal = numDeDia + 333;
				Escribir  textoDelMes, numDelDiaTotal, " del año";
				
			De Otro Modo:
				Escribir "El mes ingresado es incorrecto, vuelva a escribirlo";
		FinSegun
	Sino
		Escribir "Dia Incorrecto";
	FinSi
FinAlgoritmo
