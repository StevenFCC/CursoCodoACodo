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
public class Martillo {
    
    protected int precio;
    protected String material;
    
    public void info() {
        System.out.println("Soy un Martillo");
    }
    
    public void golpear(String fuerza) {
        System.out.println("Golpeo" + fuerza);
    }
}
