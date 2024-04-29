package pckg_zad;

import java.text.ParseException;

public class DS_Students extends Student {

    public DS_Students(String date) {
        try {
            setEnrolmentDate();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }


    @Override
    protected void infoStudent() {
        super.infoStudent();
        System.out.println("Diplomski");
    }

    @Override
    protected void completeStudy(int yearOfStudy) {
        if (yearOfStudy < 2){
            System.out.println("Study not completed! ");
        }else {
            System.out.println("Study completed! ");
        }

    }
}
