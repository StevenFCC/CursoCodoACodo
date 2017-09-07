/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class test {
    public static void main (String[] args) {
        MiSuperClase sC = new MiSuperClase();
        sC.mostrarAtributos();
        sC.setVarCad("prueba");
        sC.setVarInt(1);
        sC.mostrarAtributos();
        
        System.out.println("----------------");
        
        SubClase subC = new SubClase();
        subC.mostrarSub();
        subC.setVarCadSub("prueba dos");
        subC.mostrarSub();
        
        System.out.println("----------------");
        
        subC.setVarCad("prueba tres");
        subC.setVarInt(2);
        subC.mostrarAtributos();
        
        System.out.println("-----------------");
        
        subC.mostrarTodo();
        
        System.out.println("-----------------");
        
        MiSuperClase sC2 = new MiSuperClase(4, "Cuatro");
        sC2.mostrarAtributos();
        
        System.out.println("-----------------");
        
        SubClase subC2 = new SubClase(5, "Cinco", "Cinco Cinco");
        subC2.mostrarTodo();
        
        System.out.println("-----------------");
        
        System.out.println(sC2.toString() + "\n");
        System.out.println(subC.toString() + "\n");
        System.out.println(subC2.toString());
    }
}
