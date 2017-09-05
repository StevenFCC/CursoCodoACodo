/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes0905.entities;

import martes0905.*;

/**
 *
 * @author Admin
 */
public class MiSuperClase {
    private int varInt;
    private String varCad;
    
    public MiSuperClase() {
    }

    public int getVarInt() {
        return varInt;
    }

    public void setVarInt(int varInt) {
        this.varInt = varInt;
    }

    public String getVarCad() {
        return varCad;
    }

    public void setVarCad(String varCad) {
        this.varCad = varCad;
    }
    
    public void mostrarAtributos() {
        System.out.println("Soy un metodo de la clase padre");
        System.out.println("varInt: " + varInt);
        System.out.println("vatCad: " + varCad);
    }
    
    public MiSuperClase(int varInt, String varCad) {
        this.varInt = varInt;
        this.varCad = varCad;
    }
    
    @Override
    public String toString() {
        return "varInt: " + varInt + "\n" + "varCad: " + varCad;
    }
}
