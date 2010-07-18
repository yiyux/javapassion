import javax.swing.JOptionPane;

public class ForLoop {
    
    /** Creates a new instance of WhileLoop1 */
    public ForLoop() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base = 0;
        int exp = 0;
        int power = 1;
        int counter = 0;
        
        //gets the user input for base and power using JOptionPane
        base = Integer.parseInt(JOptionPane.showInputDialog("Computing power using for loop: Enter Base!"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Computing power using for loop: Enter Exponent!"));
        
        //limits the exp to positive numbers only
        if(exp < 0 ){
            JOptionPane.showMessageDialog(null,"Positive numbers only please");
            System.exit(0);
        }
        
        //for loop for computing the power
        for(counter = 0; counter < exp; counter++){
            power = power*base;
        }
        
        //displays the result
        JOptionPane.showMessageDialog(null,base+" to the "+exp+" is "+power);
    }
    
}
