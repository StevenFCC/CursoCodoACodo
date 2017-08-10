package PaqueteJava;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Dia3Del8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String apellido;
        String continuar;
        float decimal1;
        float decimal2;
        int opcion;

        Scanner entrada = new Scanner(System.in);

        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido");

        decimal1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero decimal"));
        decimal2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo decimal"));

        opcion = 1;

        while ((opcion <= 4 && opcion >= 0) && opcion != 0) {

            opcion = mostrarMenuOpcion(entrada);
            switch (opcion) {
                case 0:
                    mostrarNomApeSinOpe(nombre, apellido, "\nFin del programa");
                    opcion = 0;
                    break;
                case 1:
                    mostrarNomApe(nombre, apellido, "\nLa suma de los numeros da ", (decimal1 + decimal2));
                    break;
                case 2:
                    mostrarNomApe(nombre, apellido, "\nLa resta de los numeros da ", (decimal1 - decimal2));
                    break;
                case 3:
                    mostrarNomApe(nombre, apellido, "\nLa multiplicacion de los numeros da ", (decimal1 * decimal2));
                    break;
                case 4:
                    if (decimal2 != 0) {
                        mostrarNomApe(nombre, apellido , "\nLa division de los numeros da ", (decimal1 / decimal2));
                    } else {
                        mostrarNomApeSinOpe(nombre, apellido, "\nLa operacion es invalida");
                    }
                    break;
            }

            if (opcion != 0) {
                continuar = JOptionPane.showInputDialog(null, "Desea continuar, escriba si o no");
                if (continuar.equals("si")) {
                decimal1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero decimal"));
                decimal2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo decimal"));   
                } else {
                    opcion = 0;
                }
            }
        }
    }

    public static int mostrarMenuOpcion(Scanner entrada) {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero segun la operacion a realizar con los numeros decimales \n"
                + "1) Sumar \n"
                + "2) Restar \n"
                + "3) Multiplicar \n"
                + "4) Dividir \n"
                + "0) Salir \n"));
        return opcion;
    }

    public static void mostrarNomApe(String nombre, String apellido, String mensage, float operacion) {
       JOptionPane.showMessageDialog(null, "Nombre y Apellido: " + nombre + " " + apellido + mensage + operacion);
    }
    
    public static void mostrarNomApeSinOpe(String nombre, String apellido, String mensage) {
       JOptionPane.showMessageDialog(null, "Nombre y Apellido: " + nombre + " " + apellido + mensage); 
    }
}
