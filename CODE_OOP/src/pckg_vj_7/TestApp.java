package pckg_vj_7;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestApp {
    private static String[] vehicles = {"car",
            "helicopter",
            "electronic bike",
            "truck",
            "motorcycle",
            "carriage"};
    public static void main(String[] args) {

        LinkedList<String> vehs = new LinkedList<>();
        Collections.addAll(vehs,vehicles);
        printList(vehs);
        Iterator<String> iterator = vehs.iterator();
        printList(iterator);
        System.out.println(vehs);

    }
    private static void printList(LinkedList<String> list){
        for (String el : list){
            System.out.println(el);
        }
    }
    private static void printList(Iterator<String> itr){
        while (itr.hasNext()){
            String next = itr.next();
            if (next.equals("carriage")){
                itr.remove();
                System.out.println("removed carriage from list! ");
            }
            System.out.println(next);
        }
    }


}
