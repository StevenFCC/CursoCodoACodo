/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Dia13Del7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password;
        int cont = 0;
        
         do {
            password = JOptionPane.showInputDialog("Introducir clave");
            if (password.equals("1234")) {
                cont = 3;
                JOptionPane.showMessageDialog(null, "La clave es correcta");
            } else {
                cont++;
                JOptionPane.showMessageDialog(null, "La clave ingresada es incorrecta");
                if (cont == 3) {
                JOptionPane.showMessageDialog(null, "Se le acabaron los intentos \n para ingresar la clave");
                }
            }
        } while (cont < 3);
    }
    
}
