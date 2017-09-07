/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Alumno;

/**
 *
 * @author Admin
 */
public class testAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alum = new Alumno();
        alum.obtener();
        if (alum.esMayor()) {
            System.out.println(alum.getNombre() + " es mayor de edad");
        }
    }
}
