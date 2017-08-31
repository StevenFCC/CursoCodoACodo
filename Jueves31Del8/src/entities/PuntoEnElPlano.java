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
public class PuntoEnElPlano {
    private int puntoX;
    private int puntoY;
    
    public int getPuntoX(){
        return this.puntoX;
    }
    
    public int getPuntoY() {
        return this.puntoY;
    }
    
    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }
    
    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }
    
    public void ubicacionEnElCuadrante() {
        if (this.puntoX > 0 && this.puntoY > 0) {
            System.out.println("Esta en el primer cuadrante");
        } else if (this.puntoX < 0 && this.puntoY > 0) {
            System.out.println("Esta en el segundo cuadrante");
        } else if (this.puntoX < 0 && this.puntoY < 0) {
            System.out.println("Esta en el tercer cuadrante");
        } else if (this.puntoX > 0 && this.puntoY < 0) {
            System.out.println("Esta en el cuarto cuadrante");
        } else {
            System.out.println("Esta en el origen de las coordenadas");
        }
    }
}
