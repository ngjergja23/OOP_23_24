package Zad_3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class BIN_CLS {


    public static <T> void saveDataToBIN(String pathName, List<T> objects){

        File file = new File(pathName);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            for (T obj : objects){
                oos.writeObject(obj.toString());
            }
            System.out.println("Objects written to a file " + file);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


    }


}
