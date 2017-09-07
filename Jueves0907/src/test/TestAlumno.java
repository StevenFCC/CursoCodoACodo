package test;

import entidades.Alumno;

public class TestAlumno {
    public static void main(String[] args) {
       Alumno alu = new Alumno();
       alu.obtener();
       if (alu.esMayor()) System.out.println(alu.getNombre()+" es mayor de edad");
       
       Alumno alu2 = new Alumno("dddd", 20, "asddsa");
       if (alu2.esMayor()) System.out.println(alu2.getNombre()+" es mayor de edad");
       
        System.out.println(alu.toString());
        System.out.println(alu2.toString());
    }
}
