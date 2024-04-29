package pckg_lab_01;

import java.util.Scanner;

public class AppClient {
    static float granica = 100.45f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan realni broj - float: \n");
        Float inpt = sc.nextFloat();
        if (numDec(inpt)){
            System.out.println("Decimal");
            if (inpt > granica){
                System.out.println(inpt + " je veci od granice " + granica);
            }else{
                System.out.println(inpt + " je manji ili jednak od granice " + granica);
            }
        }else{
            System.out.println("non decimal, cjelobrojni");
        }

    }

    static boolean numDec(Float input){
        String num = String.valueOf(input);
        num = num.substring(num.indexOf(".")+1);
        if (Integer.parseInt(num) == 0){
            return false; //3
        }else{
            return true;  //3.1
        }
    }


}
