
package ingresodatos;

import javax.swing.JOptionPane;

public class IngresoDatos {

   
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Este programa suma dos variables.");
        String n1 = JOptionPane.showInputDialog("Ingrese primer dígito: ");
           int num1 = Integer.parseInt(n1);
        String n2 = JOptionPane.showInputDialog("Ingrese segundo dígito: ");
           int num2 = Integer.parseInt(n2);
        JOptionPane.showMessageDialog(null, "La suma de las variables es: "+(num1+num2));
        
    }
    
}
