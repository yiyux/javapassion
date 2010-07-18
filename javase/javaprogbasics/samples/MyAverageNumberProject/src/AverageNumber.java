/*
 * AverageNumber.java
 *
 * Created on January 19, 2007, 7:05 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author sang
 */
public class AverageNumber {
    
    /** Creates a new instance of AverageNumber */
    public AverageNumber() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declares the three numbers
        int num1 = 10;
        int num2 = 20;
        int num3 = 45;
        
        //get the average of the three numbers
        // and saves it inside the ave variable
        int ave = (num1+num2+num3)/3;
        
        //prints the output on the screen
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);
        System.out.println("Average is = "+ave);
    }
    
}
