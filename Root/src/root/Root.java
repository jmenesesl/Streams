/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

/**
 *
 * @author Oriol
 */
public class Root {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);
        
        System.out.print("The square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.print(r);
        System.out.println(".");
        
        i = 5;
        r = Math.sqrt(i);
        System.out.println("The square root of " + i + " is " + r + ".");
    }
}
