package pckg_collections1;

import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class AUX_CLS {

    public static <E> void addElement(List<E> lista, E element){
        lista.add(element);
    }

    public static <K, V> void addValueInMap(HashMap<K, V> elements, V value, K key){
        elements.put(key, value);
    }

    public static <E> void listAllElements(List<E> list){
        for (E element : list) {
            System.out.println(element);
        }
    }

    public static <K, V> void listAllFromMap(HashMap<K,V> map){
        for (K k : map.keySet()){
            System.out.println("Key: " + k + "| Value: " + map.get(k));
        }
    }

    public static <E> void addElementToTreeSet(TreeSet<E> set, E elmnt){
        set.add(elmnt);
    }

    public static <E> void listFromTreeSet(TreeSet<E> set){
        for (E elmnt : set){
            System.out.println(elmnt);
        }
    }



}
