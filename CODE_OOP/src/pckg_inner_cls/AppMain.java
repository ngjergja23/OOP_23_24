package pckg_inner_cls;

import java.util.ArrayList;
import java.util.Iterator;

public class AppMain {
    public static void main(String[] args) {
//        ArrayList lst = new ArrayList();
//        lst.add(124);
//        lst.add(345);
//        lst.add("234");
//        lst.add(true);
//
//        for (Object elem : lst){
//            int novi = (Integer) elem*2;   //type casting
//        }
        // pojavi se class casting exception i zbog toga se koristi parametrizacija!

        ArrayList<Integer> lista = new ArrayList();
        lista.add(124);
        lista.add(345);
        lista.add(234);
        lista.add(1);

        Iterator<Integer> iter = lista.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }


        for (Integer elem : lista){
            int novi = elem * 2;
        }

        // check api Itr
        //anonimne unutarnje klase se koriste za realizaciju unutarnjih sučelja
        //lokalna klasa je klasa koja se nalazi unutar metode neke druge klase
        //takva nije klasična unutarnja(inner)

        // Apstraktne klase
        // koje je nikad ne instanciraju, sluza kako bismo kreirali druge klase iz njih
        // publica abstract class, atributi su joj protected kako ih mogu vidjeti metode koje ju nasljeduje
        // mora imati barem jednu apstraktnu metodu
        // u iznimnim slucajevima je dozvoljeno kreirati protected constructor, za konstriuiranje samo dijela




    }
}
