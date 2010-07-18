/*
 * GreatestValue.java
 *
 * Created on January 19, 2007, 7:16 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author sang
 */
public class GreatestValue {
    
    /** Creates a new instance of GreatestValue */
    public GreatestValue() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declares the numbers
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int max = 0;
        
        //determines the highest number
        max = (num1>num2)?num1:num2;
        max = (max>num3)?max:num3;
        
        //prints the output on the screen
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);
        System.out.println("The highest number is = "+max);
    }
    
}
