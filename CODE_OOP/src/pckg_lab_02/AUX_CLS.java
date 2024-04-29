package pckg_lab_02;

import java.util.Scanner;

public class AUX_CLS {
    private AUX_CLS(){

    }
    public static String[] genStringArray(int arrSize){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Unesite za "+ i + " element niza: ");
            String el = sc.nextLine();
            arr[i] = el;
        }
        sc.close();
        return arr;
    }

    public static void listArrayElements(String[] stringArr){
        System.out.println("***************** Listing elements *****************");
        for (String s : stringArr) {
            System.out.println(s);
        }
    }

    public static void listArrayElementsAndIndexPos(String[] stringArr){
        System.out.println("***************** Listing index positions and elements *****************");
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println("Index position: " + i + " - element: " + stringArr[i]);
        }
    }

}
