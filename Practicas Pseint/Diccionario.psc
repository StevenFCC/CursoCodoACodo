Algoritmo diccionario
	Definir listaIngles, listaCastellano, palabra Como Caracter;
	Definir cont Como Entero;
	Definir error Como Logico;
	
	cont = 0;
	error = Verdadero;
	
	Dimension listaIngles[20];
	Dimension listaCastellano[20];
	
	listaIngles[0] = "tree";
	listaCastellano[0] = "arbol";
	listaIngles[1] = "pen";
	listaCastellano[1] = "lapicera";
	listaIngles[2] = "book";
	listaCastellano[2] = "libro";
	listaIngles[3] = "men";
	listaCastellano[3] = "hombre";
	listaIngles[4] = "women";
	listaCastellano[4] = "mujer";
	listaIngles[5] = "dog";
	listaCastellano[5] = "perro";
	listaIngles[6] = "cat";
	listaCastellano[6] = "gato";
	listaIngles[7] = "bird";
	listaCastellano[7] = "pajaro";
	listaIngles[8] = "bed";
	listaCastellano[8] = "cama";
	listaIngles[9] = "bedroom";
	listaCastellano[9] = "habitacion";
	listaIngles[10] = "house";
	listaCastellano[10] = "casa";
	listaIngles[11] = "is";
	listaCastellano[11] = "es";
	listaIngles[12] = "are";
	listaCastellano[12] = "son";
	listaIngles[13] = "place";
	listaCastellano[13] = "lugar";
	listaIngles[14] = "phone";
	listaCastellano[14] = "celular";
	listaIngles[15] = "car";
	listaCastellano[15] = "auto";
	listaIngles[16] = "read";
	listaCastellano[16] = "leer";
	listaIngles[17] = "run";
	listaCastellano[17] = "correr";
	listaIngles[18] = "mirror";
	listaCastellano[18] = "espejo";
	listaIngles[19] = "door";
	listaCastellano[19] = "puerta";
	
	Escribir "Las palabras a traducir disponibles son";
	Para cont = 0 Hasta 19 Con Paso 1 Hacer
		Escribir listaCastellano[cont];
	FinPara
	
	Escribir "Ingrese la palabra a traducir";
	Leer palabra;
	
	Repetir
		Para cont = 0 Hasta 19 Con Paso 1 Hacer
			Si palabra == listaCastellano[cont] Entonces
				Escribir "La traduccion de la palabra ", palabra, " al ingles es ``", listaIngles[cont], "´´";
				error = Falso;
			FinSi
		FinPara
		Si error Entonces
			Escribir "La palabra ingresada no se encuentra en el diccionario o es incorrecta";
		FinSi
		Si palabra != "salir" Entonces
			Escribir "";
			Escribir "Ingrese la palabra a traducir, si desea salir escriba ``salir´´";
			Leer palabra;
		FinSi
		error = Verdadero;
	Hasta Que palabra == "salir";
FinAlgoritmo