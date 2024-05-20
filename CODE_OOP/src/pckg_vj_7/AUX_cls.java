package pckg_vj_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class AUX_cls {
    public static LinkedList<String> readDataFromFile(String filePath, Scanner scanner)
    {
        LinkedList<String> listStr = new LinkedList<>();
        File file = new File(filePath);
        try {
            scanner = new Scanner(file);
            String line;
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                listStr.add(line);
            }
            System.out.println("All data read");
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found...");
        }
        return listStr;

    }

    public static <E> void linkedListElements(LinkedList<E> ll){
        for (E el : ll){
            System.out.println(el);
        }
    }


    // kako da bude univerzalna za bilo koju linkedlist
    // treba uvesti parametrizaciju sa <E>



}
