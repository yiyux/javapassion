
public class GetClassMethod {
   
    public static void main(String[] args) {
       
        // Create String object instance
        String str1 = "Life is worth living... with Passion!";
       
        // Find out the class information of String object instance
        // via getClass() method.  Note that it returns Class object instance.
        Class str1Class = str1.getClass();
        System.out.println("Class of str1 object instance is " + str1Class);
       
        // The the String name of the Class object instance.
        String str1ClassName = str1Class.getName();
        System.out.println("Class of str1 object instance is " + str1Class);
       
        // Create Integer object instance
        Integer int1 = new Integer(34);
       
        // Find out the class information of Integer object instance
        // via getClass() method.  Note that it returns Class object instance.
        Class int1Class = int1.getClass();
        System.out.println("Class of int1 object instance is " + int1Class);
       
        // The the String name of the Class object instance.
        String int1ClassName = int1Class.getName();
        System.out.println("Class of int1 object instance is " + int1Class);
       
    }
   
}