package pckg_UML_vj;

import java.text.ParseException;

public class MainTest {
    public static void main(String[] args) {
        try {
            Vehicle v1 = new Vehicle("bmw","m5","23.11.2012");
            v1.info();
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
