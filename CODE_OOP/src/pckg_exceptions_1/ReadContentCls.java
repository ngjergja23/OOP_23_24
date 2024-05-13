package pckg_exceptions_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentCls {
    public static void readFile(String filePath) throws FileNotFoundException
    {
        File file = new File(filePath);
//        try {
            Scanner sc = new Scanner(file);   //unhandled exception
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println("Line: " + line);
//            }
//        } catch (FileNotFoundException e) {            //kreirao se objekt e klase fnfexception
//            System.out.println("file not found - check path or file existance ");
             //throw new RuntimeException(e);
        }
    }



}
