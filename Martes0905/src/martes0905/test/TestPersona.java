package martes0905.test;

import martes0905.entities.Persona;

public class TestPersona {

    public static void main(String[] args) {
       
        System.out.println("Programa principal----------------");
        System.out.println("**** accedo a objeto mediante metodos getter y setter------");
        // Pruebo clase de persona con getter y setter
        // Creo un objeto 
        Persona alumno11 = new Persona();
        // Ingreso los datos
        alumno11.obtener();
        // Muestro los datos y ya no lo puedo hacer directamente
        // a las variables de instancias
        // Debo acceder a traves de un metodo
        System.out.println("Nombre:" + alumno11.getNombre());
        System.out.println("Edad:" + alumno11.getEdad());
        System.out.println("Datos del objeto alumno11:"+alumno11.toString());
        System.out.println("Datos del objeto alumno11"+alumno11);
    }
}
