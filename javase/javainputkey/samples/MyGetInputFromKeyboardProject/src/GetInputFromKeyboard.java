/*
 * GetInputFromKeyboard.java
 *
 * Created on January 20, 2007, 6:22 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sang
 */
public class GetInputFromKeyboard {
    
    /** Creates a new instance of GetInputFromKeyboard */
    public GetInputFromKeyboard() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create BufferedReader object from Standard input device.
        // Standard input device is typically a keyboard.
        BufferedReader dataIn = new BufferedReader(new
                InputStreamReader( System.in) );
        
        // Prompt a user to enter his/her name
        String name = "";
        System.out.println("Please Enter Your Name:");
        
        // Read entered data into name variable
        try{
            name = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Error!");
        }
        
        // Display the name
        System.out.println("Hello " + name +"!");
        
        // Prompt a user to enter his/her age
        String age= "";
        System.out.println("Please Enter Your Age:");
        
        // Read entered data into age variable
        try{
            age = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Error!");
        }
        
        // Display the name and age
        System.out.println("Hello " + name +"!" + " " + "Your age is " + age);
        
        // Convert the String type of age variable into int primitive type variable ageint.
        int ageint = Integer.parseInt(age);
        
        // Now you can compare the int primitive type against int type value 100
        if (ageint > 100){
            System.out.println("Hello " + name +"!" + " " + "You are old.");
        } else{
            System.out.println("Hello " + name +"!" + " " + "You are young.");
        }
    }
    
}
