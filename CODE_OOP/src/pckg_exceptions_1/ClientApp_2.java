package pckg_exceptions_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ClientApp_2 {
    public static void main(String[] args) {
        guessNumber();
    }
    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        int randNum = ThreadLocalRandom.current().nextInt(0,100);
        int cnt = 0;
        boolean cont = true;
        while (cont) {
            try {
                System.out.println("Guess the number: ");
                int guess = sc.nextInt();
                if (guess < randNum) {
                    System.out.println("Number is greater than the guess! Try again");
                } else if (guess > randNum) {
                    System.out.println("Number is lower than the guess! Try again");
                } else {
                    System.out.println("Correct!");
                    cont = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type!");
                cont = false;
            }

        }
        sc.close();
    }
}
