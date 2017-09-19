/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Domicilio {
    protected String calle;
    protected int piso;
    protected String departamento;
    protected String localidad;
    protected String provincia;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public Domicilio(){
        
    }
    
    public Domicilio(String calle, int piso, String departamento, String localidad, String provincia) {
        this.calle = calle;
        this.departamento = departamento;
        this.localidad = localidad;
        this.piso = piso;
        this.provincia = provincia;
    }
    
    @Override
    public String toString() {
        return "Calle: " + calle + "\nDepartamento: " + departamento + "\nLocalidad: " + localidad
                + "\nPiso: " + piso + "\nProvincia: " + provincia;
    }
    
    public void obtener() {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese la calle del domicilio:");
        this.setCalle(t.nextLine());
        System.out.println("Ingrese el piso del domicilio");
        this.setPiso(t.nextInt());
        t.nextLine();
        System.out.println("Ingrese el departamento del domicilio");
        this.setDepartamento(t.nextLine());
        System.out.println("Ingrese la localidad del domicilio");
        this.setLocalidad(t.nextLine());
        System.out.println("Ingrese la provincia del domicilio");
        this.setProvincia(t.nextLine());
    }
    
    
    
}