/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes0905.entities;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Alumno extends Persona{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void obtener() {
        Scanner teclado = new Scanner(System.in);
        super.obtener();
        System.out.println("Ingrese Matricula:");
        setMatricula(teclado.nextLine());
    }
}
