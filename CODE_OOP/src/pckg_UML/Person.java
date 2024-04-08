package pckg_UML;

import java.util.SplittableRandom;

public class Person {

    // atributi koji su stavljeni private nemogu se dijeliti među klasama koje extendaju
    protected String name;
    protected String surname;
    protected int id;
    protected static int cntID = 100;

    public Person(String name, String surname){

        this.id = cntID++;
        this.name = name;
        this.surname = surname;
        System.out.println(getClass().getSimpleName() + " constructor called");
    }

    public boolean activateAccount(){


        return true;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
