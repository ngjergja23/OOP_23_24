package pckg_collections_2;

import java.util.HashMap;
import java.util.HashSet;

public class ClientApp {

    public static void main(String[] args){
//        User user1 = new User("user_name_1", "pswdStrong",15);
//        User user2 = new User("user_name_2", "anotherStrong", 100);
//        User user3 = new User("user_name_3", "strongPswd", 345);
//        HashMap users = new HashMap<>();
//        AUX_CLS.addNewUser(user1, users);
//        AUX_CLS.addNewUser(user1, users);
//        AUX_CLS.addNewUser(user2, users);
//        AUX_CLS.addNewUser(user3, users);
//        AUX_CLS.listAllMapElements(users);
//        AUX_CLS.listAllMapElementsNew(users);
//        HashSet hset = new HashSet<>();
//        LinkedHashSet lhset = new LinkedHashSet<>();
//        TreeSet tset = new TreeSet<>();
//        AUX_CLS.addElementToSet("Otvoreni", hset);
//        AUX_CLS.addElementToSet("Kod", hset);
//        AUX_CLS.addElementToSet("Linux", hset);
//        AUX_CLS.addElementToSet("Kripto", hset);
//        AUX_CLS.addElementToSet("Kripto", hset);
//        AUX_CLS.addElementToSet("Otvoreni", lhset);
//        AUX_CLS.addElementToSet("Kod", lhset);
//        AUX_CLS.addElementToSet("Linux", lhset);
//        AUX_CLS.addElementToSet("Kripto", lhset);
//        AUX_CLS.addElementToSet("Otvoreni", tset);
//        AUX_CLS.addElementToSet("Kod", tset);
//        AUX_CLS.addElementToSet("Linux", tset);
//        AUX_CLS.addElementToSet("Kripto", tset);
//        AUX_CLS.removeElement(tset,"Linuxs");
//        AUX_CLS.listElements(tset);

        HashSet<Robot> robots = new HashSet<>();
        AUX_CLS.addElementToSet(new Robot("flying"),robots);
        AUX_CLS.addElementToSet(new Robot("weird"),robots);
        AUX_CLS.addElementToSet(new Robot("cleaning"),robots);
        AUX_CLS.addElementToSet(new Robot("thinking"),robots);
        AUX_CLS.listElements(robots);
        HashMap<Robot,Integer> robotsMap = new HashMap<>();    //Integer; ja biram sto cu, a on mi daje podrsku za koji god ocu
        AUX_CLS.addRobotToMap(robotsMap,new Robot("flying"),30);
        AUX_CLS.addRobotToMap(robotsMap,new Robot("thinking"),50);
        AUX_CLS.addRobotToMap(robotsMap,new Robot("cleaning"),98);
        AUX_CLS.addRobotToMap(robotsMap,new Robot("weird"),68);
        AUX_CLS.listAllMapElements(robotsMap);

    }





}