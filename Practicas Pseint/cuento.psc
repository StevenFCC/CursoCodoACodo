Algoritmo cuento
	Definir juan Como Caracter;
	Definir pablo Como Caracter;
	Definir marcos Como Caracter;
	Definir matias Como Caracter;
	Definir destino Como Caracter;
	Definir nombreDePersonajeElegido Como Caracter;
	Definir personajeElegido Como Numerico;
	Definir numeroDeDestino Como Numerico;
	Definir finalElegido Como Numerico;
	
	juan = "Juan";
	pablo = "Pablo";
	marcos = "Marcos";
	matias = "Matias";
	
	Escribir "Elija su personaje, segun el numero de personaje, entre:";
	Escribir "1: Juan";
	Escribir "2: Pablo";
	Escribir "3: Marcos";
	Escribir "4: Matias";
	
	Leer personajeElegido;
	
	Si personajeElegido < 1 || personajeElegido > 4 Entonces
		Escribir "Numero de personaje ingresado incorrecto";
	Sino
		Segun personajeElegido Hacer
			1:
				nombreDePersonajeElegido = juan;
			2:
				nombreDePersonajeElegido = pablo;
			3:
				nombreDePersonajeElegido = marcos;
			4:
				nombreDePersonajeElegido = matias;
		FinSegun
		
		Escribir nombreDePersonajeElegido, " decide realizar un viaje eliga el destino del viaje, segun el numero de destino:";
		Escribir "1: Francia";
		Escribir "2: Italia";
		Escribir "3: Inglaterra";
		Escribir "4: Estados Unidos";
		
		Leer numeroDeDestino;
		
		Segun numeroDeDestino Hacer
			1:
				destino = "Francia";
			2:
				destino = "Italia";
			3:
				destino = "Inglaterra";
			4:
				destino = "Estados Unidos";
		FinSegun
		
		Si numeroDeDestino < 1 || numeroDeDestino > 4 Entonces
			Escribir "Numero de destino ingresado incorrecto";
		Sino
			Segun numeroDeDestino Hacer
				1:
					Escribir nombreDePersonajeElegido, " viaja a ", destino;
					Escribir "Decida el final de esta historia, segun el numero de final:";
					Escribir "1: Final normal";
					Escribir "2: Final malo";
					Escribir "3: Final indeciso";
					Leer finalElegido;
				2:
					Escribir nombreDePersonajeElegido, " viaja a ", destino;
					Escribir "Decida el final de esta historia, segun el numero de final:";
					Escribir "1: Final normal";
					Escribir "2: Final malo";
					Escribir "3: Final indeciso";
					Leer finalElegido;
				3:
					Escribir nombreDePersonajeElegido, " viaja a ", destino;
					Escribir "Decida el final de esta historia, segun el numero de final:";
					Escribir "1: Final normal";
					Escribir "2: Final malo";
					Escribir "3: Final indeciso";
					Leer finalElegido;
				4:
					Escribir nombreDePersonajeElegido, " viaja a ", destino;
					Escribir "Decida el final de esta historia, segun el numero de final:";
					Escribir "1: Final normal";
					Escribir "2: Final malo";
					Escribir "3: Final indeciso";
					Leer finalElegido;
			FinSegun
			
			Si finalElegido < 1 || finalElegido > 4 Entonces
				Escribir "Numero de final ingresado incorrecto";
			Sino
				Segun finalElegido Hacer
					1:
						Escribir "El dia del viaje a ", destino, ",", nombreDePersonajeElegido, " se levanta, se prepara y conduce hacia el aeropueto, al cual llega a tiempo para realizar su viaje";
					2:
						Escribir "El dia del viaje a ", destino, ",", nombreDePersonajeElegido, " se queda dormido y llama al aeropuerto para cancelar su viaje";
					3:
						Escribir "El dia del viaje a ", destino, ",", nombreDePersonajeElegido, " se levanta, se prepara y conduce hacia el aeropueto, el trafico hacia el aeropueto esta congestionado y ", nombreDePersonajeElegido, " no sabe si llegara a tiempo para tomar el avion";
				FinSegun
			FinSi
		FinSi
	FinSi
FinAlgoritmo
