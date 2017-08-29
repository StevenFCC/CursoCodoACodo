/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entidades.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestVehiculo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Prueba de la clase vehiculo");
        Vehiculo veh = new Vehiculo();
        
        System.out.println("Ingrese la marca del vehiculo");
        veh.setMarca(teclado.nextLine());
        veh.setModelo(teclado.nextLine());
        veh.setCombustible(teclado.nextLine());
        veh.setCilindrada(teclado.nextInt());
    }
    
}
