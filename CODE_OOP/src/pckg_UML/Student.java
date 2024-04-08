package pckg_UML;

import javax.sound.midi.Soundbank;

public class Student extends Person{


    public Student(String name, String surname) {

        super(name, surname);
    }



    public void askQuestion(){
        System.out.println("Student: " + this.name + " ask qusetion! ");
    }

    @Override
    public boolean activateAccount() {
        return super.activateAccount();
    }

    public int getExam(String course){
        return 5;
    }


}
