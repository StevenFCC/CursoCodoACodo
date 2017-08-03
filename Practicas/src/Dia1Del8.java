/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Dia1Del8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String apellido;
        float decimal1;
        float decimal2;
        int opcion;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        apellido = entrada.nextLine();

        System.out.println("Ingrese el primer numero decimal");
        decimal1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo decimal");
        decimal2 = entrada.nextFloat();     

        opcion = 1;

        while ((opcion <= 4 && opcion >= 0) && opcion != 0) {

            opcion = mostrarMenuOpcion(entrada);
            switch (opcion) {
                case 0:
                    mostrarNomApe(nombre, apellido);
                    System.out.println("\n" + "Fin del programa");
                    break;
                case 1:
                    mostrarNomApe(nombre, apellido);
                    System.out.println("\n" + "La suma de los numeros da " + (decimal1 + decimal2) + "\n");
                    break;
                case 2:
                    mostrarNomApe(nombre, apellido);
                    System.out.println("\n" + "La resta de los numeros da " + (decimal1 - decimal2) + "\n");
                    break;
                case 3:
                    mostrarNomApe(nombre, apellido);
                    System.out.println("\n" + "La multiplicacion de los numeros da " + (decimal1 * decimal2) + "\n");
                    break;
                case 4:
                    if (decimal2 != 0) {
                        mostrarNomApe(nombre, apellido);
                        System.out.println("\n" + "La division de los numeros da " + (decimal1 / decimal2) + "\n");
                    } else {
                        mostrarNomApe(nombre, apellido);
                        System.out.println("La operacion es invalida");
                    }
                    break;
            }

            if (opcion != 0) {
                System.out.println("Ingrese el primer numero decimal");
                decimal1 = entrada.nextFloat();
                System.out.println("Ingrese el segundo decimal");
                decimal2 = entrada.nextFloat();
            }
        }
    }

    public static int mostrarMenuOpcion(Scanner entrada) {
        int opcion;
        System.out.println(" \nIngrese el numero segun la operacion a realizar con los numeros decimales \n"
                + "1) Sumar \n"
                + "2) Restar \n"
                + "3) Multiplicar \n"
                + "4) Dividir \n"
                + "0) Salir \n");
        opcion = entrada.nextInt();
        return opcion;
    }

    public static void mostrarNomApe(String nombre, String apellido) {
        System.out.println("\nNombre y Apellido: " + nombre + " " + apellido);
    }
}