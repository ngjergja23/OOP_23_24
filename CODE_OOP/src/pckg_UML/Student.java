package pckg_UML;

public class Student extends User{

    @Override
    public boolean activateAccount() {
        return super.activateAccount();
    }

    public int getExam(String course){
        return 5;
    }

    public Student(String userName, String mail, String pass) {
        super(userName, mail, pass);
    }
}
