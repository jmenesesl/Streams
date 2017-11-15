/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package copycharactersbuffered;

import java.io.*;

/**
 *
 * @author orboan
 */
public class CopyCharactersBuffered {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new BufferedWriter(new FileWriter("characteroutpout.txt"));
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
