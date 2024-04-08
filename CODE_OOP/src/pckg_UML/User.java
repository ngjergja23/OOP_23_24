package pckg_UML;

public class User {
    private int id;
    private String userName;
    private String mail;
    private String password;
    private static int cntID = 100;



    public User(String userName, String mail, String pass){
        this.id = cntID++;
        this.userName = userName;
        this.mail = mail;
        this.password = pass;

    }


    public boolean logIn(String pswd,String usName){


        return true;
    }

}
