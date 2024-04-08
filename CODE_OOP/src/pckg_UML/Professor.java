package pckg_UML;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Professor extends Person {

    private ArrayList<Student> students;


    public Professor(String name, String surname){
        super(name, surname);
        students = new ArrayList<>();
        System.out.println(getClass().getSimpleName() + " constructor called");
    }




    public void performConwsultation(){
        System.out.println(this.getClass().getSimpleName() + " gives lectures ");
        for (Student s : students){
            s.askQuestion();

        }
    }


}
