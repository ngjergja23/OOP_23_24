package pckg_zad;

import java.text.ParseException;
import java.util.Scanner;

public class Client {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PDS_Student studentPD = new PDS_Student("Mirko-PD");
        DS_Students studentD = new DS_Students("23-3-2017");
        studentPD.infoStudent();
        studentPD.setScanner(sc);
        studentD.infoStudent();


    }
}
