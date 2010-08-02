/*
 * ClassAndObject.java
 *
 * Created on January 22, 2007, 11:57 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author sang
 */
public class ClassAndObject {
    
    /** Creates a new instance of ClassAndObject */
    public ClassAndObject() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create an instance of a class by using a Java language keyword "new".
        // For example, in order to create an object instance of a String class,
        // you will do the following
        String strInstance1 = new String("I am object instance of a String class");
        System.out.println("value of strIntance1 = " + strInstance1);
        
        // String class a special class for which you can create an instance
        // of it by assigning a string literal.  No other class allows this form of object creation.
        String strInstance2 = "I am object instance of a String class";
        System.out.println("value of strIntance2 = " + strInstance2);
        
        // Create an object instance of Integer class
        Integer intInstance1 = new Integer(20);
        System.out.println("value of intIntance1 = " + intInstance1);
        
        // Create another object instance of Integer class
        Integer intInstance2 = new Integer(30);
        System.out.println("value of intIntance2 = " + intInstance2);
    }
    
}
