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
public class SubClase extends MiSuperClase{
    private String varCadSub;
    
    public SubClase() {
    }

    public String getVarCadSub() {
        return varCadSub;
    }

    public void setVarCadSub(String varCadSub) {
        this.varCadSub = varCadSub;
    }
    
    public void mostrarSub() {
        System.out.println("Soy un metodo de la clase hija");
        System.out.println(varCadSub);
    }
    
    public void mostrarTodo() {
        System.out.println("Soy un metodo de la clase hija");
        System.out.println("Voy a mostrar Todas las variables");
        System.out.println("varCadSub: " + varCadSub);
        super.mostrarAtributos();
    }
    
    public SubClase(int varInt, String  varCad, String varCad2) {
        super(varInt, varCad);
        this.varCadSub = varCad2;
    }
    
    @Override
    public String toString() {
        //return "varInt: " + varInt + "\n" + "varCad: " + varCad + "\n" + "varCadSub: " + varCadSub;
        return "varInt: " + super.getVarInt() + "\n" + "varCad: " + super.getVarCad() + "\n" + "varCadSub: " + varCadSub;
        //return super.toString() + "\n" + "varCadSub: " + varCadSub;
    }
}