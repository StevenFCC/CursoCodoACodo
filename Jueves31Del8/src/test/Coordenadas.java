/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.PuntoEnElPlano;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Coordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntoEnElPlano p = new PuntoEnElPlano();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas en X");
        p.setPuntoX(teclado.nextInt());
        System.out.println("Ingrese las coordenadas en Y");
        p.setPuntoY(teclado.nextInt());
        p.ubicacionEnElCuadrante();
    }
    
}
