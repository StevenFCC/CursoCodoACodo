/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteJava.poo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Persona {
    protected String nombre;
    protected int edad;
    
    Scanner teclado = new Scanner(System.in);
    
    public String getNombre() {
    return nombre;
    }
    
    public void obtener() {
        String nombreIngresado;
        int edad;
        
        System.out.println("Ingrese nombre");
        nombreIngresado = teclado.nextLine();
        
        do {
            System.out.println("Ingrese edad");
            edad = teclado.nextInt();
        } while(edad < 0);
    }
    
    public boolean esMayor() {
        boolean es = false;
        if (edad > 18) {
            es = true;
        }
        return es;
    }
    
    
}
