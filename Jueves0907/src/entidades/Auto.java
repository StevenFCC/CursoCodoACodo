/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Admin
 */
public class Auto extends Vehiculo{
    private String modelo;
    private String patente;
    
    public Auto() {
    }
    
    public Auto(String fabricante, String matricula, int annoDeFabricacion,
    float velocidadMaxima, String modelo, String patente) {
        super(fabricante, matricula, annoDeFabricacion, velocidadMaxima);
        this.modelo = modelo;
        this.patente = patente;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getPatente() {
        return patente;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Modelo: " + modelo + " Patente: " + patente;
    }
    
    public void tocarBocina() {
        System.out.println("pi pi pi pi pi");
    }
    
    @Override
    public void apagar() {
        System.out.println("Estoy apagando el auto");
    }
}
