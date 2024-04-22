package pckg_vecera_main_part;

import pckg_outsource_vecera.Desert;
import pckg_outsource_vecera.Predjelo;
import pckg_outsource_vecera.PredjeloNovo;

public class Vecera {


    public static void main(String[] args) {
        Predjelo predjelo = new Predjelo("Cezar", "salata",2);
        GlavnoJelo glavnoJelo = new GlavnoJelo();
        Desert desert = new Desert("Cheesecake",2);

        predjelo.pojediPredjelo("Cez");
        float cijena = glavnoJelo.totalPrice();

        // kad nije korišten modifikator pristupa onda je vidljiv samo unutar paketa
        // izbjegavati bez!


        // kad je private -> potpuna enkapsulacija

        PredjeloNovo pn = new PredjeloNovo("grčka","salata",2,"main");
        pn.pojediPredjelo("grk");


    }


}
