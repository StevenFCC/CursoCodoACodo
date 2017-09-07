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
public class Vehiculo {
    private String fabricante;
    private String matricula;
    private int annoDeFabricacion;
    private float velocidadMaxima;
    
    public Vehiculo(){
    }
    
    public Vehiculo(String fabricante, String matricula, int annoDeFabricacion, float velocidadMaxima) {
        this.fabricante = fabricante;
        this.matricula = matricula;
        this.annoDeFabricacion = annoDeFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setAnnoDeFabricacion(int annoDeFabricacion) {
        this.annoDeFabricacion = annoDeFabricacion;
    }
    
    public void setVelocidad(float velocidad) {
        this.velocidadMaxima = velocidad;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnnoDeFabricacion() {
        return annoDeFabricacion;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void arrancar() {
        System.out.println("Estoy arrancando");
    }
    
    public void frenar(double frenar){
        System.out.println("Estoy frenando con: " + frenar);
    }
    
    public void acelerar(double acelerar) {
         System.out.println("Estoy acelerando con: " + acelerar);
    }
    
    public void apagar() {
        System.out.println("Estoy apagando el motor");
    }
    
    @Override
    public String toString() {
        return "Fabricante: " + fabricante + " Matricula: " + matricula + " Año de fabricacion: " + annoDeFabricacion + " Velocidad Maxima: " + velocidadMaxima;
    }
}
