package pckg_zad;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

abstract public class Student {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    private Scanner sc = new Scanner(System.in);

    protected static int cntStudents = 0;

    protected void setEnrolmentDate() throws ParseException {
        String date = sc.nextLine();
        this.enrolmentDate = DATE_FORMAT.parse(date);
    }
    public void setScanner(Scanner sc){
        this.sc = sc;
    }

    protected void infoStudent() {
        System.out.println("Student: " + this.name + "id: " + this.idStudent);
        System.out.println("Date: " + this.enrolmentDate.toString());
    }

    protected abstract void completeStudy(int grade);


}
