package pckg_vj_7;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class TextApp {
    private static Scanner sc;
    public static void main(String[] args) {

        LinkedList<String> list = AUX_cls.readDataFromFile("CODE_OOP/data.txt", sc);
        AUX_cls.linkedListElements(list);
        Collections.sort(list, new StringComparator());
        System.out.println(list);



    }


}
