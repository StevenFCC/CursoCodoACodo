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
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    
    public int getLado1() {
        return this.lado1;
    }
    
    public int getLado2() {
        return this.lado2;
    }
    
    public int getLado3() {
        return this.lado3;
    }
    
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    public int ladosMayor() {
        int ladoMayor = lado1;
        
        if (lado1 < lado2) {
            ladoMayor = lado2;
        }
        
        if (lado1 < lado3) {
            ladoMayor = lado3;
        }
        
        return ladoMayor;
    }
    
    public void equiatero() {
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triangulo es equilatero");
        } else {
            System.out.println("El triangulo no es equilatero");
        }
    }
}
