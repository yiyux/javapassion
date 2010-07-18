import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiveNamesUsingdowhile {
    
    public static void main(String[] args){
        
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
        
        // Use do-while loop that prints the name five times
        do{
            System.out.println(name);
            counter++;
        }while(counter < 5);
    }
    
}
