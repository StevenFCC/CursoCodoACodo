/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 *
 * @author Admin
 */
public class DemoMetodoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la POO");
        
        Martillo obj = new Martillo();
        
        obj.info();
        obj.golpear("fuerte");
        
        Martillo martillo1 = new Martillo();
        
        System.out.println("El precio del martillo es: " + martillo1.precio);
        System.out.println("El material del martillo es: " + martillo1.material);
        
        martillo1.precio = 150;
        martillo1.material = "Acero";
        
        Martillo martillo2 = new Martillo();
        
        
    }
}
