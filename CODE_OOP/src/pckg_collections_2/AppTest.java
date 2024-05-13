package pckg_collections_2;

import java.util.ArrayList;
import java.util.Collections;

public class AppTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("automobil");
        list.add("karić");
        list.add("romobil");
        list.add("bicikla");
        list.add("avion");
        System.out.println(list);
//        Collections.sort(list);    //col je statička klasa za rad s kolekcijama
//        System.out.println(list);
        LengthStringComparator lengthStringComparator = new LengthStringComparator();
        Collections.sort(list,lengthStringComparator);
        System.out.println(list);

    }


}
