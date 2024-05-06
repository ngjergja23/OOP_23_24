package pckg_col_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    //hashset je bolji, brži kad su manji skupovi podataka, alinkedhashset kad su veci

    private static final int MAXI = 100;

    public static void addNewUser(User user, HashMap users){
        if (users.containsKey(user.getUserID())){
            System.out.println("User is already in this map!");
        }else{
            users.put(user.getUserID(), user.getUserName());
            System.out.println("New user added to map!");
        }
    }

    public static <K, V> void listAllMapElements(HashMap<K,V> map){
        System.out.println("-------------------------------------------");
        for (K key:map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static <K, V> void listAllMapElementsNew(HashMap<K,V> map){
        System.out.println("-------------------------------------------");
        for (Map.Entry entryset: map.entrySet()){
            System.out.println("Key: " + entryset.getKey() + " Value: " + entryset.getValue());
        }
    }

    public static <E> void addElementToSet(E element, Set<E> elements){
        if (elements.add(element)){
            System.out.println("New element added to a set!");
        } else {
            System.out.println("Element already in set");
        }
    }

    public static <E> void listElements(Set <E> elements){
        for (E e : elements){
            System.out.println(e);
        }
    }

    public static <E> void removeElement(Set <E> elements,E elementToRemove){
        if (elements.remove(elementToRemove)){
            System.out.println("Removed :" + elementToRemove);
        }else {
            System.out.println("No such element!");
        }
    }


    public static <K, V> void addRobotToMap(Map<K,V> map, K key, V value){
        if (map.containsKey(key)){
            System.out.println("Exists!");
        }else {
            map.put(key,value);                       //nije kompajliran za int nego za neki V koji kasnije moze bit int
            System.out.println("New robot added to map!");
        }
    }

    private static int generateRandomInt(){
        return ThreadLocalRandom.current().nextInt(MAXI);
    }



}