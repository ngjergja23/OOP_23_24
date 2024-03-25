package pckg_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

    private static Scanner scanner = new Scanner(System.in);

    private static int value;
    private static String name;
    private static String[] names = new String[5];

    public static void main(String[] args) {
        int[] ints = new int[10];
        int[] newInts = {10, 20, 30, 40};
        System.out.println("1. niz: " + ints.length);
        System.out.println("2. niz: " + newInts.length);
        System.out.println(ints[3]);
        System.out.println(newInts[3]);

        changeElement(names,2);
        System.out.println(names[2]);

        for (int k = 0; k < ints.length; k++) {
            ints[k] = k + 1;
        }


        populateStringNames(names);
        listElements(names);
      }

    private static void changeElement(String[] nume,int idx){
        String newName = "Novo ime";
        if (idx <= nume.length-1){
            names[idx] = newName;
            System.out.println("changed...");
        }else {
            System.out.println("Index out of bounds!");
        }
    }

    private static void populateStringNames(String[] numeOpet){
        int cnt = 0;
        String name;

        while (cnt <= numeOpet.length-1){
            System.out.println("Unesi ime: ");
            name = scanner.nextLine();
            numeOpet[cnt] = name;
            cnt++;
        }
        System.out.println("Finished!");
    }

    private static void listElements(String[] names){
        for (int k = 0;k < names.length;k++){
            System.out.println("Name: " + names[k]);
        }
    }

}