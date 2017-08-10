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
        
        System.out.println("Los Arrays son iguales: " + Arrays.equals(pares, pares2));
        System.out.println("Los Arrays son iguales: " + Arrays.equals(pares, impares));
        
        int[] pares3 = new int[pares.length];
        pares3 = pares;
        for (int i = 0; i < pares3.length; i++) {
            System.out.println(pares[i]);
        }
        
        pares[3] = 1111;
        for (int i = 0; i < pares3.length; i++) {
            System.out.println(pares[i] + "\t" + pares3[i]);
        }
        
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
        System.out.println("*********************");
        
        int[] indVal = {10,20,5,15,30,20};
        int acum1 = 0, numMayor = 0, apar20 = 0;
        for (int i = 0; i < indVal.length; i++) {
            System.out.println("Indice: " + i + " Valor: " + indVal[i]);
            
            acum1 = acum1 + indVal[i];
            
            if (indVal[i] % 2 == 1) {
                System.out.print("Indice de impares: " + i);
            }
            
            if (indVal[i] > numMayor) {
                numMayor = indVal[i];
            }
            
            if (indVal[i] == 20) {
                apar20++;
            }
        }
        System.out.println("Total: " + acum1);
        System.out.println("El numero mayor es:" + numMayor);
        System.out.println("La cantidad de veces que aparece el veinte es: " + apar20);
        System.out.println("");
        
        double acum = 0, infMin = 1, infMax = 0, prom = 0, mesMin = 0, mesMax = 0;
        double[] inflMes = {0.8,0.1,0.3,0.4,0.3,0.6,0.5,0.3,0.7,0.3,0.2,0.9};
        for (int i = 0; i < inflMes.length; i++) {
            acum = acum + inflMes[i];
            
            if (inflMes[i] < infMin) {
                infMin = inflMes[i];
                mesMin = i;
            }
            
            if (inflMes[i] > infMax) {
                infMax = inflMes[i];
                mesMax = i;
            }
            
            if (i == inflMes.length - 1) {
                prom = acum/12;
            }
        }
        
        System.out.println("La inflacion anul es: " + acum 
                + "\nLa inflacion minima es: " + infMin + " en el mes numero: " + ((int) mesMin + 1)
                + "\nLa inflacion maxima es: " + infMax + " en el mes numero: " + ((int) mesMax + 1)
                + "\nEl promedio de inflacion es: " + prom);
        System.out.println("");
        
        char[] letras = {'c', 'O', 'D', 'o', 'a', 'C', 'o', 'd', 'o'};
        System.out.println(letras[2]);
    }
}
