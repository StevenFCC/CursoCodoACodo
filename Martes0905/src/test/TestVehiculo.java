/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Vehiculo;

/**
 *
 * @author Admin
 */
public class TestVehiculo {
    public static void main(String[] arg) {
        System.out.println("Prueba de la clase vehiculo");
        
        Vehiculo veh = new Vehiculo();
        veh.setMarca("Ford");
        veh.setModelo("....");
        veh.setCombustible("80 Litros");
        veh.setCilindrada(400);
        
        System.out.println(veh.getMarca());
        System.out.println(veh.getModelo());
        System.out.println(veh.getConbustible());
        System.out.println(veh.getCilindrada());
        
        veh.arrancar();
        System.out.println(veh.acelerar());
        System.out.println(veh.frenar());
        veh.apagar();
    }
}
