package pckg_arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private static final int MINI = 10;
    private static final int MAXI = 450;
    private static Scanner sc = new Scanner(System.in);

    public static int[] populateArrayRand(int arrSize){
        int[] arr = new int[arrSize];
        for (int k = 0; k < arrSize; k++){
//             random element
            int numElement = ThreadLocalRandom.current().nextInt(MINI, MAXI);
            arr[k] = numElement;
        }
        return arr;
    }
//
    public static void listItems(int[] arr){
        int size = arr.length;
        for (int k = 0; k < size; k++){
            System.out.println("Element:" + arr[k]);
        }
        System.out.println("--------------------------------------");

    }
//

    public static int[] populateArrayMan(int size){
        int[] arr = new int[size];
        int idx = 0;
        System.out.println("Populating array of size: " + size);

        while(idx < size){
            System.out.println("Please enter one int number: ");
            int number = AUX_CLS.getInt();
            arr[idx] = number;
            idx++;
        }
        return arr;

    }
    private static int getInt(){
        int num = 0;
        boolean checkInput = true;
        while (checkInput){
            try {
                num = sc.nextInt();
                checkInput = false;
                return num;

            }catch (InputMismatchException ime){
                System.out.println("Please provide new input: ");
                sc.nextLine();
            }
        }
        return num;
    }

    public static String linkUsingJoin(String[] strArr){
        String l = String.join(" ", strArr);
        return l;

    }
    public static String linkUsingBuilder(String[] strArr){
        StringBuilder sb = new StringBuilder();
        for (String element : strArr){
            sb.append(element);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static int[][] gen2DArr(int rows, int col) {
        int[][]arr2d = new int[rows][col];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < col; j++){
                int num = ThreadLocalRandom.current().nextInt(MINI,MAXI);
                arr2d[i][j]=num;
            }
        }
        return arr2d;
    }

    public static void list2DArray(int[][] arrd){

        for (int [] elem : arrd){
            System.out.println(Arrays.toString(elem));
        }

    }


}
