package entidades;

import java.util.Scanner;

public class Alumno extends Persona{
    // Atributos de la clase alumno
    private String matricula;
    // Metodos

    public Alumno() {
    }
    
    public Alumno(String nombre, int edad, String matricula) {
        super.setNombre(nombre);
        super.setEdad(edad);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void obtener(){
        // invoco al metodo de la clase Padre mia
        
        super.obtener();
        System.out.println("Ingrese matricula");
        Scanner teclado = new Scanner(System.in);
        setMatricula(teclado.nextLine());
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " Edad: " + getEdad() + " Matricula: " + getMatricula();
    }
    
}
