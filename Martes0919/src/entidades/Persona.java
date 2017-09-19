package entidades;

import java.util.Scanner;

public class Persona {
    // Atributos

    private String nombre;
    private int edad;
    private Domicilio domicilio = new Domicilio();

    // Metodos
    public void obtener() {
        System.out.println("Ingrese nombre:");
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        do {
            System.out.println("Ingrese edad:");
            edad = teclado.nextInt();
        } while (edad < 0);
        domicilio.obtener();
    }

    public boolean esMayor() {
        boolean es;
        es = false;
        if (edad > 18) {
            es = true;
        }
        return es;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String n){
        nombre=n;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int e){
        edad=e;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\n" +domicilio.toString();
    }
}
