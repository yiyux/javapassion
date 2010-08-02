/*
 * ScopeOfVariable.java
 *
 * Created on January 22, 2007, 1:49 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author sang
 */
public class ScopeOfVariable {
    
    /** Creates a new instance of ScopeOfVariable */
    public ScopeOfVariable() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int var1 = 10;
        // var2 is now defined in an outer scope
        int var2 = 15;
        
        if (var1 < 100){
            //int var2 = 20;
            var2 = 20;
        } else {
            //int var2 = 21;
            var2 = 21;
        }
        
        // Access to var1 is allowed so no compile error.
        System.out.println("value of var1 = " + var1);
        
        // Access to var2 is now allowed 
        System.out.println("value of var2 = " + var2);
    }
    
}
