Algoritmo diccionario
	Definir listaDiccionrio, palabra Como Caracter;
	Definir cont Como Entero;
	Definir error Como Logico;
	
	cont = 0;
	error = Verdadero;
	
	Dimension listaDiccionrio[20,20];
	
	listaDiccionrio[0,0] = "tree";
	listaDiccionrio[0,1] = "arbol";
	listaDiccionrio[1,0] = "pen";
	listaDiccionrio[1,1] = "lapicera";
	listaDiccionrio[2,0] = "book";
	listaDiccionrio[2,1] = "libro";
	listaDiccionrio[3,0] = "men";
	listaDiccionrio[3,1] = "hombre";
	listaDiccionrio[4,0] = "women";
	listaDiccionrio[4,1] = "mujer";
	listaDiccionrio[5,0] = "dog";
	listaDiccionrio[5,1] = "perro";
	listaDiccionrio[6,0] = "cat";
	listaDiccionrio[6,1] = "gato";
	listaDiccionrio[7,0] = "bird";
	listaDiccionrio[7,1] = "pajaro";
	listaDiccionrio[8,0] = "bed";
	listaDiccionrio[8,1] = "cama";
	listaDiccionrio[9,0] = "bedroom";
	listaDiccionrio[9,1] = "habitacion";
	listaDiccionrio[10,0] = "house";
	listaDiccionrio[10,1] = "casa";
	listaDiccionrio[11,0] = "is";
	listaDiccionrio[11,1] = "es";
	listaDiccionrio[12,0] = "are";
	listaDiccionrio[12,1] = "son";
	listaDiccionrio[13,0] = "place";
	listaDiccionrio[13,1] = "lugar";
	listaDiccionrio[14,0] = "phone";
	listaDiccionrio[14,1] = "celular";
	listaDiccionrio[15,0] = "car";
	listaDiccionrio[15,1] = "auto";
	listaDiccionrio[16,0] = "read";
	listaDiccionrio[16,1] = "leer";
	listaDiccionrio[17,0] = "run";
	listaDiccionrio[17,1] = "correr";
	listaDiccionrio[18,0] = "mirror";
	listaDiccionrio[18,1] = "espejo";
	listaDiccionrio[19,0] = "door";
	listaDiccionrio[19,1] = "puerta";
	
	Escribir "Las palabras a traducir disponibles son";
	Para cont = 0 Hasta 19 Con Paso 1 Hacer
		Escribir listaDiccionrio[cont,1];
	FinPara
	
	Escribir "Ingrese la palabra a traducir";
	Leer palabra;
	
	Repetir
		Para cont = 0 Hasta 19 Con Paso 1 Hacer
			Si palabra == listaDiccionrio[cont,1] Entonces
				Escribir "La traduccion de la palabra ", palabra, " al ingles es ``", listaDiccionrio[cont,0], "´´";
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