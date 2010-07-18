/*
 * ConditionalOperator.java
 *
 * Created on January 19, 2007, 6:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author sang
 */
public class ConditionalOperator {
    
    /** Creates a new instance of ConditionalOperator */
    public ConditionalOperator() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize two variables, one String type variable
        // called status and the other int primitive type variable called
        // grade.
        String status = "";
        int grade = 80;
        
        // Get status of the student.
        status = (grade >= 60)?"Passed":"Fail";
        
        // Print status.
        System.out.println( status );
    }
    
}
