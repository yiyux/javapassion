/*
 * JavaArray.java
 *
 * Created on January 31, 2007, 9:59 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author sang
 */
public class JavaArray {
    
    /** Creates a new instance of JavaArray */
    public JavaArray() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare and create int array whose size is 10
        int[] ages = new int[10];
        
        // Display the value of each entry in the array
        for( int i=0; i<ages.length; i++ ){
            System.out.print( ages[i] + " " );
        }
    }
    
}
