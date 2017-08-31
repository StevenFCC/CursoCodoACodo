/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Empleado;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EmpleadoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e = new Empleado();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado");
        e.setNombre(teclado.nextLine());
        System.out.println("Ingrese el sueldo del empleado");
        e.setSueldo(teclado.nextInt());
        
        e.datos();
        e.impuestos();
    }
    
}
