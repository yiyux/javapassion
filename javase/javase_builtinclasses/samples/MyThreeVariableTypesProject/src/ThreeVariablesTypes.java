public class ThreeVariablesTypes {
    
    // Example of static variable
    static String myStaticVariable = "static variable";
    
    // Example of instance variable
    String myInstanceVariable = "instance variable";
    
    /** Creates a new instance of ThreeVariablesTypes */
    public ThreeVariablesTypes() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myLocalVariable = "local variable";
        System.out.println("myStaticVariable = " + myStaticVariable);
        // Compile error when instance variable is referenced within a static context
        // System.out.println("myInstanceVariable = " + myInstanceVariable);
        System.out.println("myLocalVariable = " + myLocalVariable);
    }
    
}
