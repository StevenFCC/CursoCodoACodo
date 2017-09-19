/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entidades.Auto;
/**
 *
 * @author Admin
 */
public class TestVehiculo {
    public static void main(String[] arg) {
//        System.out.println("Prueba de la clase vehiculo");
//        
//        Vehiculo veh = new Vehiculo("Ford", "ASD 123", 2000, (float) 250);
//        
//        System.out.println(veh.getAnnoDeFabricacion());
//        System.out.println(veh.getFabricante());
//        System.out.println(veh.getMatricula());
//        System.out.println(veh.getVelocidadMaxima());
//        
//        veh.arrancar();
//        veh.acelerar((double) 88);
//        veh.frenar((double) 44.5);
//        veh.apagar();
//        System.out.println(veh.toString());

        System.out.println("Prueba clase Auto");
          
        Auto a = new Auto("Ford", "asdqwe123", 2000, 180, "Ka", "AS12345");
        System.out.println(a.toString());
        a.arrancar();
        a.acelerar(120);
        a.frenar(50.6);
        a.apagar();
        
        System.out.println("--------------------");
        
        Auto b = new Auto("Fiat", "asdfg123", 2002, 200, "Uno", "KOP123");
        System.out.println(b.toString());
        a.tocarBocina();
        b.tocarBocina();
        a.apagar();
        b.apagar();
        
        
    }
}
