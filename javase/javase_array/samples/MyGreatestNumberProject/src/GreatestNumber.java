import javax.swing.JOptionPane;

public class GreatestNumber {
    
    public static void main(String[] args) {
        int[] num = new int[10];
        int counter;
        int max = 0;
        int totalnumber = 3;
        
        // Prompt a user to enter numbers
        for(counter = 0; counter < totalnumber; counter++){
            
            num[counter] = Integer.parseInt
                    (JOptionPane.showInputDialog("Enter numbers until " + totalnumber + " numbers are entered"));
            
            // Compute the greatest number up to this point
            if((counter == 0)||(num[counter] > max))
                max = num[counter];
        }
        
        // Display the greatest number.
        JOptionPane.showMessageDialog(null,"The number with the greatest value is " + max);
    }
    
}


