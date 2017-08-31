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
public class Empleado {
    private String nombre;
    private int sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public void datos() {
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("El sueldo del empleado es: $" + sueldo);
    }
    
    public void impuestos() {
        if (sueldo > 3000) {
            System.out.println("El empleado debe pagar impuestos");
        } else {
            System.out.println("El empleado no debe pagar impuestos");
        }
    }
}
