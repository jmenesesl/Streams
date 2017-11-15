/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scanxan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author orboan
 */
public class ScanXan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader (new FileReader("xanadu.txt")));
            //s.useDelimiter(":");
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        }
        finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
