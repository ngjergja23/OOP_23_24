package pckg_UML;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("mara" ,"maric");
        Student stud = new Student("pero", "peric");
        Professor prof = new Professor("ivo","ivic");
        //prof.setStudent(stud);
        prof.performConwsultation();
    }
}
