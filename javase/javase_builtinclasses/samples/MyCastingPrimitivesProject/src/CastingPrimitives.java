
public class CastingPrimitives {
    
    public static void main(String[] args) {
        
        // Implicit casting example 1
        int     numInt = 10;
        double  numDouble = numInt;
        System.out.println("int " + numInt + " is implicitly casted to double " + numDouble);
        
        // Implicit casting example 2
        int	numInt1 = 1;
        int	numInt2 = 2;
        double  numDouble2 = numInt1/numInt2;
        System.out.println("numInt1/numInt2 " + numInt1/numInt2 + " is implicitly casted to double " + numDouble2);
        
        // Explicit casting example 1
        double  valDouble = 10.12;
        int 	valInt = (int)valDouble;
        System.out.println("double " + valDouble + " is explicitly casted to int " + valInt);
        
        // Explicit casting example 2
        double x = 10.2;
        int y = 2;
        int result = (int)(x/y);
        System.out.println("x/y " + x/y + " is explicitly casted to int " + result);
    }
    
}
