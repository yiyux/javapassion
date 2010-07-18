import javax.swing.JOptionPane;

public class ForLoop {
    
    /** Creates a new instance of ForLoop */
    public ForLoop() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize String array variable called names.
        String names []={"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
        
        // This is the search string we are going to use to search the array.
        String searchName = JOptionPane.showInputDialog("Enter either \"Yza\" or \"noname\"!");
        
        // Declare and initialize boolean primitive type variable calld foundName.
        boolean foundName =false;
        
        // Search the String array using for loop.
        //  * The "names.length" is the size of the array.
        //  * This for loop compares the value of each entry of the array with
        //     the value of searchString String type variable.
        //  * The equals(..) is a method of String class. Think about why you
        //     cannot use "names[i] == searchName" as comparison logic here.
        
        for (int i=0; i<names.length; i++){
            if (names [i ].equals(searchName)){
                foundName =true;
                break;
            }
        }
        
        // Display the result
        if (foundName)
            JOptionPane.showMessageDialog(null, searchName + " is found!");
        else
            JOptionPane.showMessageDialog(null, searchName + " is not found!");
        
    }
    
}
