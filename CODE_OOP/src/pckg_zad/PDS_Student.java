package pckg_zad;

import java.text.ParseException;

public class PDS_Student extends Student{
    public PDS_Student(String date) {
        try {
            setEnrolmentDate();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void infoStudent() {
        super.infoStudent();
        System.out.println("Preddiplomski");
    }

    @Override
    protected void completeStudy(int year) {
        if (year < 3){
            System.out.println("Study not completed!");
        }else {
            System.out.println("Study completed! ");
        }


    }
}
