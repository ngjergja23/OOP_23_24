package pckg_vj_7;

import pckg_collections_2.LengthStringComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class MainApp {
    final static int MINI = 10;
    final static int MAXI = 300;
    public static void main(String[] args) {
        ArrayList<String> vehs = new ArrayList<>();
        vehs.add("jedrilica");
        vehs.add("električni romobil");
        vehs.add("auto");
        vehs.add("bicikla");
        vehs.add("helikopter");
        vehs.add("motor");
        System.out.println(vehs);
        Collections.sort(vehs, new StringComparator());
        System.out.println(vehs);

        ArrayList<Integer> numInts = generateIntList(5);
        System.out.println(numInts);
        Collections.sort(numInts);
        System.out.println(numInts);

    }
    private static int generateRandomInt(){
        return ThreadLocalRandom.current().nextInt(MINI,MAXI+1);

    }

    public static ArrayList<Integer> generateIntList(int numInts){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numInts; i++) {
            nums.add(generateRandomInt());
        }
        return nums;
    }



}
