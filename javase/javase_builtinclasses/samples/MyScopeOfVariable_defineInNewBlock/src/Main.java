/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sang
 */
public class Main {
    static int test = 0;

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(test);   // prints 0

        // test variable is defined in a new block
        {
            int test = 20;
            System.out.println(test);// prints 20
        }

        System.out.println(test);   // prints 0
    }
}
