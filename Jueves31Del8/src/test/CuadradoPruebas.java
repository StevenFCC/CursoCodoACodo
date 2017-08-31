/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Cuadrado;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CuadradoPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cuadrado c = new Cuadrado();
        
        System.out.println("Ingrese el tamaño de los lados del cuadrados");
        c.setLados(teclado.nextInt());
        c.perimetro();
        c.superficie();
    }
    
}
