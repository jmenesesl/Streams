/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package copylines;

import java.io.*;

/**
 *
 * @author orboan
 */
public class CopyLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("lineoutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if(outputStream != null) {
                outputStream.close();
            }
        }
    }
}
