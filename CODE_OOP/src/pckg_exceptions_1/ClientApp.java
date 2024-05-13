package pckg_exceptions_1;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws InputMismatchException {  //kad throwamo onda je propagiramo i kasnije odlucujemo gdje i kada cemo je handleat
//        try {
//            Scanner sc = new Scanner(System.in);
//            double num;
//            System.out.println("Enter one number - double expected: ");
//            num = sc.nextDouble();
//            System.out.println("you have entered: " + num);
//        } catch (InputMismatchException ime){
//            System.out.println("Incorrect input type, throwed: " + ime);
//        }
//        System.out.println("-------------------");
//        Scanner sc = new Scanner(System.in);
//        double num;
//        System.out.println("Enter one number - double expected: ");
//        num = sc.nextDouble();
//        System.out.println("you have entered: " + num);

        String filePath = "CODE_OOP/primjer.txt";

        try {
            ReadContentCls.readFile(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        userAge();
    }
    private static void userAge(){
        Scanner sc = new Scanner(System.in);
        boolean proceedInput = true;
        while (proceedInput){
            try {
                System.out.println("Enter your age: ");
                int age = sc.nextInt();
                if (age < 0) {
                    throw new Exception("Negative values not allowed!");
                } else {
                    System.out.println("age: " + age);
                }
            } catch (InputMismatchException ime) {
                System.out.println("incorrect input - int value expected!");
            } catch (Exception nve) {
                System.out.println(nve.getMessage());
            } finally {
                System.out.println("Enter any number to proceed, other for exit: ");
                if (sc.hasNextInt()){
                    int cont = sc.nextInt();
                    System.out.println("You choose to continue...");
                }else {
                    proceedInput = false;
                    System.out.println("Finished!");
                    sc.close();
                }
            } // nije dobro dozvoliti propagaciju exceptiona do main-a jer bi se tamo mogli nagomilati
        }


    }

}
