
package iojava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Bai12 {
    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}
