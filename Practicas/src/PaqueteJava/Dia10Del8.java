/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteJava;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Dia10Del8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pruebaVector;
        pruebaVector = new int[4];
        boolean[] vectorLogico = new boolean[4];
        int a = 0;
        
        int[] vector = {10,13,12,11,10,8,7,15,9,10,12,14};
        int contPares = 0, contImpares = 0, contDiez = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                contPares++;
            } else if (vector[i] % 2 == 1) {
                contImpares++;
            }
            if (vector[i] == 10) {
                contDiez++;
            }
        }
        
        System.out.println("La cantidad de numeros impares son: " + contPares 
                + "\nLa cantidad de numeros impares son: " + contImpares 
                + "\nLa cantidad de veces que aparece el diez son: " + contDiez);
        
        Arrays.sort(vector);
        
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i] + " ");
        }
        
        System.out.println("");
        
        int[] pares = {2,4,6,8,10};
        int[] impares = new int[pares.length];
        for (int i = 0; i < pares.length; i++) {
            impares[i] = pares[i] - 1;
            System.out.print(impares[i] + " ");
        }
        
        System.out.println("");
        
        int[] pares2 = new int[pares.length];
        
        System.arraycopy(pares, 0, pares2, 0, pares.length);
        
        for (int i = 0; i < pares2.length; i++) {
            System.out.println(pares2[i]);
        }
    }
    
}
