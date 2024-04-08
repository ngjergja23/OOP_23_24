package pckg_equals;

public class User {
    private String UserName;
    private int id;
    private static int cntID = 10;

    public User(String name){
        this.UserName = name;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", id=" + id +
                '}';
    }

    public void showHashCodeAsHex(){
        System.out.println(getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()));
    }

    public String getUserName() {
        return UserName;
    }

    // razlika == i equals je sto equals mozemo overrideati
    // == direktno kompajliraju vrijednosti
    // == sa objektima mozemo koristiti za usporedivanje referenci
    // equals ce dati u ovisnosti kako je definiramo

    @Override
    public boolean equals(Object oth) {
        User other = (User) oth; //type casting, treba izbjegavati
        return this.getUserName().length() == other.getUserName().length();
    }
}
