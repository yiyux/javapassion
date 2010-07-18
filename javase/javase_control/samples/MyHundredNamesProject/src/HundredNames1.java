import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HundredNames1 {
    
    /**
     * Creates a new instance of HundredNames1
     */
    public HundredNames1() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader reader 
                = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        int counter = 0;
        
        //gets the users' name
        try{
            System.out.println("Enter name: ");
            name = reader.readLine();
        }catch(Exception e){
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        //while loop that prints the name one hundred times
        while(counter < 100){
            System.out.println(name);
            counter++;
        }
    }
}


