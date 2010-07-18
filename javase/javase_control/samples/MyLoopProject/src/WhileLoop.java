import javax.swing.JOptionPane;

public class WhileLoop {
    
    /**
     * Creates a new instance of WhileLoop
     */
    public WhileLoop() {
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
        base = Integer.parseInt(JOptionPane.showInputDialog("Computing power using while loop: Enter Base!"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Computing power using while loop: Enter Exponent!"));
        
        
        //limits the exp to positive numbers only
        if(exp < 0 ){
            JOptionPane.showMessageDialog(null,"Positive numbers only please");
            System.exit(0);
        }
        
        //while loop that solves for the power
        while(counter < exp){
            power = power*base;
            counter++;
        }
        
        //displays the result
        JOptionPane.showMessageDialog(null,base+" to the "+exp+" is "+power);
    }
    
}
