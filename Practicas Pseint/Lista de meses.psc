Algoritmo listaDeMeses
	Definir cont Como Entero;
	Definir mes Como Caracter;
	Definir meses Como Caracter;
	
	Dimension meses[12];
	
	Para cont = 0 Hasta 11 Con Paso 1 Hacer
		Escribir "Ingrese el mes numero ", (cont + 1);
		Leer mes;
		Segun cont Hacer
			0:
				Si mes == "Enero" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio incorrecto";
				FinSi
			1:
				Si mes == "Febrero" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio incorrecto";
				FinSi
			2:
				Si mes == "Marzo" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio incorrecto";
				FinSi
			3:
				Si mes == "Abril" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio incorrecto";
				FinSi
			4:
				Si mes == "Mayo" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio incorrecto";
				FinSi
			5:
				Si mes == "Junio" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio incorrecto";
				FinSi
			6:
				Si mes == "Julio" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio incorrecto";
				FinSi
			7:
				Si mes == "Agosto" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio incorrecto";
				FinSi
			8:
				Si mes == "Septiembre" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio  incorrecto";
				FinSi
			9:
				Si mes == "Octubre" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio  incorrecto";
				FinSi
			10:
				Si mes == "Noviembre" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio  incorrecto";
				FinSi
			11:
				Si mes == "Diciembre" Entonces
					meses[cont] = mes;
				Sino
					Escribir "El nombre del mes es incorrecto";
					Escribir "Recuerde escribir el nombre en mayusculas";
					meses[cont] = "Mes ingresado al principio  incorrecto";
				FinSi
		FinSegun
		
		
	FinPara
	
	Para cont = 0 Hasta 11 Con Paso 1 Hacer
		Escribir "El mes numero ", (cont + 1) , " es ", meses[cont];
	FinPara
FinAlgoritmo