
public class TestPassByReference {
    
    public static void main(String[] args) {
        
        System.out.println("main: start");
        
        // Create an array of integers and initialize
        // the array with 10, 11, and 12.
        int [] ages = {10, 11, 12};
        
        // Print array values.  The array should display
        // 10, 11, 12
        for (int i=0; i<ages.length; i++ ){
            System.out.println(ages[i]);
        }
        
        System.out.println("main: before calling the test method");
        
        // Call test and pass references to array.
        // Since the array is a reference type, what is
        // being passed is a pointer to actual array.
        test(ages);
        
        System.out.println("main: after calling the test method");
        
        // Print array values again.  It now should contain changed values.
        // display the changed values.
        for (int i=0; i<ages.length; i++ ){
            System.out.println(ages[i]);
        }
        
        System.out.println("main: end");
        
    }
    
    // Another static method in the TestPassByReference class
    public static void test(int[] arr){
        
        System.out.println("test: start");
        
        // change values of array
        for (int i=0; i<arr.length; i++ ){
            arr[i] = i + 50;
        }
        
        System.out.println("test: end");
    }
}
