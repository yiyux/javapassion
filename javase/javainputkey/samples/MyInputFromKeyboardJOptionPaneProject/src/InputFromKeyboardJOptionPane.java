import javax.swing.JOptionPane;
/*
 * InputFromKeyboardJOptionPane.java
 *
 * Created on January 24, 2007, 10:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author sang
 */
public class InputFromKeyboardJOptionPane {
    
    /** Creates a new instance of InputFromKeyboardJOptionPane */
    public InputFromKeyboardJOptionPane() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "";
        name=JOptionPane.showInputDialog("Please enter your name");
        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
