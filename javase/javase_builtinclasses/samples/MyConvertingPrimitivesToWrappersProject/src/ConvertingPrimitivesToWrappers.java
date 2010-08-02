
public class ConvertingPrimitivesToWrappers {
    
    public static void main(String[] args) {
        
        // Create Integer object instance
        Integer dataCount = new Integer(7801);
        
        // Convert it to int primitive type using intValue() method
        int newCount = dataCount.intValue();
        System.out.println("int newCount = " + newCount);
        
        // Using static method of the Integer wrapper class
        // to convert a String type to int primitive type
        String pennsylvania = "65000";
        int penn = Integer.parseInt(pennsylvania);
        System.out.println("int penn = " + penn);
        
        // Convert int primitive type to Integer object
        Integer myInteger = new Integer(penn);
        System.out.println("Integer myInteger = " + myInteger);
    }
    
}
