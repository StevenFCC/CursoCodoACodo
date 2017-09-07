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
public class Vehiculo {
    private String marca;
    private String modelo;
    private String combustible;
    private int cilindrada;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Vehiculo() {
        
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public String getConbustible() {
        return this.combustible;
    }
    
    public int getCilindrada() {
        return this.cilindrada;
    }
    
    public void arrancar() {
        System.out.println("Esta arrancando el auto");
    }
    
    public void arrancar(String nombre) {
        System.out.println("Esta arranando el auto. " + nombre);
    }
    
    public double acelerar() {
        double velocidadDelVehiculo = 30; 
        return velocidadDelVehiculo;
    }
    
    public double acelerar(double velocidad) {
        double velocidadDelVehiculo = velocidad; 
        return velocidadDelVehiculo;
    }
    
    public double frenar() {
        double velocidadDelVehiculo = 0;
        return velocidadDelVehiculo;
    }
    
    public double frenar(double frenar) {
        double velocidadDelVehiculo = frenar;
        return velocidadDelVehiculo;
    }
    
    public void apagar() {
        System.out.println("Estoy apagando el auto");
    }
    
    public void apagar(String nombre) {
            System.out.println("Estoy apagando el auto. " + nombre);
    }
}
