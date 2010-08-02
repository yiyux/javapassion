public class EqualsTestString {

    /** Creates a new instance of EqualsTestString */
    public EqualsTestString() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declare two String type variables, str1 and str2
        String str1, str2;

        // Initialize the variables.  Note that the variables contain
        // pointers to the actual object instances.
        str1 = "Life is worth living... with Passion!";
        str2 = str1;

        // Display the values of the str1 and str2 variables
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // The "==" notation, when it is used with variables of reference types not
        // primitive types, means whether the variables point to the same object
        // instance or not.

        // Check if str1 and str2 are the same object meaning if the two variables
        // points to the same String type object instance.
        System.out.println("Same object? " + (str1 == str2));

        // Reinitialize str2 variable.  It is now pointing to a new String type object instance.
        str2 = new String(str1);

        // Display the values of the str1 and str2 variables
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // Check if str1 and str2 are the same object meaning if the two variables
        // points to the same String type object instance.
        System.out.println("Same object? " + (str1 == str2));

        // Check if str1 and str2 have the same vaule
        System.out.println("Same value? " + str1.equals(str2));
    }

}
