
package iojava;

import java.io.File;

public class Bai1 {
    public static void main(String a[])
     {
        File file = new File("/home/students/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
