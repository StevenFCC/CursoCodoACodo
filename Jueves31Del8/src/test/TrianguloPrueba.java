/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TrianguloPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Triangulo t = new Triangulo();
        
        System.out.println("Ingrese el primer lado del triangulo");
        t.setLado1(teclado.nextInt());
        
        System.out.println("Ingrese el segundo lado del triangulo");
        t.setLado2(teclado.nextInt());
        
        System.out.println("Ingrese el tercer lado del triangulo");
        t.setLado3(teclado.nextInt());
        
        System.out.println("El lado mayor es el que mide: " + t.ladosMayor());
        t.equiatero();
    }
}
