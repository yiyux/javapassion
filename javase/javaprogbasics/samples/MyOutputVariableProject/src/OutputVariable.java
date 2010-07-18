/*
 * OutputVariable.java
 *
 * Created on January 19, 2007, 6:30 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author sang
 */
public class OutputVariable {
    
    /** Creates a new instance of OutputVariable */
    public OutputVariable() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable value is int primitive type and it is initialized to 10
        int value = 10;
        
        // Variable x is char primitive type and it is initialized to 'A'
        char x;
        x = 'A';
        
        // Variable grade is a double type
        double grade = 11;
        
        // Display the value of variable "value" on the standard output device
        System.out.println( value );
        
        // Display the value of variable "x" on the standard output device
        System.out.println( "The value of x=" + x );
        
        // Display the value of variable "grade" on the standard output device
        System.out.println( "The value of grade =" + grade );
    }
    
}
