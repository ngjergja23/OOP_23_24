package Zad_0;

 abstract class Person {
    protected int id;
    private static int cntID = 1;
    protected String name;

    public Person(String name) {
        this.name = name;
        this.id = cntID++;
    }

    abstract void definePerson();

}
