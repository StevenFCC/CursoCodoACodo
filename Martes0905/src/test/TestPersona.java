package test;

import entities.Persona;

public class TestPersona {

    public static void main(String[] args) {
       
        System.out.println("Programa principal----------------");
        System.out.println("**** accedo a objeto mediante metodos getter y setter------");
        // Pruebo clase de persona con getter y setter
        // Creo un objeto 
        Persona persona1 = new Persona();
        // Ingreso los datos
        persona1.obtener();
        // Muestro los datos y ya no lo puedo hacer directamente
        // a las variables de instancias
        // Debo acceder a traves de un metodo
        System.out.println("Nombre:" + persona1.getNombre());
        System.out.println("Edad:" + persona1.getEdad());
        System.out.println("Datos del objeto alumno11 : "+persona1.toString());
        System.out.println("Datos del objeto alumno11 : "+persona1);
    }
}
