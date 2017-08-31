/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Admin
 */
public class Cuadrado {
    private int lados;

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    
    public void perimetro() {
        System.out.println("El perimetro del cuadrado es: " + lados * 4);
    }
    
    public void superficie() {
        System.out.println("La superficie del cuadrado es: " + lados * lados);
    }
}
