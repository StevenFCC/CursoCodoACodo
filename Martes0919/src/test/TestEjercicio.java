/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
import entidades.Alumno;
import entidades.Domicilio;
import java.util.ArrayList;
import java.util.List;

public class TestEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno listaDeAlumnos[] = new Alumno[10];
        Domicilio listaDeDomicilio[] = new Domicilio[10];
        
        listaDeDomicilio[0] = new Domicilio("Calle 125", 0, "7", "La Plata", "Bs. As.");
        listaDeAlumnos[0] = new Alumno("Juan Perez", 25, "His1234", listaDeDomicilio[0]);
        
        listaDeDomicilio[1] = new Domicilio("Cucha Cucha 876", 3, "5", "Caba", "Caba");
        listaDeAlumnos[1] = new Alumno("Maria Rodriguez", 22, "Geo3288", listaDeDomicilio[1]);
        
        
        listaDeDomicilio[2] = new Domicilio("Humberto Primo 2260", 4, "3", "", "");
        listaDeAlumnos[2] = new Alumno("Cristina Fortuna", 33, "Psi8845", listaDeDomicilio[2]);
        
        
        listaDeDomicilio[3] = new Domicilio();
        listaDeAlumnos[3] = new Alumno("Aldo Rico", 41, "Inf0956", listaDeDomicilio[3]);
        
        
        listaDeDomicilio[4] = new Domicilio();
        listaDeAlumnos[4] = new Alumno("Miguel Angel Mesa", 25, "Geo2377", listaDeDomicilio[4]);
        
        
        listaDeDomicilio[5] = new Domicilio();
        listaDeAlumnos[5] = new Alumno("Jose Maria Listorti", 19, "Ing7637", listaDeDomicilio[5]);
        
        
        listaDeDomicilio[6] = new Domicilio();
        listaDeAlumnos[6] = new Alumno("Candela Maria Hidalgo", 29, "Mat3242", listaDeDomicilio[6]);
        
        
        listaDeDomicilio[7] = new Domicilio();
        listaDeAlumnos[7] = new Alumno();
        
        
        listaDeDomicilio[8] = new Domicilio();
        listaDeAlumnos[8] = new Alumno();
        
        
        listaDeDomicilio[9] = new Domicilio();
        listaDeAlumnos[9] = new Alumno();
        
        
        
        
    }
    
}
